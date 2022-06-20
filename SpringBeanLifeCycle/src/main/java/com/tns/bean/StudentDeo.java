package com.tns.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class StudentDeo 
{

	private String driver;
	private String url;
	private String user;
	private String password;
	
	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void selectAllRows() throws ClassNotFoundException, SQLException
	{
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		
		Statement s=con.createStatement();
		ResultSet r= s.executeQuery("SELECT * FROM m16.book");
		while(r.next())
		{
			int id=r.getInt(1);
			String title=r.getString(2);
			String Author=r.getString(3);
			double price=r.getDouble(4);
			System.out.printf("Author ID"+id,"title"+title,"Author Name is:"+Author+"price:"+price);
			
		}
	}
}
