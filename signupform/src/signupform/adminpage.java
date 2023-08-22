package signupform;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;

public class adminpage extends JFrame {

	protected static adminpage info;
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
	private JTextField textField_12;
	private JTextField img_text;
	private ImageIcon format=null;
	String filename=null;
	byte[]image=null; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminpage frame = new adminpage();
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
	public adminpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Model");
		lblNewLabel.setBounds(10, 83, 100, 26);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mobile");
		lblNewLabel_1.setBounds(10, 132, 100, 26);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Network");
		lblNewLabel_2.setBounds(10, 181, 100, 26);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Display");
		lblNewLabel_3.setBounds(10, 231, 100, 26);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("SIM Slots");
		lblNewLabel_4.setBounds(10, 280, 100, 26);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Battery");
		lblNewLabel_5.setBounds(10, 334, 100, 26);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Colour");
		lblNewLabel_6.setBounds(10, 384, 100, 32);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Storage");
		lblNewLabel_7.setBounds(10, 436, 100, 32);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("RAM");
		lblNewLabel_8.setBounds(10, 495, 100, 32);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Camera");
		lblNewLabel_9.setBounds(10, 537, 100, 32);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Performance");
		lblNewLabel_10.setBounds(10, 579, 126, 32);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Price");
		lblNewLabel_11.setBounds(10, 634, 100, 26);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Price-Range");
		lblNewLabel_12.setBounds(10, 687, 116, 26);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Image");
		lblNewLabel_13.setBounds(622, 412, 84, 26);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 17));
		contentPane.add(lblNewLabel_13);
		
		final JLabel label = new JLabel("");
		label.setBounds(618, 83, 257, 265);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("Browse");
		btnNewButton.setBounds(716, 396, 142, 42);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser=new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				String fileName=f.getAbsolutePath();
				img_text.setText(fileName);
				Image getAbsolutePath=null;
				ImageIcon icon=new ImageIcon(fileName);
				 Image image = icon.getImage().getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_SMOOTH);
				//Image image=icon.getImage().getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_SMOOTH);
				label.setIcon(icon);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(170, 83, 202, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(170, 135, 202, 26);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(170, 184, 202, 26);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(170, 234, 202, 26);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(170, 283, 202, 26);
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(170, 337, 202, 26);
		textField_5.setColumns(10);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(170, 387, 202, 25);
		textField_6.setColumns(10);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(170, 442, 202, 25);
		textField_7.setColumns(10);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBounds(170, 490, 202, 25);
		textField_8.setColumns(10);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBounds(170, 537, 202, 25);
		textField_9.setColumns(10);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setBounds(170, 585, 202, 25);
		textField_10.setColumns(10);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(170, 637, 202, 26);
		textField_11.setColumns(10);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setBounds(170, 690, 202, 26);
		textField_12.setColumns(10);
		contentPane.add(textField_12);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.setBounds(521, 523, 100, 42);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("JDBC:MYSQL://localhost:3306/phone","root","");
			               // Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/db_images","root","");
			                Statement st = con.createStatement();
			                String model=textField.getText();
			                String mobile=textField_1.getText();
			                String network=textField_2.getText();
			                String display=textField_3.getText();
			                String simslots=textField_4.getText();
			                String battery=textField_5.getText();
			                String colours=textField_6.getText();
			                String storage=textField_7.getText();
			                String ram=textField_8.getText();
			                String camera=textField_9.getText();
			                String performance=textField_10.getText();
			                String price=textField_11.getText();
			                String pricerange=textField_12.getText();
			                String image=img_text.getText();
			                image=image.replace("\\","\\\\");
			                System.out.println(image);
			                
			                String sql="INSERT INTO info(model ,mobile, network ,display ,simslots, battery, colours, storage, ram, camera, performance, price, pricerange ,image)values('"+model+"','"+mobile+"','"+network+"','"+display+"','"+simslots+"','"+battery+"','"+colours+"','"+storage+"','"+ram+"','"+camera+"','"+performance+"','"+price+"','"+pricerange+"','"+image+"')";
			                st.executeUpdate(sql);
			                JOptionPane.showMessageDialog(null,"Successful");
				}catch(Exception ex) {
//					Logger.getLogger(ImageUpload.class.getName().log(Level.SEVERE,null,ex)); 
					System.out.println(ex);
					setVisible(false);
					new home().setVisible(true);
					
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(btnNewButton_1);
		
		img_text = new JTextField();
		img_text.setBounds(618, 367, 257, 19);
		contentPane.add(img_text);
		img_text.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("ADD MOBILE PHONE DETAILS");
		lblNewLabel_14.setFont(new Font("Arial Black", Font.PLAIN, 38));
		lblNewLabel_14.setBounds(10, 10, 757, 52);
		contentPane.add(lblNewLabel_14);
		
		final JButton btnNewButton_2 = new JButton("Logout");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame home=new JFrame("Logout");
				if(JOptionPane.showConfirmDialog(home, "Do You Want to logout?","Login error",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					setVisible(false);
				    new home().setVisible(true);
					//					home info=new home();
//					((home) home).main(null);
					
				}else {
					
				}
				}
//				setVisible(false);
//				new success().setVisible(true);
			
		});
		btnNewButton_2.setIcon(null);
		btnNewButton_2.setBounds(831, 0, 93, 32);
		contentPane.add(btnNewButton_2);
	}
}
