package bank_application;

import java.awt.Color;
import java.awt.Font;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

import java.awt.event.*;

public class Signup1 extends JFrame implements ActionListener
{
	Random ran;
	
	int random = 0;
	
	JTextField nametxt, fnametxt, dobtxt, emailtxt, addresstxt, citytxt, statetxt, pincodetxt;
	
	JButton next;
	
	JRadioButton maleradiobtn, femaleradiobtn, marriedradio, unmarriedradio, otherradio;
	
	JDateChooser datechooser;
	
	Signup1()
	{
		setLayout(null);
		ran = new Random();
		random = (Math.abs(ran.nextInt())% 1000);
		JLabel formno = new JLabel("APPLICATION FORM NO : " + random); // Random class in util package
		formno.setFont(new Font("Roleway", Font.BOLD,30));
		formno.setBounds(140, 20, 500, 40);
		add(formno);
		
		getContentPane().setBackground(Color.WHITE);
		
		
		JLabel persnaldet = new JLabel("Personal Details");
		persnaldet.setFont(new Font("Roleway", Font.BOLD,22));
		persnaldet.setBounds(260, 70, 200, 30);
		add(persnaldet);
		
		JLabel name = new JLabel("Name : ");
		name.setFont(new Font("Roleway", Font.BOLD,20));
		name.setBounds(100, 140, 100, 30);
		add(name);
		
		nametxt = new JTextField();
		nametxt.setFont(new Font("Roleway",Font.BOLD,14));
		nametxt.setBounds(290, 140, 300, 30);
		add(nametxt);
		
		
		JLabel fname = new JLabel("Father's Name : ");
		fname.setFont(new Font("Roleway", Font.BOLD,20));
		fname.setBounds(100, 180, 180, 30);
		add(fname);
		
		fnametxt = new JTextField();
		fnametxt.setFont(new Font("Roleway",Font.BOLD,14));
		fnametxt.setBounds(290, 180, 300, 30);
		add(fnametxt);
		
		JLabel dob = new JLabel("Date Of Birth : ");
		dob.setFont(new Font("Roleway", Font.BOLD,20));
		dob.setBounds(100, 220, 150, 30);
		add(dob);
		
		datechooser = new JDateChooser();
		datechooser.setBounds(290, 220, 150, 30);
		datechooser.setFont(new Font("Roleway",Font.BOLD,14));
		add(datechooser);
		
		JLabel gender = new JLabel("Gender : ");
		gender.setFont(new Font("Roleway", Font.BOLD,20));
		gender.setBounds(100, 260, 150, 30);
		add(gender);
		
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

		
		
		JLabel email = new JLabel("Email : ");
		email.setFont(new Font("Roleway", Font.BOLD,20));
		email.setBounds(100, 300, 150, 30);
		add(email);
		
		emailtxt = new JTextField();
		emailtxt.setFont(new Font("Roleway",Font.BOLD,14));
		emailtxt.setBounds(290, 300, 300, 30);
		add(emailtxt);
		
		JLabel marital = new JLabel("Marital Status : ");
		marital.setFont(new Font("Roleway", Font.BOLD,20));
		marital.setBounds(100, 340, 150, 30);
		add(marital);
		
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

		
		
		
		JLabel address = new JLabel("Address : ");
		address.setFont(new Font("Roleway", Font.BOLD,20));
		address.setBounds(100, 380, 150, 30);
		add(address);
		
		addresstxt = new JTextField();
		addresstxt.setFont(new Font("Roleway",Font.BOLD,14));
		addresstxt.setBounds(290, 380, 300, 30);
		add(addresstxt);
		
		JLabel city = new JLabel("City : ");
		city.setFont(new Font("Roleway", Font.BOLD,20));
		city.setBounds(100, 420, 150, 30);
		add(city);
		
		citytxt = new JTextField();
		citytxt.setFont(new Font("Roleway",Font.BOLD,14));
		citytxt.setBounds(290, 420, 300, 30);
		add(citytxt);
		
		JLabel state = new JLabel("State : ");
		state.setFont(new Font("Roleway", Font.BOLD,20));
		state.setBounds(100, 460, 150, 30);
		add(state);
		
		statetxt = new JTextField();
		statetxt.setFont(new Font("Roleway",Font.BOLD,14));
		statetxt.setBounds(290, 460, 300, 30);
		add(statetxt);
		
		JLabel pincode = new JLabel("Pin Code : ");
		pincode.setFont(new Font("Roleway", Font.BOLD,20));
		pincode.setBounds(100, 500, 150, 30);
		add(pincode);
		
		pincodetxt = new JTextField();
		pincodetxt.setFont(new Font("Roleway",Font.BOLD,14));
		pincodetxt.setBounds(290, 500, 300, 30);
		add(pincodetxt);
		
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
			
			
			Conn c = new Conn();
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
