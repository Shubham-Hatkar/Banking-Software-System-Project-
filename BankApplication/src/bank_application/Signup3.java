package bank_application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.*;

import javax.swing.*;
public class Signup3 extends JFrame implements ActionListener
{
	
	JRadioButton r1, r2, r3, r4; // options for choosing acc type
	
	JCheckBox c1, c2, c3, c4, c5, c6, c7; // checkboxes for what services user wants with his account.
	
	JButton submit, cancel;
	
	String formno;
	
	Signup3(String formno)
	{
		
		this.formno = formno;
		
		setLayout(null);
		
		// title
		JLabel l1 = new JLabel("Page 3 : Account Details");
		l1.setFont(new Font("Raleway",Font.BOLD,22));
		l1.setBounds(300, 10, 500, 40);
		add(l1);
		
		// acc label
		JLabel type = new JLabel("Account Type : ");
		type.setFont(new Font("Raleway",Font.BOLD,20));
		type.setBounds(100, 70, 150, 30);
		add(type);
		
		// 4 options for acc type
		r1 = new JRadioButton("Saving Account ");
		r1.setFont(new Font("Raleway",Font.BOLD,16));
		r1.setBackground(Color.WHITE);
		r1.setBounds(100, 110, 170, 20);
		add(r1);
		
		r2 = new JRadioButton("Fixed Deposite Account ");
		r2.setFont(new Font("Raleway",Font.BOLD,16));
		r2.setBackground(Color.WHITE);
		r2.setBounds(350, 110, 170, 20);
		add(r2);
		
		r3 = new JRadioButton("Current Account ");
		r3.setFont(new Font("Raleway",Font.BOLD,16));
		r3.setBackground(Color.WHITE);
		r3.setBounds(100, 140, 170, 20);
		add(r3);
		
		r4 = new JRadioButton("Recurring Deposite Account ");
		r4.setFont(new Font("Raleway",Font.BOLD,16));
		r4.setBackground(Color.WHITE);
		r4.setBounds(350, 140, 170, 20);
		add(r4);
		
		
		ButtonGroup groupac = new ButtonGroup();
		groupac.add(r1);
		groupac.add(r2);
		groupac.add(r3);
		groupac.add(r4);
		
		// card label
		JLabel card = new JLabel("Card Number : ");
		card.setFont(new Font("Raleway",Font.BOLD,20));
		card.setBounds(100, 180, 150, 30);
		add(card);
		
		// number label
		JLabel number = new JLabel("XXXX-XXXX-XXXX-9765");
		number.setFont(new Font("Raleway",Font.BOLD,20));
		number.setBounds(300, 180, 300, 30);
		add(number);
		
		// card label
		JLabel carddetail = new JLabel("16 Digits Account No.");
		carddetail.setFont(new Font("Raleway",Font.BOLD,12));
		carddetail.setBounds(300, 210, 300, 20);
		add(carddetail);
		
		// pin label
		JLabel pin = new JLabel("PIN : ");
		pin.setFont(new Font("Raleway",Font.BOLD,20));
		pin.setBounds(100, 270, 150, 30);
		add(pin);
		
		
		JLabel pindetail = new JLabel("Your 4 Digits Password");
		pindetail.setFont(new Font("Raleway",Font.BOLD,12));
		pindetail.setBounds(300, 300, 300, 20);
		add(pindetail);
		
		JLabel pinnumber = new JLabel("XXXX");
		pinnumber.setFont(new Font("Raleway",Font.BOLD,20));
		pinnumber.setBounds(300, 270, 300, 30);
		add(pinnumber);
		
		JLabel services = new JLabel("Services Required : ");
		services.setFont(new Font("Raleway",Font.BOLD,20));
		services.setBounds(100, 330, 200, 30);
		add(services);
		
		// options for customer - what services he/she needed
		c1 = new JCheckBox("ATM Card");
		c1.setBackground(Color.WHITE);
		c1.setFont(new Font("Raleway", Font.BOLD,13));
		c1.setBounds(100, 380, 150, 20);
		add(c1);
		
		c2 = new JCheckBox("Internet Banking");
		c2.setBackground(Color.WHITE);
		c2.setFont(new Font("Raleway", Font.BOLD,13));
		c2.setBounds(300, 380, 150, 20);
		add(c2);
		
		c3 = new JCheckBox("Mobile Banking");
		c3.setBackground(Color.WHITE);
		c3.setFont(new Font("Raleway", Font.BOLD,13));
		c3.setBounds(100, 410, 150, 20);
		add(c3);
		
		c4 = new JCheckBox("Email Alert");
		c4.setBackground(Color.WHITE);
		c4.setFont(new Font("Raleway", Font.BOLD,13));
		c4.setBounds(300, 410, 150, 20);
		add(c4);
		
		c5 = new JCheckBox("Cheque Book");
		c5.setBackground(Color.WHITE);
		c5.setFont(new Font("Raleway", Font.BOLD,13));
		c5.setBounds(100, 440, 150, 20);
		add(c5);
		
		c6 = new JCheckBox("E-Statement");
		c6.setBackground(Color.WHITE);
		c6.setFont(new Font("Raleway", Font.BOLD,13));
		c6.setBounds(300, 440, 150, 20);
		add(c6);
		
		c7 = new JCheckBox("Hereby declare that the above entered details are correct to the best of my knowledge");
		c7.setBackground(Color.WHITE);
		c7.setFont(new Font("Raleway", Font.BOLD,13));
		c7.setBounds(100, 500, 600, 20);
		add(c7);
		
		// Jbuttons for action
		submit = new JButton("SUBMIT");
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.WHITE);
		submit.setBounds(230, 550, 100, 30);
		submit.setFont(new Font("Raleway", Font.BOLD,16));
		submit.addActionListener(this);
		add(submit);
		
		cancel = new JButton("CANCEL");
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		cancel.setBounds(470, 550, 100, 30);
		cancel.setFont(new Font("Raleway", Font.BOLD,16));
		cancel.addActionListener(this);
		add(cancel);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(800,660);
		setLocation(350,10);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e) 
	{	
		if(e.getSource() == submit)
		{
			String accounttype = null;
			if(r1.isSelected()) accounttype = "Saving Account";
			else if(r2.isSelected()) accounttype = "Fixed Deposite Account";
			else if(r3.isSelected()) accounttype = "Current Account";
			else if(r4.isSelected()) accounttype = "Recurring Deposite Account";
			
			Random ran = new Random();
			String cardnumber = "" + Math.abs((ran.nextLong() % 90000000L) + 8097650300000000L);
			
			String pinnumber = "" + Math.abs(ran.nextLong() % 9000L);
			
			// user can select multiple options.
			String facility = "";
			if(c1.isSelected()) facility += " ATM Card";
			if(c2.isSelected()) facility += " Internet Banking";
			if(c3.isSelected()) facility += " Mobile Banking";
			if(c4.isSelected()) facility += " Email Alerts";
			if(c5.isSelected()) facility += " Cheque Book";
			if(c6.isSelected()) facility += " E-Statement";
					
			try
			{
				if(accounttype == null) JOptionPane.showConfirmDialog(null, "Account Type Required");
				else
				{
					// same thing create conn, create query, perform query
					Conn conn = new Conn();
					String query1 = "insert into signup3 values('" + formno +"','" + accounttype +"','" + cardnumber +"','" + pinnumber +"','" + facility + "')";  
					String query2 = "insert into login values('" + formno +"','" + cardnumber +"','" + pinnumber +"')";  

					conn.s.executeUpdate(query1);
					conn.s.executeUpdate(query2);
					
					JOptionPane.showConfirmDialog(null, "CardNumber : " + cardnumber + "\n Pin : " + pinnumber);
					
					setVisible(false);
					new Login().setVisible(true);
				}
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
			
		}
		else if(e.getSource() == cancel)
		{
			setVisible(false);
			new Login().setVisible(true);
		}
		
	}
	
	public static void main(String args[])
	{
		new Signup3("");
	}
	
}
