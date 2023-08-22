package signupform;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class category extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					category frame = new category();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public category() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1283, 704);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(282, 88, 245, 36);
		comboBox.addItem("Samsung");
		comboBox.addItem("OnePlus");
		comboBox.addItem("Xiaomi");
		comboBox.addItem("Vivo");
		comboBox.setSelectedItem(null);
		contentPane.add(comboBox);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 246, 1232, 240);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"mobile", "network", "display", "simslots", "battery", "colours", "storage", "ram", "camera", "performance", "price"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(105);
		table.getColumnModel().getColumn(0).setMinWidth(23);
		table.getColumnModel().getColumn(5).setPreferredWidth(77);
		table.getColumnModel().getColumn(5).setMinWidth(20);
		table.getColumnModel().getColumn(6).setPreferredWidth(53);
		table.getColumnModel().getColumn(7).setPreferredWidth(49);
		
		btnNewButton_1 = new JButton("Search");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(208, 147, 116, 36);
		btnNewButton_1.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				//String query="select mobile,network from info where mobile=?";
				String model=(String)comboBox.getSelectedItem();
				
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("JDBC:MYSQL://localhost:3306/login","root","");
					java.sql.Statement st=con.createStatement();
					ResultSet rs=((java.sql.Statement) st).executeQuery("select mobile,network,display,simslots,battery,colours,storage,ram,camera,performance,price from details where model='"+model+"'");
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}
				catch(Exception e1) {
					
				}
			}
		});
		contentPane.add(btnNewButton_1);
		
		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(827, 88, 243, 36);
		comboBox_1.addItem("10,000-20,000");
		comboBox_1.addItem("20,000-30,000");
		comboBox_1.addItem("30,000-40,000");
		comboBox_1.addItem("40,000-50,000");
		comboBox_1.addItem("50,000-60,000");
		comboBox_1.addItem("60,000-70,000");
		comboBox_1.setSelectedItem(null);
		contentPane.add(comboBox_1);
		
		btnNewButton_2 = new JButton("Search");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_2.setBounds(805, 147, 116, 36);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pricerange=(String)comboBox_1.getSelectedItem();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("JDBC:MYSQL://localhost:3306/login","root","");
					java.sql.Statement st=con.createStatement();
					ResultSet rs=((java.sql.Statement) st).executeQuery("select mobile,network,display,simslots,battery,colours,storage,ram,camera,performance,price from details where pricerange='"+pricerange+"'");
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}
				catch(Exception e1) {
					
				}
			}
		});
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Compare by Models");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(10, 82, 243, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Compare by Price");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(595, 82, 217, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Compare by categories");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel_2.setBounds(27, 10, 346, 45);
		contentPane.add(lblNewLabel_2);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			    new successpage().setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\91810\\Pictures\\Screenshots\\Screenshot (192).png"));
		btnNewButton.setBounds(1221, 0, 59, 36);
		contentPane.add(btnNewButton);
	}
}
