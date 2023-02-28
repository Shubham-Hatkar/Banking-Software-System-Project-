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
	JPasswordField pintxt; // Here jpassword field - > will not show the actual txt
	
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
		
		// Welcome Label
		JLabel welcomelabel = new JLabel("Welcome to OurBank");
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
		
		// Assign card and pass textfield globally so that we can use that in another function.(action performed)
		cardtxt = new JTextField();
		cardtxt.setBounds(330, 160, 250, 30);
		cardtxt.setFont(new Font("Arial",Font.BOLD,15));
		add(cardtxt);
		
		pintxt = new JPasswordField();
		pintxt.setBounds(330, 230, 250, 30);
		pintxt.setFont(new Font("Arial",Font.BOLD,15));
		add(pintxt);
		
		// Login JButton and here action listner is added
		loginbtn = new JButton("LOG IN");
		loginbtn.setBounds(330, 300, 100, 30);
		loginbtn.setBackground(Color.BLACK);
		loginbtn.setForeground(Color.WHITE);
		loginbtn.addActionListener(this);
		add(loginbtn);
		
		// Clear JButton and here also action listener is added
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
		// checking which button is clicked.
		if(ae.getSource() == clearbtn)
		{
			cardtxt.setText("");
			pintxt.setText("");
		}
		else if(ae.getSource() == loginbtn)
		{
			// Make a connection with DB
			Conn conn = new Conn();
			
			// Getting all the fields which are required to perform query
			String cardnumber = cardtxt.getText();
			String pinnumber = pintxt.getText(); // passwordfield
			
			// Creating query
			String query = "select * from login where cardnumber = '" + cardnumber + "' and pin = '" + pinnumber + "'";
			
			// exception handling
			try
			{
				// resultset will store result after performing query
				ResultSet rs = conn.s.executeQuery(query);
				if(rs.next())
				{
					setVisible(false); // closing curr window
					new Transactions(pinnumber).setVisible(true); // opening new window
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Incorrect Card number or pin"); // showing errot mgs
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
