package signupform;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;

public class signup extends JFrame {

	private JPanel contentPane;
	private JTextField firstn;
	private JTextField lastn;
	private JTextField usern;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup frame = new signup();
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
	Connection con=null;
	private JTextField email;
	public signup() {
		
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 986, 690);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		firstn = new JTextField();
		firstn.setBounds(575, 113, 240, 40);
		panel.add(firstn);
		firstn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		firstn.setColumns(10);
		
		lastn = new JTextField();
		lastn.setBounds(575, 195, 240, 40);
		panel.add(lastn);
		lastn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lastn.setColumns(10);
		
		usern = new JTextField();
		usern.setBounds(575, 285, 240, 40);
		panel.add(usern);
		usern.setFont(new Font("Tahoma", Font.PLAIN, 20));
		usern.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(575, 374, 240, 40);
		panel.add(pass);
		pass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		email = new JTextField();
		email.setBounds(575, 459, 240, 40);
		panel.add(email);
		email.setColumns(10);
		
		JButton btnNewButton = new JButton("SIGN UP");
		btnNewButton.setBounds(617, 527, 166, 60);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first=firstn.getText();
				String last=lastn.getText();
				String user=usern.getText();
				String password=pass.getText();
				String emailid=email.getText();
				
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
				    Statement st=con.createStatement();
				    st.executeUpdate("insert into signup(firstname,lastname,username,password,emailid)values('"+first+"','"+last+"','"+user+"','"+password+"','"+emailid+"')");
				    JOptionPane.showMessageDialog(null,"Successfully inserted");
				    setVisible(false);
				    new login().setVisible(true);
				    

				    st.close();
				}
				catch(Exception evt)
				{
					JOptionPane.showMessageDialog(null,"This already exists");
					setVisible(false);
					new login().setVisible(true);
					
				} 
					
			}
			
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JLabel lblNewLabel = new JLabel("FIRST NAME :");
		lblNewLabel.setBounds(355, 105, 155, 50);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblLastName = new JLabel("LAST NAME :");
		lblLastName.setBounds(355, 195, 155, 50);
		panel.add(lblLastName);
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblUsername = new JLabel("USERNAME :");
		lblUsername.setBounds(355, 287, 155, 50);
		panel.add(lblUsername);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD :");
		lblNewLabel_1.setBounds(355, 388, 155, 31);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblNewLabel_5 = new JLabel("EMAIL ID :");
		lblNewLabel_5.setBounds(355, 457, 137, 42);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblNewLabel_2 = new JLabel("SIGN UP");
		lblNewLabel_2.setBounds(323, 10, 205, 51);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(893, 0, 69, 40);
		panel.add(btnNewButton_1);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\91810\\Pictures\\Screenshots\\Screenshot (192).png"));
		btnNewButton_1.setForeground(Color.BLACK);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\91810\\Pictures\\Screenshots\\Screenshot (175).png"));
		lblNewLabel_3.setBounds(0, 0, 968, 660);
		panel.add(lblNewLabel_3);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new login().setVisible(true);
				
			}
			
		});
	}
}
