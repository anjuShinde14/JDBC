package com.tka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Two {
 public static void main(String[] args) throws  Exception {
	 System.out.println(3);
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 System.out.println(4);
	 Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3307/institute","root","root");
     Statement statement=connection.createStatement();
     ResultSet resultset=statement.executeQuery("select * from courses");
     while(resultset.next()) {
    	 String c_id=resultset.getString(1);
    	 System.out.println("course id="+c_id);
    	 String c_name=resultset.getString(2);
    	 System.out.println("course name="+c_name);
     }
 }
}