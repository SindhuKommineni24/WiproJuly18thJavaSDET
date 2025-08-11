package labsession7;


import java.sql.*;

public class jdbc2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // Database details
        String dburl = "jdbc:mysql://localhost:3306/lab26";
        String username = "root";
        String password = "1234";

        // Load MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connect to DB
        Connection con = DriverManager.getConnection(dburl, username, password);

        String insertQuery = "insert into persons (personid, firstname, lastname, Address, city) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement insertStmt = con.prepareStatement(insertQuery);
        insertStmt.setInt(1, 4554);
        insertStmt.setString(2, "sindhu");
        insertStmt.setString(3, "kommineni");
        insertStmt.setString(4, "Near ABC Street");
        insertStmt.setString(5, "Hyderabad");

        int rowsInserted = insertStmt.executeUpdate();
        System.out.println(rowsInserted + "row inserted");
        con.close();
    }
}

