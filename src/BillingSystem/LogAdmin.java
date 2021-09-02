package BillingSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class LogAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField textAdmin;
	private JPasswordField textPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogAdmin frame = new LogAdmin();
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
	public LogAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 40, 414, 8);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 184, 414, 8);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel = new JLabel("ADMIN          :");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(46, 70, 77, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(46, 115, 90, 14);
		contentPane.add(lblNewLabel_1);
		
		textAdmin = new JTextField();
		textAdmin.setBounds(146, 67, 171, 20);
		contentPane.add(textAdmin);
		textAdmin.setColumns(10);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(146, 112, 171, 20);
		contentPane.add(textPassword);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAdmin.setText(null);
				textPassword.setText(null);
			}
		});
		btnReset.setBounds(175, 203, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(312, 203, 89, 23);
		contentPane.add(btnExit);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = textPassword.getText();
				String admin = textAdmin.getText();
				
				if (password.contains("1234") && admin.contains("Admin")) {
					textPassword.setText(null);
					textAdmin.setText(null);
					new AdminSystem().setVisible(true);
				
				
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Invalid Admin/Password: Please try again", "Login Error", JOptionPane.ERROR_MESSAGE);
					textPassword.setText(null);
					textAdmin.setText(null);
				}
				dispose();
			}
			
		});
		btnLogin.setBounds(34, 203, 89, 23);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel_2 = new JLabel("RESTAURANT BILLING SYSTEM");
		lblNewLabel_2.setBackground(Color.BLACK);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setBounds(105, 11, 243, 18);
		contentPane.add(lblNewLabel_2);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					WelcomeSystem frame = new WelcomeSystem();
					frame.setVisible(true);
					dispose();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			
		});
		btnBack.setBounds(6, 11, 89, 23);
		contentPane.add(btnBack);
		
		
	}

}
