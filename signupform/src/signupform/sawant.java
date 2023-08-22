package signupform;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class sawant extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JLabel lblBattery;
	private JLabel lblSimSlots;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblPerformance;
	private JLabel lblPrice;
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
	private JButton btnNewButton_1;
	private JTextField textField;
	private JLabel label_1;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblBattery_1;
	private JLabel lblColours;
	private JLabel lblStorage;
	private JLabel lblRam;
	private JLabel lblCamera;
	private JLabel lblPerformance_1;
	private JLabel lblPrice_1;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JLabel lblNewLabel_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sawant frame = new sawant();
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
	public sawant() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1077, 772);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Network");
		lblNewLabel.setBounds(27, 250, 142, 36);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblNewLabel);
		
		final JLabel label = new JLabel("");
		label.setBounds(149, 54, 127, 174);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.setBounds(10, 10, 119, 36);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mobile=textField_1.getText();
				 try{   
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("JDBC:MYSQL://localhost:3306/login","root","");
//				                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_images","root","");
				                java.sql.Statement st = con.createStatement();
				                ResultSet rs = st.executeQuery("select * from details where mobile = '"+mobile+"'");
				                if(rs.next()){
				                    byte[] img = rs.getBytes("Image");
				                    //Resize The ImageIcon
				                    ImageIcon image = new ImageIcon(img);
				                    Image im = image.getImage();
				                    Image myImg = im.getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_SMOOTH);
				                    ImageIcon newImage = new ImageIcon(myImg);
				                    label.setIcon(newImage);
				                    textField_11.setText(rs.getString(3));
				                    textField_2.setText(rs.getString(4));
				                    textField_3.setText(rs.getString(5));
				                    textField_4.setText(rs.getString(6));
				                    textField_5.setText(rs.getString(7));
				                    textField_6.setText(rs.getString(8));
				                    textField_7.setText(rs.getString(9));
				                    textField_8.setText(rs.getString(10));
				                    textField_9.setText(rs.getString(11));
				                    textField_10.setText(rs.getString(12));
				                    
				                    
				                }
				                
				                else{
				                    JOptionPane.showMessageDialog(null, "No Data");
				                }
				            }catch(Exception ex){
				                ex.printStackTrace();
				            }
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(139, 10, 266, 34);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblBattery = new JLabel("Battery");
		lblBattery.setBounds(27, 388, 127, 36);
		lblBattery.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblBattery);
		
		lblSimSlots = new JLabel("SIM Slots");
		lblSimSlots.setBounds(27, 342, 127, 36);
		lblSimSlots.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblSimSlots);
		
		lblNewLabel_3 = new JLabel("Display");
		lblNewLabel_3.setBounds(27, 296, 127, 36);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_1 = new JLabel("Colours");
		lblNewLabel_1.setBounds(27, 449, 85, 25);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Storage");
		lblNewLabel_2.setBounds(27, 484, 127, 36);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_4 = new JLabel("RAM");
		lblNewLabel_4.setBounds(27, 530, 127, 36);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Camera");
		lblNewLabel_5.setBounds(27, 582, 127, 36);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblNewLabel_5);
		
		lblPerformance = new JLabel("Performance");
		lblPerformance.setBounds(27, 628, 127, 36);
		lblPerformance.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblPerformance);
		
		lblPrice = new JLabel("Price");
		lblPrice.setBounds(27, 674, 127, 36);
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblPrice);
		
		textField_2 = new JTextField();
		textField_2.setBounds(195, 305, 248, 25);
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(195, 353, 248, 23);
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(195, 398, 248, 25);
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(195, 452, 248, 25);
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(195, 494, 248, 25);
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(195, 540, 248, 25);
		textField_7.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(195, 591, 248, 25);
		textField_8.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(195, 639, 248, 23);
		textField_9.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(195, 683, 248, 23);
		textField_10.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(192, 260, 251, 25);
		textField_11.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		btnNewButton_1 = new JButton("Search");
		btnNewButton_1.setBounds(579, 13, 101, 33);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mobile=textField.getText();
				 try{   
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("JDBC:MYSQL://localhost:3306/login","root","");
//				                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_images","root","");
				                java.sql.Statement st = con.createStatement();
				                ResultSet rs = st.executeQuery("select * from details where mobile = '"+mobile+"'");
				                if(rs.next()){
				                    byte[] img = rs.getBytes("Image");
				                    //Resize The ImageIcon
				                    ImageIcon image = new ImageIcon(img);
				                    Image im = image.getImage();
				                    Image myImg = im.getScaledInstance(label_1.getWidth(),label_1.getHeight(),Image.SCALE_SMOOTH);
				                    ImageIcon newImage = new ImageIcon(myImg);
				                    label_1.setIcon(newImage);
				                    textField_12.setText(rs.getString(3));
				                    textField_13.setText(rs.getString(4));
				                    textField_14.setText(rs.getString(5));
				                    textField_15.setText(rs.getString(6));
				                    textField_16.setText(rs.getString(7));
				                    textField_17.setText(rs.getString(8));
				                    textField_18.setText(rs.getString(9));
				                    textField_19.setText(rs.getString(10));
				                    textField_20.setText(rs.getString(11));
				                    textField_21.setText(rs.getString(12));
				                    
				                    
				                }
				                
				                else{
				                    JOptionPane.showMessageDialog(null, "No Data");
				                }
				            }catch(Exception ex){
				                ex.printStackTrace();
				            }
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(708, 10, 262, 36);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(textField);
		textField.setColumns(10);
		
		label_1 = new JLabel("");
		label_1.setBounds(663, 51, 127, 188);
		contentPane.add(label_1);
		
		lblNewLabel_6 = new JLabel("Network");
		lblNewLabel_6.setBounds(598, 250, 127, 36);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Display");
		lblNewLabel_7.setBounds(598, 309, 127, 36);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("SIM Slots");
		lblNewLabel_8.setBounds(598, 361, 127, 36);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblNewLabel_8);
		
		lblBattery_1 = new JLabel("Battery");
		lblBattery_1.setBounds(598, 397, 127, 36);
		lblBattery_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblBattery_1);
		
		lblColours = new JLabel("Colours");
		lblColours.setBounds(598, 443, 127, 36);
		lblColours.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblColours);
		
		lblStorage = new JLabel("Storage");
		lblStorage.setBounds(598, 484, 127, 36);
		lblStorage.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblStorage);
		
		lblRam = new JLabel("RAM");
		lblRam.setBounds(598, 530, 127, 36);
		lblRam.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblRam);
		
		lblCamera = new JLabel("Camera");
		lblCamera.setBounds(598, 582, 127, 36);
		lblCamera.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblCamera);
		
		lblPerformance_1 = new JLabel("Performance");
		lblPerformance_1.setBounds(598, 628, 127, 36);
		lblPerformance_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblPerformance_1);
		
		lblPrice_1 = new JLabel("Price");
		lblPrice_1.setBounds(608, 674, 127, 36);
		lblPrice_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblPrice_1);
		
		textField_12 = new JTextField();
		textField_12.setBounds(777, 259, 251, 25);
		textField_12.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(777, 309, 251, 25);
		textField_13.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(777, 351, 251, 23);
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(777, 399, 251, 25);
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(777, 449, 251, 26);
		textField_16.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(777, 495, 251, 25);
		textField_17.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(777, 541, 251, 25);
		textField_18.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setBounds(777, 593, 251, 25);
		textField_19.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setBounds(777, 642, 251, 25);
		textField_20.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setBounds(777, 683, 251, 25);
		textField_21.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(textField_21);
		textField_21.setColumns(10);
		
		lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(453, 321, 119, 183);
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\91810\\Pictures\\Screenshots\\newvs.png"));
		contentPane.add(lblNewLabel_9);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new successpage().setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\91810\\Pictures\\Screenshots\\Screenshot (192).png"));
		btnNewButton_2.setBounds(991, 8, 72, 36);
		contentPane.add(btnNewButton_2);
	}
}
