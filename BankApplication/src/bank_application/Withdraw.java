package bank_application;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


import javax.swing.*;
public class Withdraw extends JFrame implements ActionListener
{
	
	JButton withdrawbtn, backbtn;
	
	JTextField amounttxt;
	
	String pinnumber;
	
	Withdraw(String pinnumber)
	{
		this.pinnumber = pinnumber;
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("WhatsApp Image 2023-02-22 at 3.24.22 PM.jpeg"));
		Image i2 = i1.getImage().getScaledInstance(800, 650, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 800, 650);
		add(image);
		
		JLabel txt = new JLabel("Enter the Amount you want to Withdraw");
		txt.setForeground(Color.WHITE);
		txt.setFont(new Font("system", Font.BOLD,13));
		txt.setBounds(170, 200, 700, 35);
		image.add(txt);
		
		
		amounttxt = new JTextField();
		amounttxt.setFont(new Font("Raleway", Font.BOLD,15));
		amounttxt.setBounds(170, 250, 240, 20);
		image.add(amounttxt);
		
		
		withdrawbtn = new JButton("Withdraw");
		withdrawbtn.setBounds(330, 335, 120, 15);
		withdrawbtn.addActionListener(this);
		image.add(withdrawbtn);
		
		backbtn = new JButton("Back");
		backbtn.setBounds(330, 360, 120, 15);
		backbtn.addActionListener(this);
		image.add(backbtn);
		
		setSize(800,650);
		setLocation(200,0);
		setVisible(true); 
	}
	
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == withdrawbtn)
		{
			String number = amounttxt.getText();
			Date date = new Date();
			if(number.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please enter the amout you want to withdraw");
			}
			
			else
			{
				try
				{
					Conn conn = new Conn();
					String query = "insert into bankmgmt values('" + pinnumber + "', '" + date + "', 'Withdraw','" + number + "')";
					conn.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Rs " + number + " Withdrawn Successfully");
					
					setVisible(false);
					new Transactions(pinnumber).setVisible(true);
				}
				catch(Exception e2)
				{
					System.out.println(e2);
				}
				
			}
		}
		else if(e.getSource() == backbtn)
		{
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}
	}
	public static void main(String args[])
	{
		new Withdraw("");
	}

	
}
