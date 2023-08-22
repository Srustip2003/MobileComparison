package signupform;
import java.sql.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField usern;
	private JPasswordField pwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 962, 672);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" USERNAME :");
		lblNewLabel.setBounds(336, 112, 168, 38);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JLabel lblPassword = new JLabel("PASSWORD :");
		lblPassword.setBounds(347, 215, 179, 34);
		panel.add(lblPassword);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPassword.setForeground(Color.BLACK);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(435, 307, 136, 53);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
				//String user=usern.getText();
				//String password=pwd.getText();
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
				 Statement st=con.createStatement();
				 String sql="Select * from signup where username='"+usern.getText()+"' and password='"+pwd.getText().toString()+"'";
				 ResultSet rs=st.executeQuery(sql);
				 if(rs.next()) {
					 JOptionPane.showMessageDialog(null, "Login Successfull");
					  setVisible(false);
					    new successpage().setVisible(true);
					 
				 }else {
					 JOptionPane.showMessageDialog(null, "Invalid details");
					 con.close();
				 }
			 }catch(Exception e1) {
					 System.out.print(e1);
				 }
				
			}
//			private Object connection;
////			private Object preparedstatement;
//
////			public void actionPerformed1(ActionEvent e) {
////				 try {
////					//String user=usern.getText();
////					//String password=pwd.getText();
////					
////					Class.forName("com.mysql.cj.jdbc.Driver");
////					 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","");
////					 Statement st=con.createStatement();
////					 String sql="Select * from signup where username='"+usern.getText()+"' and password='"+pwd.getText().toString()+"'";
////					 ResultSet rs=st.executeQuery(sql);
////					 if(rs.next()) {
////						 JOptionPane.showMessageDialog(null, "Login Successfull");
////						 
////					 }else {
////						 JOptionPane.showMessageDialog(null, "Invalid details");
////						 con.close();
////					 }
////				 }catch(Exception e1) {
////						 System.out.print(e1);
////					 }
//				    
//				
//				   
//				    }
//				    
//				    
//								    	
//				
//				    
				    
				
						}
		);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.setBounds(631, 417, 140, 53);
		panel.add(btnSignUp);
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new signup().setVisible(true);
			}
		});
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblNewLabel_2 = new JLabel("Dont have an account?");
		lblNewLabel_2.setBounds(461, 439, 161, 17);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		pwd = new JPasswordField();
		pwd.setBounds(560, 217, 211, 38);
		panel.add(pwd);
		pwd.setBackground(new Color(245, 245, 245));
		pwd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		usern = new JTextField();
		usern.setBounds(560, 116, 211, 38);
		panel.add(usern);
		usern.setBackground(new Color(245, 245, 245));
		usern.setForeground(new Color(0, 0, 0));
		usern.setFont(new Font("Tahoma", Font.PLAIN, 16));
		usern.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setBounds(332, 10, 131, 53);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Sitka Heading", Font.BOLD, 40));
		
		JButton btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.setBounds(631, 308, 131, 53);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null,"Do you really want to exit","Select",JOptionPane.YES_NO_OPTION);
				if(a==0)
					System.exit(0);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new home().setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\91810\\Pictures\\Screenshots\\Screenshot (192).png"));
		btnNewButton_2.setBounds(860, 0, 78, 38);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\91810\\Pictures\\Screenshots\\Screenshot (175).png"));
		lblNewLabel_3.setBounds(0, 0, 938, 615);
		panel.add(lblNewLabel_3);
	}
}

