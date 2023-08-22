package signupform;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class adminlogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminlogin frame = new adminlogin();
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
	public adminlogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 838, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 836, 631);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADMIN LOGIN");
		lblNewLabel.setBounds(273, 10, 349, 53);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 45));
		
		textField = new JTextField();
		textField.setBounds(520, 144, 236, 37);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(520, 238, 236, 37);
		panel.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Username :");
		lblNewLabel_1.setBounds(330, 143, 139, 27);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		JLabel lblNewLabel_2 = new JLabel("Password :");
		lblNewLabel_2.setBounds(330, 234, 139, 32);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(417, 371, 152, 51);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				String user=textField.getText();
				String password=passwordField.getText();
				
				if(user.contains("Riya")&&password.contains("20104078"))
				{
					textField.setText(null);
					passwordField.setText(null);
					adminpage.info=new adminpage();
					adminpage.main(null);
				}
				else if(user.contains("Tanishq")&&password.contains("20104078"))
				{
					textField.setText(null);
					passwordField.setText(null);
					adminpage.info=new adminpage();
					adminpage.main(null);
				}
				else if(user.contains("Srusti")&&password.contains("20104078"))
				{
					textField.setText(null);
					passwordField.setText(null);
					adminpage.info=new adminpage();
					adminpage.main(null);
				}
				else if(user.contains("Ritvik")&&password.contains("20104078"))
				{
					textField.setText(null);
					passwordField.setText(null);
					adminpage.info=new adminpage();
					adminpage.main(null);
				}
				else {
					JOptionPane.showMessageDialog(null,"Invalid Login Credentials","Login Error",JOptionPane.ERROR_MESSAGE);
					textField.setText(null);
					passwordField.setText(null);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.setBounds(660, 378, 122, 41);
		panel.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\91810\\Pictures\\Screenshots\\Screenshot (175).png"));
		lblNewLabel_3.setBounds(0, 0, 826, 631);
		panel.add(lblNewLabel_3);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
