package bank_application;

import java.awt.Color;
import java.awt.Font;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

import java.awt.event.*;

public class Signup2 extends JFrame implements ActionListener
{
	// assign some field as globally for using them
	JTextField pantxt, aadhartxt;
	
	JButton next;
	
	JRadioButton syes, sno, eyes, eno;
	
	JComboBox religonbox, categorybox, incomebox, educationbox,occupationbox; // tick marks wale boxes
	
	String formno;
	
	Signup2(String formno)
	{
		this.formno = formno;
		
		setLayout(null);
		
		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
		
		
		getContentPane().setBackground(Color.WHITE);
		
		// title
		JLabel additinaldetailslabel = new JLabel("Additional Details");
		additinaldetailslabel.setFont(new Font("Roleway", Font.BOLD,22));
		additinaldetailslabel.setBounds(260, 70, 200, 30);
		add(additinaldetailslabel);
		
		// religion label
		JLabel religionlabel = new JLabel("Religion : ");
		religionlabel.setFont(new Font("Roleway", Font.BOLD,20));
		religionlabel.setBounds(100, 140, 100, 30);
		add(religionlabel);
		
		// values for religion
		String valuesOfReligion[] = {"Hindu", "Muslim", "Sikh", "Christian","Other"};
		religonbox = new JComboBox(valuesOfReligion);
		religonbox.setBounds(290, 140, 300, 30);
		religonbox.setBackground(Color.WHITE);
		add(religonbox);
		
		// category label
		JLabel categorylabel = new JLabel("Category : ");
		categorylabel.setFont(new Font("Roleway", Font.BOLD,20));
		categorylabel.setBounds(100, 180, 180, 30);
		add(categorylabel);
		
		// values for category
		String valuesOfCategory[] = {"General", "OBC", "SC", "ST", "Other"};
		categorybox = new JComboBox(valuesOfCategory);
		categorybox.setBounds(290, 180, 300, 30);
		categorybox.setBackground(Color.WHITE);
		add(categorybox);
		
		// income label
		JLabel incomelabel = new JLabel("Income : ");
		incomelabel.setFont(new Font("Roleway", Font.BOLD,20));
		incomelabel.setBounds(100, 220, 150, 30);
		add(incomelabel);
		
		// values for income
		String valuesOfIncome[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
		incomebox = new JComboBox(valuesOfIncome);
		incomebox.setBounds(290, 220, 300, 30);
		incomebox.setBackground(Color.WHITE);
		add(incomebox);
		
		// education label
		JLabel educationlabel = new JLabel("Educational ");
		educationlabel.setFont(new Font("Roleway", Font.BOLD,20));
		educationlabel.setBounds(100, 260, 150, 30);
		add(educationlabel);
		
		// values for education
		String valuesOfEducation[] = {"Non-Graduate", "Graduate", "Post-Graduation", "Doctorate", "Others"};
		educationbox = new JComboBox(valuesOfEducation);
		educationbox.setBounds(290, 290, 300, 30);
		educationbox.setBackground(Color.WHITE);
		add(educationbox);
		
		
		JLabel qualificationlabel = new JLabel("Qualification : ");
		qualificationlabel.setFont(new Font("Roleway", Font.BOLD,20));
		qualificationlabel.setBounds(100, 290, 150, 30);
		add(qualificationlabel);
		
		
		// occupation label
		JLabel occupationlabel = new JLabel("Occupation : ");
		occupationlabel.setFont(new Font("Roleway", Font.BOLD,20));
		occupationlabel.setBounds(100, 340, 150, 30);
		add(occupationlabel);
		
		// values for occupation
		String valuesOfOcuupation[] = {"Salaried", "Self-Employed", "Business", "Student", "Farmer", "Others"};
		occupationbox = new JComboBox(valuesOfOcuupation);
		occupationbox.setBounds(290, 340, 300, 30);
		occupationbox.setBackground(Color.WHITE);
		add(occupationbox);
		
		// pancard label
		JLabel panlabel = new JLabel("PAN Number : ");
		panlabel.setFont(new Font("Roleway", Font.BOLD,20));
		panlabel.setBounds(100, 380, 150, 30);
		add(panlabel);
		
		// pancard txtfield
		pantxt = new JTextField();
		pantxt.setFont(new Font("Roleway",Font.BOLD,14));
		pantxt.setBounds(290, 380, 300, 30);
		add(pantxt);
		
		// aadhar label
		JLabel aadharlabel = new JLabel("Aadhar Number : ");
		aadharlabel.setFont(new Font("Roleway", Font.BOLD,20));
		aadharlabel.setBounds(100, 420, 180, 30);
		add(aadharlabel);
		
		// aadhar txtfield
		aadhartxt = new JTextField();
		aadhartxt.setFont(new Font("Roleway",Font.BOLD,14));
		aadhartxt.setBounds(290, 420, 300, 30);
		add(aadhartxt);
		
		// senior citi. label
		JLabel seniorcitizenlabel = new JLabel("Senior Citizen : ");
		seniorcitizenlabel.setFont(new Font("Roleway", Font.BOLD,20));
		seniorcitizenlabel.setBounds(100, 460, 150, 30);
		add(seniorcitizenlabel);
		
		// options for senior citi.
		syes = new JRadioButton("Yes");
		syes.setBackground(Color.WHITE);
		syes.setBounds(290, 460, 100, 30);
		add(syes);
		
		sno = new JRadioButton("No");
		sno.setBounds(390, 460, 100, 30);
		sno.setBackground(Color.WHITE);
		add(sno);
		
		ButtonGroup seniorcitizonbtngroup = new ButtonGroup();
		seniorcitizonbtngroup.add(syes);
		seniorcitizonbtngroup.add(sno);
		
		// existing acc label
		JLabel existingaclabel = new JLabel("Existing A/C : ");
		existingaclabel.setFont(new Font("Roleway", Font.BOLD,20));
		existingaclabel.setBounds(100, 500, 150, 30);
		add(existingaclabel);
		
		// options for existing acc
		eyes = new JRadioButton("Yes");
		eyes.setBackground(Color.WHITE);
		eyes.setBounds(290, 500, 100, 30);
		add(eyes);
		
		eno = new JRadioButton("No");
		eno.setBounds(390, 500, 100, 30);
		eno.setBackground(Color.WHITE);
		add(eno);
		
		ButtonGroup existingacbtngroup = new ButtonGroup();
		existingacbtngroup.add(eyes);
		existingacbtngroup.add(eno);

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
		// collect data for query
		String religion = (String)religonbox.getSelectedItem();
		String category = (String)categorybox.getSelectedItem();
		String income = (String) incomebox.getSelectedItem();
		String education = (String) educationbox.getSelectedItem();
		String occupation = (String) occupationbox.getSelectedItem();
		
		
		String seniorcitizen = null;
		if(syes.isSelected()) seniorcitizen = "Yes";
		else if(sno.isSelected()) seniorcitizen = "No";
		
		String existingac = null;
		if(eyes.isSelected()) existingac = "Yes";
		else if(eno.isSelected()) existingac = "No";
		
		String pan = pantxt.getText();
		String aadhar = aadhartxt.getText();
		
		try
		{
//			if(name.equals(""))
//			{
//				JOptionPane.showMessageDialog(null, "Name is required");
//			}
//			if(dob.equals(""))
//			{
//				JOptionPane.showMessageDialog(null, "DOB is required");
//			}
//			if(gender.equals(""))
//			{
//				JOptionPane.showMessageDialog(null, "Gender is required");
//			}
//			if(email.equals(""))
//			{
//				JOptionPane.showMessageDialog(null, "Email is required");
//			}
//			if(address.equals(""))
//			{
//				JOptionPane.showMessageDialog(null, "Address is required");
//			}
//			if(state.equals(""))
//			{
//				JOptionPane.showMessageDialog(null, "State is required");
//			}
//			if(pincode.equals(""))
//			{
//				JOptionPane.showMessageDialog(null, "Pincode is required");
//			}
			
			// create connection
			Conn c = new Conn();
			// form a query
			String query = "insert into signup2 values('" + formno + "','" + religion + "','" + category + "','" + income + "','" + education + "','" + occupation + "','" + pan + "','" + aadhar + "','" + seniorcitizen + "','" + existingac + "')";
			// execute query
			c.s.executeUpdate(query);
			
			setVisible(false); // close curr window
			new Signup3(formno).setVisible(true); // open new window
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	public static void main(String args[])
	{
		new Signup2("");
	}
}
