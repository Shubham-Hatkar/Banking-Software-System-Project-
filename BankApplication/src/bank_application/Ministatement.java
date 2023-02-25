package bank_application;


import java.awt.*;
import java.sql.*;
import javax.swing.*;
public class Ministatement extends JFrame 
{
	
	Ministatement(String pinnumber)
	{
		setTitle("Mini Statement");
		
		setLayout(null);
		
		
		
		JLabel mini = new JLabel();
		add(mini);
		
		JLabel bank = new JLabel("Our Bank");
		bank.setBounds(210,20,100,20);
		add(bank);
		
		JLabel card = new JLabel();
		card.setBounds(70,80,300,20);
		add(card);
		
		try
		{
			Conn conn = new Conn();
			ResultSet rs = conn.s.executeQuery("select * from login where pin = '" + pinnumber + "'");
			while(rs.next())
			{
				card.setText("Card Number  : " + rs.getString("cardnumber").substring(0,4) + "XXXXXXXX" + rs.getString("cardnumber").substring(12));
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		int bal = 0;
		try
		{
			Conn conn = new Conn();
			ResultSet rs = conn.s.executeQuery("select * from bankmgmt where pin = '" + pinnumber + "'");
	
			while(rs.next())
			{
				mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp; " + rs.getString("type") + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp; " + rs.getString("amount") + "<br><br></html>");                       
				
				if(rs.getString("type").equals("Deposite")) bal += Integer.valueOf(rs.getString("amount"));
				else bal -= Integer.valueOf(rs.getString("amount"));
				
			}
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		
		JLabel balance = new JLabel();
		balance.setBounds(70,280,300,20);
		balance.setText("Your Current Account Balance is Rs : " + bal);
		add(balance);
		
		mini.setBounds(70, 100, 400, 200);
		
		
		setSize(500,400);
		setLocation(20,20);
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new Ministatement("");
	}
}
