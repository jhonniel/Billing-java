package BillingSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class WelcomeSystem extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeSystem frame = new WelcomeSystem();
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
	public WelcomeSystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 495);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("WELCOME! ");
		lblWelcome.setBackground(Color.BLACK);
		lblWelcome.setForeground(Color.ORANGE);
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Algerian", Font.BOLD, 60));
		lblWelcome.setBounds(232, 23, 403, 59);
		contentPane.add(lblWelcome);
		
		JLabel lblNewLabel = new JLabel("Please Choose:\r\n");
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Adobe Arabic", Font.BOLD, 30));
		lblNewLabel.setBounds(289, 265, 278, 25);
		contentPane.add(lblNewLabel);
		
		JButton btnUser = new JButton("");
		btnUser.setIcon(new ImageIcon(getClass().getResource("/userx.png")));
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					LogInsystem frame = new LogInsystem();
					frame.setVisible(true);
					dispose();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnUser.setFont(new Font("Adobe Arabic", Font.BOLD, 15));
		btnUser.setBounds(186, 313, 182, 132);
		contentPane.add(btnUser);
		
		JButton btnAdmin = new JButton("");
		btnAdmin.setIcon(new ImageIcon(getClass().getResource("/admin1.png")));
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					LogAdmin frame = new LogAdmin();
					frame.setVisible(true);
					dispose();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			
		});
		btnAdmin.setFont(new Font("Adobe Arabic", Font.BOLD | Font.ITALIC, 15));
		btnAdmin.setBounds(460, 313, 175, 132);
		contentPane.add(btnAdmin);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/rest1.png")));;
		lblNewLabel_2.setBounds(315, 22, 225, 225);
		contentPane.add(lblNewLabel_2);
	}

}
