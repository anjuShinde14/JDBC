package com.tka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class one {
public static void main(String[] args) throws Exception {
	System.out.println(1);     
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println(2);
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc1","root","root");
	System.out.println(35);
	Statement statement=connection.createStatement();
	System.out.println(4);
	ResultSet resultSet=statement.executeQuery("select * from  employeee");
	System.out.println(7);
	while(resultSet.next()) {
		String id=resultSet.getString(1);
		System.out.println(1);
		String Fname=resultSet.getString(2);
		System.out.println("id >> "+id);
		System.out.println("Fname >>"+Fname);
	}
}
}

Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc","root","root");
Statement statement=connection.createStatement();
ResultSet resultSet=statement.executeQuery("select * from employee");
while(resultSet.next()) {
	 String id=resultSet.getString(3);
	 String name=resultSet.getString(6);
	 System.out.println(id);
	 syso
}
