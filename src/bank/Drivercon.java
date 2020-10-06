package bank;

import java.sql.*;


public class Drivercon {
	Connection c;
	Statement s;
	public Drivercon() {
		try {
	
	String url = "jdbc:mysql://localhost:3306/bank";
	String user = "ajay";
	String pass = "password";
	Class.forName("com.mysql.jdbc.Driver");
	c =DriverManager.getConnection(url, user, pass);
	s=c.createStatement();
		} catch(Exception e){
          System.out.println(e);
		}
	}
	
}