package bank_application;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


import javax.swing.*;
public class Deposite extends JFrame implements ActionListener
{
	
	JButton depositebtn, backbtn;
	
	JTextField amounttxt;
	
	String pinnumber;
	
	Deposite(String pinnumber)
	{
		this.pinnumber = pinnumber;
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("WhatsApp Image 2023-02-22 at 3.24.22 PM.jpeg"));
		Image i2 = i1.getImage().getScaledInstance(800, 650, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 800, 650);
		add(image);
		
		JLabel txt = new JLabel("Enter the Amount you want to deposit");
		txt.setForeground(Color.WHITE);
		txt.setFont(new Font("system", Font.BOLD,13));
		txt.setBounds(170, 200, 700, 35);
		image.add(txt);
		
		
		amounttxt = new JTextField();
		amounttxt.setFont(new Font("Raleway", Font.BOLD,15));
		amounttxt.setBounds(170, 250, 240, 20);
		image.add(amounttxt);
		
		
		depositebtn = new JButton("Deposit");
		depositebtn.setBounds(330, 335, 120, 15);
		depositebtn.addActionListener(this);
		image.add(depositebtn);
		
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
		if(e.getSource() == depositebtn)
		{
			String number = amounttxt.getText();
			Date date = new Date();
			if(number.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please enter the amout you want to deposit");
			}
			
			else
			{
				try
				{
					Conn conn = new Conn();
					String query = "insert into bankmgmt values('" + pinnumber + "', '" + date + "', 'Deposite','" + number + "')";
					conn.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Rs " + number + " Deposited Successfully");
					
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
		new Deposite("");
	}

	
}
