package bank_application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.sql.*;
import java.util.Date; // date is present in sql and util package so need to define explicitely.

public class Fastcash extends JFrame implements ActionListener
{
	
	JButton hundread, five, onet, twot, fivet, tent, back;
	
	String pinnumber;
	
	Fastcash(String pinnumber)
	{
		
		this.pinnumber = pinnumber;
		
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("WhatsApp Image 2023-02-22 at 3.24.22 PM.jpeg"));
		Image i2 = i1.getImage().getScaledInstance(800, 650, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 800, 650);
		add(image);
		
		
		JLabel text = new JLabel("Select withdrawal amount");
		text.setBounds(210, 200, 700, 35);
		text.setFont(new Font("Raleway", Font.BOLD,13));
		text.setForeground(Color.WHITE);
		image.add(text);
		
		
		hundread = new JButton("Rs 100");
		hundread.setBounds(150, 300, 120, 15);
		hundread.addActionListener(this);
		image.add(hundread);
		
		five = new JButton("Rs 500");
		five.setBounds(330, 300, 120, 15);
		five.addActionListener(this);
		image.add(five);
		
		onet = new JButton("Rs 1000");
		onet.setBounds(150, 330, 120, 15);
		onet.addActionListener(this);
		image.add(onet);
		
		twot = new JButton("Rs 2000");
		twot.setBounds(330, 330, 120, 15);
		twot.addActionListener(this);
		image.add(twot);
		
		fivet = new JButton("Rs 5000");
		fivet.setBounds(150, 360, 120, 15);
		fivet.addActionListener(this);
		image.add(fivet);
		
		tent = new JButton("Rs 10000");
		tent.setBounds(330, 360, 120, 15);
		tent.addActionListener(this);
		image.add(tent);
		
		back = new JButton("Back");
		back.setBounds(330, 380, 120, 15);
		back.addActionListener(this);
		image.add(back);
		
		
		setSize(800,650);
		setLocation(200,0);
		setUndecorated(true);
		setVisible(true); 
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == back)
		{
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}
		else 
		{
			// Dynamic - not need to check each button with if else
			String amount = ((JButton)e.getSource()).getText().substring(3);
			Conn c = new Conn();
			try 
			{
				ResultSet rs = c.s.executeQuery("select * from bankmgmt where pin = '" + pinnumber + "'");
				int balance = 0;
				while(rs.next())
				{
					if(rs.getString("type").equals("Deposite")) balance += Integer.valueOf(rs.getString("amount"));
					else balance -= Integer.valueOf(rs.getString("amount"));
				}
				
				if(e.getSource() != back && balance < Integer.valueOf(amount))
				{
					JOptionPane.showMessageDialog(null, "Insufficient Balance");
					return;
				}
				
				Date date = new Date();
				String query = "insert into bankmgmt values('" + pinnumber + "', '" + date + "', 'Withdraw','" + amount + "')";
				c.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Rs " + amount + " Debited Successfully");
				
				setVisible(false);
				new Transactions(pinnumber).setVisible(true);
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
			
		}
	}
	
	public static void main(String args[])
	{
		new Fastcash("");
	}
	
}
