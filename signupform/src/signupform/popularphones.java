package signupform;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.SwingConstants;

public class popularphones extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					popularphones frame = new popularphones();
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
	public popularphones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1284, 763);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 1270, 726);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Here are Popular Mobile Phone Comparison ");
		lblNewLabel.setBounds(10, 0, 798, 52);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 32));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(SystemColor.scrollbar);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 52, 628, 673);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Compare");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new compare1().setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 200, 0));
		btnNewButton_1.setBounds(234, 174, 144, 37);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Compare");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new compare2().setVisible(true);
			}
		});
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setBounds(235, 404, 161, 43);
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\91810\\Pictures\\Screenshots\\Screenshot (149).png"));
		lblNewLabel_3.setBounds(10, 451, 617, 178);
		panel_1.add(lblNewLabel_3);
		
		JButton btnNewButton_3 = new JButton("Compare");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new compare3().setVisible(true);
			}
		});
		btnNewButton_3.setBackground(Color.ORANGE);
		btnNewButton_3.setBounds(235, 630, 161, 43);
		panel_1.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\91810\\Pictures\\Screenshots\\Screenshot (145).png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, -11, 648, 206);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(10, 209, 608, 185);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\91810\\Pictures\\Screenshots\\Screenshot (147).png"));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(636, 53, 624, 672);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("Compare");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new compare4().setVisible(true);
			}
		});
		btnNewButton_4.setBackground(Color.ORANGE);
		btnNewButton_4.setBounds(223, 171, 138, 38);
		panel_2.add(btnNewButton_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\91810\\Pictures\\Screenshots\\Screenshot (151).png"));
		lblNewLabel_5.setBounds(10, 216, 604, 180);
		panel_2.add(lblNewLabel_5);
		
		JButton btnNewButton_5 = new JButton("Compare");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new compare5().setVisible(true);
			}
		});
		btnNewButton_5.setBackground(Color.ORANGE);
		btnNewButton_5.setBounds(239, 396, 141, 43);
		panel_2.add(btnNewButton_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\91810\\Pictures\\Screenshots\\Screenshot (153).png"));
		lblNewLabel_6.setBounds(10, 428, 591, 201);
		panel_2.add(lblNewLabel_6);
		
		JButton btnNewButton_6 = new JButton("Compare");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new compare6().setVisible(true);
			}
		});
		btnNewButton_6.setBackground(Color.ORANGE);
		btnNewButton_6.setBounds(251, 629, 129, 43);
		panel_2.add(btnNewButton_6);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(23, 0, 591, 190);
		panel_2.add(lblNewLabel_4);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\91810\\Pictures\\Screenshots\\Screenshot (168).png"));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new successpage().setVisible(true);

			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\91810\\Pictures\\Screenshots\\Screenshot (192).png"));
		btnNewButton.setBounds(1200, 0, 70, 43);
		panel.add(btnNewButton);
	}
}
