package signupform;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class comparephones extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	protected Component label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					comparephones frame = new comparephones();
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
	public comparephones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1060, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 10, 240, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(652, 10, 221, 35);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.addActionListener(new ActionListener() {
			 {
				
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String mobile=textField.getText();
				 try{   
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("JDBC:MYSQL://localhost:3306/explain","root","");
//				                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_images","root","");
				                java.sql.Statement st = con.createStatement();
				                ResultSet rs = st.executeQuery("select * from info where mobile = '"+mobile+"'");
				                if(rs.next()){
				                
				                    textField_2.setText(rs.getString(2));
				                    textField_3.setText(rs.getString(3));
				                    textField_4.setText(rs.getString(4));
				                    textField_5.setText(rs.getString(5));
				                    textField_6.setText(rs.getString(6));
				                    textField_7.setText(rs.getString(7));
				                    textField_8.setText(rs.getString(8));
				                    textField_9.setText(rs.getString(9));
				                    textField_10.setText(rs.getString(10));
				                    textField_11.setText(rs.getString(11));
				                    
				                    
				                }
				                
				                else{
				                    JOptionPane.showMessageDialog(null, "No Data");
				                }
				            }catch(Exception ex){
				                ex.printStackTrace();
				            }
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(276, 7, 106, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SEARCH");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(909, 10, 106, 35);
		contentPane.add(btnNewButton_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(100, 55, 150, 149);
		contentPane.add(label_2);
		
		JLabel lblNewLabel_2 = new JLabel("NETWORK");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 236, 106, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("DISPLAY");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(10, 287, 71, 27);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("SIM SLOTS");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(10, 335, 85, 27);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("BATTERY");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_3.setBounds(10, 384, 85, 27);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("COLOURS");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_4.setBounds(10, 431, 85, 27);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("STORAGE");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_5.setBounds(10, 472, 85, 27);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("RAM");
		lblNewLabel_2_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_6.setBounds(10, 522, 71, 27);
		contentPane.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_7 = new JLabel("CAMERA");
		lblNewLabel_2_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_7.setBounds(10, 570, 71, 27);
		contentPane.add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_2_8 = new JLabel("PERFORMANCE");
		lblNewLabel_2_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_8.setBounds(10, 617, 122, 27);
		contentPane.add(lblNewLabel_2_8);
		
		JLabel lblNewLabel_2_9 = new JLabel("PRICE");
		lblNewLabel_2_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_9.setBounds(10, 662, 71, 27);
		contentPane.add(lblNewLabel_2_9);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_2.setBounds(145, 236, 141, 27);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(145, 287, 141, 27);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(145, 341, 141, 27);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_5.setColumns(10);
		textField_5.setBounds(145, 390, 141, 27);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_6.setColumns(10);
		textField_6.setBounds(145, 437, 141, 27);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_7.setColumns(10);
		textField_7.setBounds(145, 474, 141, 27);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_8.setColumns(10);
		textField_8.setBounds(145, 526, 141, 27);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_9.setColumns(10);
		textField_9.setBounds(145, 576, 141, 27);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_10.setColumns(10);
		textField_10.setBounds(145, 623, 141, 27);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_11.setColumns(10);
		textField_11.setBounds(145, 668, 141, 27);
		contentPane.add(textField_11);
	}

}
