package signupform;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Allphones extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Allphones frame = new Allphones();
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
	public Allphones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1272, 769);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 1258, 732);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(400, 81, 127, 32);
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 20));
		panel.add(btnNewButton);
		
		final JLabel label = new JLabel("");
		label.setBounds(20, 154, 462, 568);
		panel.add(label);
		
		textField = new JTextField();
		textField.setBounds(77, 83, 298, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(825, 87, 292, 30);
		panel.add(textField_1);
		textField_1.setColumns(10);
		final JLabel newlabel = new JLabel("");
		newlabel.setBounds(724, 154, 462, 551);
		panel.add(newlabel);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.setBounds(1127, 81, 121, 32);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try{   
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("JDBC:MYSQL://localhost:3306/project","root","");
//				                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_images","root","");
				                java.sql.Statement st = con.createStatement();
				                ResultSet rs = st.executeQuery("select * from details where mobile = '"+textField_1.getText()+"'");
				                if(rs.next()){
				                    byte[] img = rs.getBytes("Image");



				                    //Resize The ImageIcon
				                    ImageIcon image = new ImageIcon(img);
				                    Image im = image.getImage();
				                    Image myImg = im.getScaledInstance(newlabel.getWidth(),newlabel.getHeight(),Image.SCALE_SMOOTH);
				                    ImageIcon newImage = new ImageIcon(myImg);
				                    newlabel.setIcon(newImage);
				                }
				                
				                else{
				                    JOptionPane.showMessageDialog(null, "No Data");
				                }
				            }catch(Exception ex){
				                ex.printStackTrace();
				            }
				
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(502, 292, 193, 293);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\91810\\Pictures\\Screenshots\\Screenshot (54).png"));
		panel.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(1194, 0, 64, 42);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new successpage().setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\91810\\Pictures\\Screenshots\\Screenshot (192).png"));
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(20, 10, 432, 47);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Search Mobile Phones to Compare");
		lblNewLabel_2.setFont(new Font("Century", Font.BOLD, 35));
		lblNewLabel_2.setBounds(20, 10, 620, 47);
		panel.add(lblNewLabel_2);
		
//		JLabel newlabel = new JLabel("New label");
//		newlabel.setBounds(724, 154, 462, 551);
//		panel.add(newlabel);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try{   
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("JDBC:MYSQL://localhost:3306/project","root","");
//		                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_images","root","");
		                java.sql.Statement st = con.createStatement();
		                ResultSet rs = st.executeQuery("select * from details where mobile = '"+textField.getText()+"'");
		                if(rs.next()){
		                    byte[] img = rs.getBytes("Image");



		                    //Resize The ImageIcon
		                    ImageIcon image = new ImageIcon(img);
		                    Image im = image.getImage();
		                    Image myImg = im.getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_SMOOTH);
		                    ImageIcon newImage = new ImageIcon(myImg);
		                    label.setIcon(newImage);
		                }
		                
		                else{
		                    JOptionPane.showMessageDialog(null, "No Data");
		                }
		            }catch(Exception ex){
		                ex.printStackTrace();
		            }
			}
		});
	}
}
