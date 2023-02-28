package bank_application;

import java.awt.Color;
import java.awt.Font;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

import java.awt.event.*;

public class Signup1 extends JFrame implements ActionListener
{
	Random ran; // Random no for creating form numbers
	
	int random = 0;
	
	// i have declare some fields globally so that we can use them wherever it needed.
	JTextField nametxt, fnametxt, dobtxt, emailtxt, addresstxt, citytxt, statetxt, pincodetxt;
	
	JButton next; 
	
	JRadioButton maleradiobtn, femaleradiobtn, marriedradio, unmarriedradio, otherradio;
	
	JDateChooser datechooser; // Taken jar file and added into libraries
	
	Signup1()
	{
		setLayout(null);
		
		// Forming random number using random class
		ran = new Random();
		random = (Math.abs(ran.nextInt())% 1000);
		JLabel formno = new JLabel("APPLICATION FORM NO : " + random); // Random class in util package
		formno.setFont(new Font("Roleway", Font.BOLD,30));
		formno.setBounds(140, 20, 500, 40);
		add(formno);
		
		getContentPane().setBackground(Color.WHITE);
		
		// personal detail label
		JLabel persnaldet = new JLabel("Personal Details");
		persnaldet.setFont(new Font("Roleway", Font.BOLD,22));
		persnaldet.setBounds(260, 70, 200, 30);
		add(persnaldet);
		
		// name label
		JLabel name = new JLabel("Name : ");
		name.setFont(new Font("Roleway", Font.BOLD,20));
		name.setBounds(100, 140, 100, 30);
		add(name);
		
		// name textfield
		nametxt = new JTextField();
		nametxt.setFont(new Font("Roleway",Font.BOLD,14));
		nametxt.setBounds(290, 140, 300, 30);
		add(nametxt);
		
		// father name label
		JLabel fname = new JLabel("Father's Name : ");
		fname.setFont(new Font("Roleway", Font.BOLD,20));
		fname.setBounds(100, 180, 180, 30);
		add(fname);
		
		// father name textfield
		fnametxt = new JTextField();
		fnametxt.setFont(new Font("Roleway",Font.BOLD,14));
		fnametxt.setBounds(290, 180, 300, 30);
		add(fnametxt);
		
		// DOB label
		JLabel dob = new JLabel("Date Of Birth : ");
		dob.setFont(new Font("Roleway", Font.BOLD,20));
		dob.setBounds(100, 220, 150, 30);
		add(dob);
		
		// Calender for DOB
		datechooser = new JDateChooser();
		datechooser.setBounds(290, 220, 150, 30);
		datechooser.setFont(new Font("Roleway",Font.BOLD,14));
		add(datechooser);
		
		// gender label
		JLabel gender = new JLabel("Gender : ");
		gender.setFont(new Font("Roleway", Font.BOLD,20));
		gender.setBounds(100, 260, 150, 30);
		add(gender);
		
		// options for gender
		maleradiobtn = new JRadioButton("Male");
		femaleradiobtn = new JRadioButton("Female");
		maleradiobtn.setBounds(290, 260, 70, 30);
		femaleradiobtn.setBounds(390, 260, 70, 30);
		maleradiobtn.setBackground(Color.WHITE);
		femaleradiobtn.setBackground(Color.WHITE);
		add(maleradiobtn);
		add(femaleradiobtn);
		
		ButtonGroup gendergroup = new ButtonGroup();
		gendergroup.add(femaleradiobtn);
		gendergroup.add(maleradiobtn);

		
		// email label
		JLabel email = new JLabel("Email : ");
		email.setFont(new Font("Roleway", Font.BOLD,20));
		email.setBounds(100, 300, 150, 30);
		add(email);
		
		// email txtfield
		emailtxt = new JTextField();
		emailtxt.setFont(new Font("Roleway",Font.BOLD,14));
		emailtxt.setBounds(290, 300, 300, 30);
		add(emailtxt);
		
		// marital label
		JLabel marital = new JLabel("Marital Status : ");
		marital.setFont(new Font("Roleway", Font.BOLD,20));
		marital.setBounds(100, 340, 150, 30);
		add(marital);
		
		// options for marital
		marriedradio = new JRadioButton("Married");
		marriedradio.setBackground(Color.WHITE);
		marriedradio.setBounds(290, 340, 100, 30);
		add(marriedradio);
		
		unmarriedradio = new JRadioButton("Unmarried");
		unmarriedradio.setBounds(390, 340, 100, 30);
		unmarriedradio.setBackground(Color.WHITE);
		add(unmarriedradio);
		
	    otherradio = new JRadioButton("Other");
		otherradio.setBounds(500, 340, 100, 30);
		otherradio.setBackground(Color.WHITE);
		add(otherradio);
		
		ButtonGroup maritalbtngrp = new ButtonGroup();
		maritalbtngrp.add(marriedradio);
		maritalbtngrp.add(unmarriedradio);
		maritalbtngrp.add(otherradio);

		
		
		// address label
		JLabel address = new JLabel("Address : ");
		address.setFont(new Font("Roleway", Font.BOLD,20));
		address.setBounds(100, 380, 150, 30);
		add(address);
		
		// address txtfield
		addresstxt = new JTextField();
		addresstxt.setFont(new Font("Roleway",Font.BOLD,14));
		addresstxt.setBounds(290, 380, 300, 30);
		add(addresstxt);
		
		// city label
		JLabel city = new JLabel("City : ");
		city.setFont(new Font("Roleway", Font.BOLD,20));
		city.setBounds(100, 420, 150, 30);
		add(city);
		
		// city txtfield
		citytxt = new JTextField();
		citytxt.setFont(new Font("Roleway",Font.BOLD,14));
		citytxt.setBounds(290, 420, 300, 30);
		add(citytxt);
		
		// state label
		JLabel state = new JLabel("State : ");
		state.setFont(new Font("Roleway", Font.BOLD,20));
		state.setBounds(100, 460, 150, 30);
		add(state);
		
		// state txtfield
		statetxt = new JTextField();
		statetxt.setFont(new Font("Roleway",Font.BOLD,14));
		statetxt.setBounds(290, 460, 300, 30);
		add(statetxt);
		
		// pincode label
		JLabel pincode = new JLabel("Pin Code : ");
		pincode.setFont(new Font("Roleway", Font.BOLD,20));
		pincode.setBounds(100, 500, 150, 30);
		add(pincode);
		
		// pincode txtfield
		pincodetxt = new JTextField();
		pincodetxt.setFont(new Font("Roleway",Font.BOLD,14));
		pincodetxt.setBounds(290, 500, 300, 30);
		add(pincodetxt);
		
		// next jbutton
		next = new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setBounds(620, 560, 80, 30);
		next.addActionListener(this);;
		add(next);
		
		
		setSize(800,660);
		setLocation(350,10);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		// getting all the data required for query
		String formno = "" + random;
		String name = nametxt.getText();
		String fname = fnametxt.getText();
		String dob = ((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
		String gender = null;
		if(maleradiobtn.isSelected()) gender = "male";
		else if(femaleradiobtn.isSelected()) gender = "female";
		
		String email = emailtxt.getText();
		String marital = null;
		if(marriedradio.isSelected()) marital = "married";
		else if(unmarriedradio.isSelected()) marital = "unmarried";
		else if(otherradio.isSelected()) marital = "other";
		
		String address = addresstxt.getText();
		String city = citytxt.getText();
		String state = statetxt.getText();
		String pincode = pincodetxt.getText();
		
		try
		{
			// Father name, marital status, city ignored.
			// Validation
			
			if(name.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Name is required");
			}
			if(dob.equals(""))
			{
				JOptionPane.showMessageDialog(null, "DOB is required");
			}
			if(gender.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Gender is required");
			}
			if(email.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Email is required");
			}
			if(address.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Address is required");
			}
			if(state.equals(""))
			{
				JOptionPane.showMessageDialog(null, "State is required");
			}
			if(pincode.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Pincode is required");
			}
			
			
			Conn c = new Conn(); // connection
			String query = "insert into signup values('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + marital + "','" + address + "','" + city + "','" + pincode + "','" + state + "')";
			c.s.executeUpdate(query);
			
			setVisible(false); // current closed
			new Signup2(formno).setVisible(true); // new opened Here Form Number will be primary key
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	public static void main(String args[])
	{
		new Signup1();
	}
}
