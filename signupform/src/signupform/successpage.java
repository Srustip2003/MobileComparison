package signupform;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;

public class successpage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					successpage frame = new successpage();
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
	public successpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1225, 759);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 5, 1234, 807);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("image");
		lblNewLabel_1.setBounds(10, 69, 1177, 243);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\91810\\Pictures\\Screenshots\\image.jpg.png"));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("About Us");
		lblNewLabel_2.setBounds(536, 310, 168, 34);
		lblNewLabel_2.setForeground(new Color(255, 99, 71));
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		panel.add(lblNewLabel_2);
		
		JTextPane txtpnWeShowAll = new JTextPane();
		txtpnWeShowAll.setBounds(125, 343, 1000, 56);
		txtpnWeShowAll.setForeground(new Color(0, 0, 0));
		txtpnWeShowAll.setBackground(Color.WHITE);
		txtpnWeShowAll.setText("We show all phone availabilities and their features you can even see comparison between any two phones you want with no confusion left behind in choosing phones. Decide the best one for you .");
		txtpnWeShowAll.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(txtpnWeShowAll);
		
		JLabel lblNewLabel_3 = new JLabel("BEST WAY OF COMPARING SMARTPHONES");
		lblNewLabel_3.setBounds(291, 405, 635, 37);
		lblNewLabel_3.setFont(new Font("Algerian", Font.PLAIN, 32));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(363, 445, 751, 271);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\91810\\Pictures\\Screenshots\\Screenshot (10).png"));
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 480, 385, 236);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\91810\\Pictures\\Screenshots\\riyanewScreenshot (8).jpg"));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("MOBILE COMPARING");
		lblNewLabel_5.setBounds(0, 13, 469, 46);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Compare Phones");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  setVisible(false);
				    new sawant().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(479, 13, 200, 34);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("All Phones");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  setVisible(false);
				    new category().setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(675, 13, 191, 34);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Recommendations");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  setVisible(false);
				    new popularphones().setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(864, 13, 191, 34);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Logout");
		btnNewButton_3.addActionListener(new ActionListener() {
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
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3.setBounds(1053, 13, 134, 34);
		panel.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 5, 1197, 65);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
	}
}
