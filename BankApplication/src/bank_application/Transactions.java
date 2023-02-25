package bank_application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Transactions extends JFrame implements ActionListener
{
	
	JButton deposite, withdraw, fastcash, ministatement, pinchange, balance, exit;
	
	String pinnumber;
	
	Transactions(String pinnumber)
	{
		
		this.pinnumber = pinnumber;
		
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("WhatsApp Image 2023-02-22 at 3.24.22 PM.jpeg"));
		Image i2 = i1.getImage().getScaledInstance(800, 650, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 800, 650);
		add(image);
		
		
		JLabel text = new JLabel("Please Select Your Transaction");
		text.setBounds(210, 200, 700, 35);
		text.setFont(new Font("Raleway", Font.BOLD,13));
		text.setForeground(Color.WHITE);
		image.add(text);
		
		
		deposite = new JButton("Deposite");
		deposite.setBounds(150, 300, 120, 15);
		deposite.addActionListener(this);
		image.add(deposite);
		
		withdraw = new JButton("Withdraw");
		withdraw.setBounds(330, 300, 120, 15);
		withdraw.addActionListener(this);
		image.add(withdraw);
		
		fastcash = new JButton("Fast Cash");
		fastcash.setBounds(150, 330, 120, 15);
		fastcash.addActionListener(this);
		image.add(fastcash);
		
		ministatement = new JButton("MiniStatement");
		ministatement.setBounds(330, 330, 120, 15);
		ministatement.addActionListener(this);
		image.add(ministatement);
		
		pinchange = new JButton("Pin Change");
		pinchange.setBounds(150, 360, 120, 15);
		pinchange.addActionListener(this);
		image.add(pinchange);
		
		balance = new JButton("Balance Enquiry");
		balance.setBounds(330, 360, 120, 15);
		balance.addActionListener(this);
		image.add(balance);
		
		exit = new JButton("Exit");
		exit.setBounds(330, 380, 120, 15);
		exit.addActionListener(this);
		image.add(exit);
		
		
		setSize(800,650);
		setLocation(200,0);
		setUndecorated(true);
		setVisible(true); 
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == exit)
		{
			System.exit(0);
		}
		else if(e.getSource() == deposite)
		{
			setVisible(false);
			new Deposite(pinnumber).setVisible(true);
		}
		else if(e.getSource() == withdraw)
		{
			setVisible(false);
			new Withdraw(pinnumber).setVisible(true);
		}
		else if(e.getSource() == fastcash)
		{
			setVisible(false);
			new Fastcash(pinnumber).setVisible(true);
		}
		else if(e.getSource() == pinchange)
		{
			setVisible(false);
			new Pinchange(pinnumber).setVisible(true);
		}
		else if(e.getSource() == balance)
		{
			setVisible(false);
			new BalanceEnquiry(pinnumber).setVisible(true);
		}
		else if(e.getSource() == ministatement)
		{
			new Ministatement(pinnumber).setVisible(true);
		}
	}
	
	public static void main(String args[])
	{
		new Transactions("");
	}
	
}
