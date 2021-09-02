package BillingSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RestaurantBillingSystem extends JFrame {

	private JPanel contentPane;
	private JTextField textProduct1;
	private JTextField textProduct2;
	private JTextField textProduct3;
	private JTextField textProduct4;
	private JTextField textProduct5;
	private JTextField textItem1;
	private JTextField textItem2;
	private JTextField textItem3;
	private JTextField textItem4;
	private JTextField textItem5;
	private JTextField textTax;
	private JTextField textSubtotal;
	private JTextField textTotal;
	private JTextField textMeal;
	private JTextField textDrinks;
	private JLabel Product1;
	private JLabel Item5;
	private JLabel Product2;
	private JLabel Product3;
	private JLabel Product4;
	private JLabel Item1;
	private JLabel Item2;
	private JLabel Item3;
	private JLabel Item4;
	private JLabel Product5;
	private Parent_Rest parent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantBillingSystem frame = new RestaurantBillingSystem();
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
	public RestaurantBillingSystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBorder(new LineBorder(new Color(255, 0, 0), 12));
		panel.setBounds(0, 0, 984, 99);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RESTAURANT BILLING SYSTEM");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 30));
		lblNewLabel.setBounds(261, 35, 490, 38);
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setForeground(Color.RED);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/Restaurant.jpg")));
		lblNewLabel_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_1.setBounds(10, 11, 130, 77);
		panel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("New label");
		label.setBackground(SystemColor.menu);
		label.setBounds(72, 11, 130, 77);
		panel.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon((getClass().getResource("/Restaurant.jpg"))));
		label_1.setBackground(SystemColor.menu);
		label_1.setBounds(844, 11, 130, 77);
		panel.add(label_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(UIManager.getColor("CheckBox.background"));
		panel_1.setBackground(Color.RED);
		panel_1.setBorder(new LineBorder(UIManager.getColor("Button.darkShadow"), 12));
		panel_1.setBounds(-24, 110, 984, 360);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		Product1 = new JLabel("ADOBO");
		Product1.setHorizontalAlignment(SwingConstants.CENTER);
		Product1.setBounds(25, 21, 119, 25);
		Product1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		Product1.setForeground(UIManager.getColor("Button.disabledShadow"));
		panel_1.add(Product1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(UIManager.getColor("Button.disabledShadow"));
		separator_1.setBounds(10, 11, 964, 13);
		panel_1.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBounds(25, 46, 257, 13);
		panel_1.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.WHITE);
		separator_3.setBounds(25, 83, 257, 13);
		panel_1.add(separator_3);
		
		Product2 = new JLabel("MENUDO");
		Product2.setHorizontalAlignment(SwingConstants.CENTER);
		Product2.setForeground(Color.WHITE);
		Product2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		Product2.setBounds(25, 57, 119, 25);
		panel_1.add(Product2);
		
		Product3 = new JLabel("KALDERETA");
		Product3.setHorizontalAlignment(SwingConstants.CENTER);
		Product3.setForeground(Color.WHITE);
		Product3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		Product3.setBounds(25, 93, 119, 25);
		panel_1.add(Product3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.WHITE);
		separator_4.setBounds(25, 118, 257, 13);
		panel_1.add(separator_4);
		
		Product4 = new JLabel("STEAK");
		Product4.setHorizontalAlignment(SwingConstants.CENTER);
		Product4.setForeground(Color.WHITE);
		Product4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		Product4.setBounds(25, 132, 119, 25);
		panel_1.add(Product4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.WHITE);
		separator_5.setBounds(25, 158, 257, 13);
		panel_1.add(separator_5);
		
		Product5 = new JLabel("CRUSH");
		Product5.setHorizontalAlignment(SwingConstants.CENTER);
		Product5.setForeground(Color.WHITE);
		Product5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		Product5.setBounds(25, 168, 119, 25);
		panel_1.add(Product5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(Color.WHITE);
		separator_6.setBounds(10, 193, 539, 13);
		panel_1.add(separator_6);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 11, 13, 208);
		panel_1.add(separator);
		separator.setForeground(UIManager.getColor("Button.darkShadow"));
		separator.setBackground(UIManager.getColor("Button.disabledShadow"));
		separator.setOrientation(SwingConstants.VERTICAL);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setForeground(Color.WHITE);
		separator_7.setBackground(Color.WHITE);
		separator_7.setBounds(280, 11, 13, 182);
		panel_1.add(separator_7);
		
		textProduct1 = new JTextField();
		textProduct1.setHorizontalAlignment(SwingConstants.CENTER);
		textProduct1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textProduct1.setText("0");
		textProduct1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.NumberOnly(evt); 
				}
		});
		textProduct1.setBounds(151, 27, 122, 20);
		panel_1.add(textProduct1);
		textProduct1.setColumns(10);
		
		textProduct2 = new JTextField();
		textProduct2.setHorizontalAlignment(SwingConstants.CENTER);
		textProduct2.setFont(new Font("Tahoma", Font.BOLD, 15));
		textProduct2.setText("0");
		textProduct2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.NumberOnly(evt); 
				}
		});
		textProduct2.setBounds(151, 58, 119, 20);
		panel_1.add(textProduct2);
		textProduct2.setColumns(10);
		
		textProduct3 = new JTextField();
		textProduct3.setHorizontalAlignment(SwingConstants.CENTER);
		textProduct3.setFont(new Font("Tahoma", Font.BOLD, 15));
		textProduct3.setText("0");
		textProduct3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.NumberOnly(evt); 
				}
		});
		textProduct3.setBounds(151, 93, 119, 20);
		panel_1.add(textProduct3);
		textProduct3.setColumns(10);
		
		textProduct4 = new JTextField();
		textProduct4.setHorizontalAlignment(SwingConstants.CENTER);
		textProduct4.setFont(new Font("Tahoma", Font.BOLD, 15));
		textProduct4.setText("0");
		textProduct4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.NumberOnly(evt); 
				}
		});
		textProduct4.setBounds(151, 131, 119, 20);
		panel_1.add(textProduct4);
		textProduct4.setColumns(10);
		
		textProduct5 = new JTextField();
		textProduct5.setHorizontalAlignment(SwingConstants.CENTER);
		textProduct5.setFont(new Font("Tahoma", Font.BOLD, 15));
		textProduct5.setText("0");
		textProduct5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.NumberOnly(evt); 
				}
		});
		textProduct5.setBounds(151, 167, 119, 20);
		panel_1.add(textProduct5);
		textProduct5.setColumns(10);
		
		Item1 = new JLabel("ICETEA");
		Item1.setHorizontalAlignment(SwingConstants.CENTER);
		Item1.setForeground(Color.WHITE);
		Item1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		Item1.setBounds(292, 21, 119, 25);
		panel_1.add(Item1);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setForeground(Color.WHITE);
		separator_8.setBounds(292, 46, 257, 13);
		panel_1.add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setForeground(Color.WHITE);
		separator_9.setBounds(292, 83, 257, 13);
		panel_1.add(separator_9);
		
		Item2 = new JLabel("COKE");
		Item2.setHorizontalAlignment(SwingConstants.CENTER);
		Item2.setForeground(Color.WHITE);
		Item2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		Item2.setBounds(292, 57, 119, 25);
		panel_1.add(Item2);
		
		Item3 = new JLabel("ORANGE JUICE");
		Item3.setHorizontalAlignment(SwingConstants.CENTER);
		Item3.setForeground(Color.WHITE);
		Item3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		Item3.setBounds(292, 93, 119, 25);
		panel_1.add(Item3);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setForeground(Color.WHITE);
		separator_10.setBounds(292, 118, 257, 13);
		panel_1.add(separator_10);
		
		Item4 = new JLabel("MILKSHAKE");
		Item4.setHorizontalAlignment(SwingConstants.CENTER);
		Item4.setForeground(Color.WHITE);
		Item4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		Item4.setBounds(292, 132, 119, 25);
		panel_1.add(Item4);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setForeground(Color.WHITE);
		separator_11.setBounds(292, 158, 257, 13);
		panel_1.add(separator_11);
		
		Item5 = new JLabel("LEMONADE");
		Item5.setHorizontalAlignment(SwingConstants.CENTER);
		Item5.setForeground(Color.WHITE);
		Item5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		Item5.setBounds(292, 168, 119, 25);
		panel_1.add(Item5);
		
		textItem1 = new JTextField();
		textItem1.setHorizontalAlignment(SwingConstants.CENTER);
		textItem1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textItem1.setText("0");
		textItem1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.NumberOnly(evt); 
				}
		});
		textItem1.setColumns(10);
		textItem1.setBounds(418, 21, 119, 20);
		panel_1.add(textItem1);
		
		textItem2 = new JTextField();
		textItem2.setHorizontalAlignment(SwingConstants.CENTER);
		textItem2.setFont(new Font("Tahoma", Font.BOLD, 15));
		textItem2.setText("0");
		textItem2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.NumberOnly(evt); 
				}
		});
		textItem2.setColumns(10);
		textItem2.setBounds(418, 58, 119, 20);
		panel_1.add(textItem2);
		
		textItem3 = new JTextField();
		textItem3.setHorizontalAlignment(SwingConstants.CENTER);
		textItem3.setFont(new Font("Tahoma", Font.BOLD, 15));
		textItem3.setText("0");
		textItem3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.NumberOnly(evt); 
				}
		});
		textItem3.setColumns(10);
		textItem3.setBounds(418, 93, 119, 20);
		panel_1.add(textItem3);
		
		textItem4 = new JTextField();
		textItem4.setHorizontalAlignment(SwingConstants.CENTER);
		textItem4.setFont(new Font("Tahoma", Font.BOLD, 15));
		textItem4.setText("0");
		textItem4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.NumberOnly(evt); 
				}
		});
		textItem4.setColumns(10);
		textItem4.setBounds(418, 131, 119, 20);
		panel_1.add(textItem4);
		
		textItem5 = new JTextField();
		textItem5.setHorizontalAlignment(SwingConstants.CENTER);
		textItem5.setFont(new Font("Tahoma", Font.BOLD, 15));
		textItem5.setText("0");
		textItem5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.NumberOnly(evt); 
				}
		});
		textItem5.setColumns(10);
		textItem5.setBounds(418, 167, 119, 20);
		panel_1.add(textItem5);
		
		JLabel lblTax = new JLabel("TAX                 :");
		lblTax.setHorizontalAlignment(SwingConstants.LEFT);
		lblTax.setForeground(Color.WHITE);
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTax.setBounds(559, 21, 119, 31);
		panel_1.add(lblTax);
		
		JLabel lblSubtotal = new JLabel("SUBTOTAL      :");
		lblSubtotal.setForeground(Color.WHITE);
		lblSubtotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSubtotal.setBounds(559, 93, 119, 25);
		panel_1.add(lblSubtotal);
		
		JLabel lblTotalCost = new JLabel("TOTAL COST   :");
		lblTotalCost.setForeground(Color.WHITE);
		lblTotalCost.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTotalCost.setBounds(559, 161, 131, 25);
		panel_1.add(lblTotalCost);
		
		textTax = new JTextField();
		textTax.setFont(new Font("Tahoma", Font.BOLD, 15));
		textTax.setHorizontalAlignment(SwingConstants.CENTER);
		textTax.setText("0\r\n");
		textTax.setColumns(10);
		textTax.setBounds(688, 27, 98, 20);
		panel_1.add(textTax);
		
		textSubtotal = new JTextField();
		textSubtotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		textSubtotal.setHorizontalAlignment(SwingConstants.CENTER);
		textSubtotal.setText("0\r\n");
		textSubtotal.setColumns(10);
		textSubtotal.setBounds(688, 99, 98, 20);
		panel_1.add(textSubtotal);
		
		textTotal = new JTextField();
		textTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		textTotal.setHorizontalAlignment(SwingConstants.CENTER);
		textTotal.setText("0\r\n");
		textTotal.setColumns(10);
		textTotal.setBounds(688, 165, 98, 20);
		panel_1.add(textTotal);
		
		JSeparator separator_16 = new JSeparator();
		separator_16.setOrientation(SwingConstants.VERTICAL);
		separator_16.setForeground(Color.WHITE);
		separator_16.setBackground(Color.WHITE);
		separator_16.setBounds(547, 11, 13, 235);
		panel_1.add(separator_16);
		
		JLabel lblCostOfMeal = new JLabel(" COST OF MEAL:");
		lblCostOfMeal.setHorizontalAlignment(SwingConstants.CENTER);
		lblCostOfMeal.setForeground(Color.BLACK);
		lblCostOfMeal.setFont(new Font("Broadway", Font.BOLD, 12));
		lblCostOfMeal.setBounds(25, 205, 119, 29);
		panel_1.add(lblCostOfMeal);
		
		textMeal = new JTextField();
		textMeal.setBackground(Color.WHITE);
		textMeal.setEnabled(false);
		textMeal.setFont(new Font("Tahoma", Font.BOLD, 15));
		textMeal.setHorizontalAlignment(SwingConstants.CENTER);
		textMeal.setText("0");
		textMeal.setColumns(10);
		textMeal.setBounds(151, 204, 119, 30);
		panel_1.add(textMeal);
		
		JLabel lblCostOfDrink = new JLabel("COST OF DRINK:");
		lblCostOfDrink.setHorizontalAlignment(SwingConstants.CENTER);
		lblCostOfDrink.setForeground(Color.BLACK);
		lblCostOfDrink.setFont(new Font("Broadway", Font.BOLD, 12));
		lblCostOfDrink.setBounds(280, 205, 131, 29);
		panel_1.add(lblCostOfDrink);
		
		textDrinks = new JTextField();
		textDrinks.setBackground(Color.WHITE);
		textDrinks.setEnabled(false);
		textDrinks.setFont(new Font("Tahoma", Font.BOLD, 15));
		textDrinks.setHorizontalAlignment(SwingConstants.CENTER);
		textDrinks.setText("0\r\n");
		textDrinks.setColumns(10);
		textDrinks.setBounds(418, 204, 119, 30);
		panel_1.add(textDrinks);
		
		JSeparator separator_18 = new JSeparator();
		separator_18.setForeground(Color.WHITE);
		separator_18.setBounds(10, 245, 964, 13);
		panel_1.add(separator_18);
		
		JButton btnNewButton = new JButton("TOTAL");
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Child_Restaurant ItemCost = new Child_Restaurant(); 
				double iTax, iSubtotal, iTotal; 
				
				ItemCost.Product1 = ItemCost.rProduct1 * Double.parseDouble(textProduct1.getText()); 
				ItemCost.Product2 = ItemCost.rProduct2 * Double.parseDouble(textProduct2.getText()); 
				ItemCost.Product3 = ItemCost.rProduct3 * Double.parseDouble(textProduct3.getText()); 
				ItemCost.Product4 = ItemCost.rProduct4 * Double.parseDouble(textProduct4.getText()); 
				ItemCost.Product5 = ItemCost.rProduct5 * Double.parseDouble(textProduct5.getText()); 
				
				ItemCost.Item1 = ItemCost.rItem1 * Double.parseDouble(textItem1.getText()); 
				ItemCost.Item2 = ItemCost.rItem2 * Double.parseDouble(textItem2.getText()); 
				ItemCost.Item3 = ItemCost.rItem3 * Double.parseDouble(textItem3.getText()); 
				ItemCost.Item4 = ItemCost.rItem4 * Double.parseDouble(textItem4.getText()); 
				ItemCost.Item5 = ItemCost.rItem5 * Double.parseDouble(textItem5.getText()); 
				
				iSubtotal = ItemCost.GetAmount();
				iTax = ItemCost.rFindTax(iSubtotal);
				iTotal = iSubtotal + iTax; 
				
				String Subtotal = String.format("P%.2f ", iSubtotal); 
				textSubtotal.setText(Subtotal);
				
				String Tax = String.format("P%.2f ", iTax); 
				textTax.setText(Tax);
				
				String Total = String.format("P%.2f ", iTotal); 
				textTotal.setText(Total);
				
				String Costm = String.format("P%.2f ", ItemCost.itemcost1); 
				textMeal.setText(Costm);
				
				String Costd = String.format("P%.2f ",ItemCost.itemcost2); 
				textDrinks.setText(Costd);
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(36, 257, 176, 56);
		panel_1.add(btnNewButton);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setBackground(Color.YELLOW);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				JTextField cleartext=null;
				for (java.awt.Component c:panel_1.getComponents()) {
				if (c.getClass().toString().contains("javax.swing.JTextField")) {
					cleartext = (JTextField)c;
					cleartext.setText("0"); 
				}
				} 
			
			
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(411, 257, 176, 56);
		panel_1.add(btnClear);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(Color.YELLOW);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Child_Restaurant iExit = new Child_Restaurant(); 
				iExit.iExitSystem();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(784, 257, 176, 56);
		panel_1.add(btnExit);
		
		JLabel lblNewLabel_2 = new JLabel("New label");    
		lblNewLabel_2.setBackground(Color.BLACK);
		lblNewLabel_2.setIcon(new ImageIcon((getClass().getResource("/images.png"))));
		lblNewLabel_2.setBounds(796, 11, 176, 235);
		panel_1.add(lblNewLabel_2);
		
		loadName();
		new Parent_Rest().loadPrice();
	}
	public void saveName() {
		try {
			PrintWriter p = new PrintWriter(new FileWriter("/names.txt"));
			p.write(Product1+":"+Product2+":"+Product3+":"+Product4+":"+Product5+":"+Item1+":"+Item2+":"+Item3+":"+Item4+":"+Item5+":");
			p.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void loadName() {
		try {
			Scanner s = new Scanner(new FileReader("names.txt"));
			s.useDelimiter(":");
			Product1.setText(s.next()); 
			Product2.setText(s.next());
			Product3.setText(s.next());
			Product4.setText(s.next());
			Product5.setText(s.next());
			Item1.setText(s.next());
			Item2.setText(s.next());
			Item3.setText(s.next());
			Item4.setText(s.next());
			Item5.setText(s.next());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
