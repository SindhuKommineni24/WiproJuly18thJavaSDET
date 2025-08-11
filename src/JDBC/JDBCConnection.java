package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

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
		
		//execute the queries
		String selectquery="select*from persons";
		
		//pass the select query to the result set
		ResultSet rs=st.executeQuery(selectquery);
		
		while(rs.next()) {
			System.out.println(rs.getString("personid"));
			System.out.println(rs.getString("firstname"));
		}
		
		st.close();
		rs.close();
		con.close();
		
	}

}
