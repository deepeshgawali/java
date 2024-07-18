package org.jdbc;
import java.sql.*;
import java.util.Scanner;
public class Crud {
	public static void update() {
		
	}
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/amdocs";
	String username="root";
	String password="pass@word1";
	Connection con=DriverManager.getConnection(url,username,password);
	System.out.println("choose option");
	Scanner sc=new Scanner(System.in);
	/*int x;
	while(x!=5) {
		switch(x) {
		case 1:update();
		case 2:insert();
		case 3:delete();
		case 4:view();
		default: 
			
		}
	}*/
	Statement stmt=con.createStatement();
	/*int x=stmt.executeUpdate("update emp set salary=30000 where name='omega'");
	if(x>0)System.out.print("success");
	else {
		System.out.println("failure");
	}*/
	/*
	int x=stmt.executeUpdate("insert into emp values(29,'diamond',34,'sinnoh',29000)");
	if(x>0)System.out.print("success");
	else {
		System.out.println("failure");
	}*/
	/*int x=stmt.executeUpdate("delete from emp where salary=46000" );
	if(x>0)System.out.print("success");
	else {
		System.out.println("failure");
	}*/
	int x=stmt.executeUpdate("create table Trainers (pokeID varchar(25),starter varchar(25),badges int)" );
	if(x>0)System.out.print("success");
	else {
		System.out.println("failure");
	}
	
	stmt.close();
	
}
}
