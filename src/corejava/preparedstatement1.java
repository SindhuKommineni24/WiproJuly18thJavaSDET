package corejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class preparedstatement1 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		
		//fetch the db url,username and password of the mysql db
		String dburl="jdbc:mysql://localhost:3306/lab26";
		String username="root";
		String password="1234";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//load the mysql driver file
		//the line Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection(dburl,username,password);
		
		//create the statement object
		
		Statement st=con.createStatement();
		
		//execute the select with one parameter
		String selectquery="select*from persons where firstname=?";
		PreparedStatement ps=con.prepareStatement(selectquery);
		
		ps.setString(1,"sindhu");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("firstname"));
			System.out.println(rs.getString("lastname"));
		}
		
		//execute the select with two parameters
		//hard coded query
		String query1="select*from persons where firstname='sindhu' and personid=4554";
		String query2="select*from persons where firstname=? and personid=?";
		
		PreparedStatement ps1=con.prepareStatement(selectquery);
		
		ps1.setString(1,"sindhu");
		ps1.setInt(1,4554);
		
		ResultSet rs1=ps.executeQuery();
		while(rs1.next()) {
			System.out.println(rs1.getString("Address"));
			System.out.println(rs1.getString("lastname"));
			System.out.println(rs1.getString("city"));
		}	
		
	}
		

}
