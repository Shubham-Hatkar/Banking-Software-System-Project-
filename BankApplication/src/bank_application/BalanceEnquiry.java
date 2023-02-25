package bank_application;

import java.awt.event.*;
import java.sql.*;
import java.util.Date;
import java.awt.*;
import javax.swing.*;

public class BalanceEnquiry extends JFrame implements ActionListener
{
	
	String pinnumber;
	
	JButton back;
	
	BalanceEnquiry(String pinnumber)
	{
		
		this.pinnumber = pinnumber;
		
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("WhatsApp Image 2023-02-22 at 3.24.22 PM.jpeg"));
		Image i2 = i1.getImage().getScaledInstance(800, 650, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 800, 650);
		add(image);
		
		
		back = new JButton("Back");
		back.setBounds(350, 376, 100, 20);
		back.addActionListener(this);
		image.add(back);
		
		
		Conn c = new Conn();
		int balance = 0;
		try 
		{
			ResultSet rs = c.s.executeQuery("select * from bankmgmt where pin = '" + pinnumber + "'");
			
			while(rs.next())
			{
				if(rs.getString("type").equals("Deposite")) balance += Integer.valueOf(rs.getString("amount"));
				else balance -= Integer.valueOf(rs.getString("amount"));
			}
			
			
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		JLabel txt = new JLabel("Your Current Account Balance is Rs " + balance);
		txt.setForeground(Color.WHITE);
		txt.setBounds(160, 200, 700, 35);
		image.add(txt);
		
		setSize(800,650);
		setLocation(200,0);
		setUndecorated(true);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		setVisible(false);
		new Transactions(pinnumber).setVisible(true);
	}
	
	public static void main(String args[])
	{
		new BalanceEnquiry("");
	}
}
