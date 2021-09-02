package BillingSystem;

import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Parent_Rest {

	public double itemcost1;
	public double itemcost2;
	public double itemcost3;
	
	public double Product1;
	public double Product2;
	public double Product3;
	public double Product4;
    public double Product5; 
    
	public double Item1;
	public double Item2;
	public double Item3;
	public double Item4;
	public double Item5; 
	
	public static double rProduct1 = 40.0;
	public static double rProduct2 = 50.30;
	public static double rProduct3 = 50.50;
	public static double rProduct4 = 30.0;
    public static double rProduct5 = 40.0; 
    
	public static double rItem1 = 25.0;
	public static double rItem2 = 30.0;
	public static double rItem3 = 20.0;
	public static double rItem4 = 50.0; 
	public static double rItem5 = 30.0; 
	
	public void loadPrice() {
		try {
			Scanner s = new Scanner(new FileReader("price.txt"));
			s.useDelimiter(":");
			rProduct1 = s.nextDouble();
			rProduct2 = s.nextDouble();
			rProduct3 = s.nextDouble();
			rProduct4 = s.nextDouble();
			rProduct5 = s.nextDouble();
			
			rItem1 = s.nextDouble();
			rItem2 = s.nextDouble();
			rItem3 = s.nextDouble();
			rItem4 = s.nextDouble();
			rItem5 = s.nextDouble();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void savePrice() {
		try {
			PrintWriter p1 = new PrintWriter(new FileWriter("price.txt"));
			p1.write(rProduct1+":"+rProduct2+":"+rProduct3+":"+rProduct4+":"+rProduct5+":"+rItem1+":"+rItem2+":"+rItem3+":"+rItem4+":"+rItem5+":");
			p1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public double GetAmount()
	{
		itemcost1 = Product1 + Product2 + Product3 + Product4 + Product5;
		itemcost2 = Item1 + Item2 + Item3 + Item4 + Item5;
		itemcost3 = itemcost1 + itemcost2; 
		return itemcost3; 
	}
	private JFrame frame; 
	
	public void iExitSystem() {
		frame = new JFrame();
		if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Restaurant Billing System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
			System.exit(0);
		}
		
	}
	
	public double rTax = 0.02; 
	
	public double rFindTax(double rAmount){ 
		double FindTax = rAmount-(rAmount - (rAmount * rTax)); 
		return FindTax; 
	}
	
	public void NumberOnly (java.awt.event.KeyEvent evt) { 
		char iNumber = evt.getKeyChar();
		if(!(Character.isDigit(iNumber))
	    ||(iNumber == KeyEvent.VK_BACK_SPACE)
	    ||(iNumber == KeyEvent.VK_DELETE)) {
			evt.consume();
		}
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
