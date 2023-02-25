package bank_application;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Pinchange extends JFrame implements ActionListener
{
	
	String pinnumber;
	
	JButton change, back;
	
	JPasswordField pin, repin;
	
	Pinchange(String pinnumber)
	{
		this.pinnumber = pinnumber;
		
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("WhatsApp Image 2023-02-22 at 3.24.22 PM.jpeg"));
		Image i2 = i1.getImage().getScaledInstance(800, 650, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 800, 650);
		add(image);
		
		
		JLabel txt = new JLabel("CHANGE YOUR PIN");
		txt.setForeground(Color.WHITE);
		txt.setFont(new Font("system", Font.BOLD,13));
		txt.setBounds(235, 200, 700, 35);
		image.add(txt);
		
		JLabel pintxt = new JLabel("New PIN : ");
		pintxt.setForeground(Color.WHITE);
		pintxt.setFont(new Font("system", Font.BOLD,13));
		pintxt.setBounds(170, 250, 180, 20);
		image.add(pintxt);
		
		pin = new JPasswordField();
		pin.setForeground(Color.black);
		pin.setFont(new Font("Raleway", Font.BOLD,15));
		pin.setBounds(300, 250, 140, 20);
		image.add(pin);
		
		
		JLabel repintxt = new JLabel("Re-Enter New PIN : ");
		repintxt.setForeground(Color.WHITE);
		repintxt.setFont(new Font("system", Font.BOLD,13));
		repintxt.setBounds(170, 280, 180, 20);
		image.add(repintxt);
		
		repin = new JPasswordField();
		repin.setForeground(Color.black);
		repin.setFont(new Font("Raleway", Font.BOLD,15));
		repin.setBounds(300, 280, 140, 20);
		image.add(repin);
		
		
		
		change = new JButton("Change");
		change.setBounds(350, 350, 100, 20);
		change.addActionListener(this);
		image.add(change);
		
		back = new JButton("Back");
		back.setBounds(350, 376, 100, 20);
		back.addActionListener(this);
		image.add(back);
		
		
		setSize(800,650);
		setLocation(200,0);
		setUndecorated(true);
		setVisible(true); 
	}
	
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == change)
		{
			try
			{
				String newpin = pin.getText();
				String rpin = repin.getText();
				
				if(!newpin.equals(rpin)) 
				{
					JOptionPane.showMessageDialog(null, "Entered pin doesn't match");
					return;
				}
				if(newpin.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please Enter New Pin");
					return;
				}
				if(rpin.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please Re-Enter New Pin");
					return;
				}
				
				// Pin is in three tables so update that
				Conn conn = new Conn();
				String query1 = "update bankmgmt set pin = '" + rpin + "' where pin = '" + pinnumber + "'";
				String query2 = "update signup3 set pin = '" + rpin + "' where pin = '" + pinnumber + "'";
				String query3 = "update login set pin = '" + rpin + "' where pin = '" + pinnumber + "'";
				
				conn.s.executeUpdate(query1);
				conn.s.executeUpdate(query2);
				conn.s.executeUpdate(query3);
				
				JOptionPane.showMessageDialog(null, "PIN Changed Successfully");
				
				setVisible(false);
				new Transactions(rpin).setVisible(true);
				
			}
			catch(Exception ae)
			{
				System.out.println(ae);
			}
		}
		else
		{
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}
		
	}
	
	public static void main(String args[])
	{
		new Pinchange("").setVisible(true);
	}
	
}
