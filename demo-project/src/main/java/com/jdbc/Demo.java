package com.jdbc;
import java.sql.*;
public class Demo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/pokemon";
		String username="root";
		String password="pass@word1";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from emp");
		String x;
		int id;
		while(rs.next()) {
			x=rs.getString("name");
			id=rs.getInt("id");
			System.out.print(x+" and id is"+id);
		}
		stmt.close();
		rs.close();
	}

}
