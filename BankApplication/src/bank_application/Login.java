package bank_application;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
public class Login extends JFrame implements ActionListener
{
	JButton loginbtn, signupbtn, clearbtn;
	JTextField cardtxt;
	JPasswordField pintxt;
	
	Login()
	{
		setTitle("BANKING SOFTWARE SYSTEM");
		
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("download.jpg"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label = new JLabel(i3);
		label.setBounds(70, 10, 100, 100);
		add(label);
		
		getContentPane().setBackground(Color.WHITE);
		
		JLabel welcomelabel = new JLabel("Welcome to ATM");
		welcomelabel.setFont(new Font("Osward", Font.BOLD,38));
		welcomelabel.setBounds(250, 40, 400, 40);
		add(welcomelabel);
		
		JLabel cardlabel = new JLabel("Card No.:");
		cardlabel.setFont(new Font("Osward", Font.BOLD,38));
		cardlabel.setBounds(120, 150, 180, 40);
		add(cardlabel);
		
		JLabel pinlabel = new JLabel("PIN:");
		pinlabel.setFont(new Font("Osward", Font.BOLD,38));
		pinlabel.setBounds(120, 220, 180, 40);
		add(pinlabel);
		
		cardtxt = new JTextField();
		cardtxt.setBounds(330, 160, 250, 30);
		cardtxt.setFont(new Font("Arial",Font.BOLD,15));
		add(cardtxt);
		
		pintxt = new JPasswordField();
		pintxt.setBounds(330, 230, 250, 30);
		pintxt.setFont(new Font("Arial",Font.BOLD,15));
		add(pintxt);
		
		loginbtn = new JButton("SIGN IN");
		loginbtn.setBounds(330, 300, 100, 30);
		loginbtn.setBackground(Color.BLACK);
		loginbtn.setForeground(Color.WHITE);
		loginbtn.addActionListener(this);
		add(loginbtn);
		
		clearbtn = new JButton("CLEAR");
		clearbtn.setBounds(470, 300, 100, 30);
		clearbtn.setBackground(Color.BLACK);
		clearbtn.setForeground(Color.WHITE);
		clearbtn.addActionListener(this);
		add(clearbtn);
		
		signupbtn = new JButton("SIGN UP");
		signupbtn.setBounds(390, 350, 100, 30);
		signupbtn.setBackground(Color.BLACK);
		signupbtn.setForeground(Color.WHITE);
		signupbtn.addActionListener(this);
		add(signupbtn);
		
		setSize(800, 480);
		setVisible(true);
		setLocation(300, 120);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == clearbtn)
		{
			cardtxt.setText("");
			pintxt.setText("");
		}
		else if(ae.getSource() == loginbtn)
		{
			Conn conn = new Conn();
			String cardnumber = cardtxt.getText();
			String pinnumber = pintxt.getText(); // passwordfield
			
			String query = "select * from login where cardnumber = '" + cardnumber + "' and pin = '" + pinnumber + "'";
			
			
			try
			{
				ResultSet rs = conn.s.executeQuery(query);
				if(rs.next())
				{
					setVisible(false);
					new Transactions(pinnumber).setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Incorrect Card number or pin");
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		else if(ae.getSource() == signupbtn)
		{
			setVisible(false);
			new Signup1().setVisible(true);
		}
	}
	public static void main(String args[])
	{
		new Login();
	}
}
