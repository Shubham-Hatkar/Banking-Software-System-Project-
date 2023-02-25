package bank_application;

import java.sql.*;
public class Conn 
{
	Connection c;
	Statement s;
	public Conn()
	{
		try
		{
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root"); // Create connection
			s = c.createStatement();  //create stmt
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
