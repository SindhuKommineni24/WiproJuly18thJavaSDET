package labsession7;
import java.sql.*;

public class jdbc3 {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/companydb", "root", "1234");
        Statement stmt = con.createStatement();

        // Optional: Clear old data
        stmt.executeUpdate("DELETE FROM employees");

        // INSERT
        stmt.executeUpdate("INSERT INTO employees VALUES " +
            "(101, 'Alice', 'HR', 50000)," +
            "(102, 'Bob', 'IT', 65000)," +
            "(103, 'Charlie', 'Sales', 60000)");

        // SELECT ALL
        ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
        while (rs.next())
            System.out.println(rs.getInt(1) + " " + rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));

        // SELECT WHERE id = 102
        rs = stmt.executeQuery("SELECT * FROM employees WHERE id = 102");
        while (rs.next())
            System.out.println("Name: " + rs.getString("name"));

        // SELECT WHERE department = 'IT'
        rs = stmt.executeQuery("SELECT * FROM employees WHERE department = 'IT'");
        while (rs.next())
            System.out.println("IT Employee: " + rs.getString("name"));

        // UPDATE salary
        stmt.executeUpdate("UPDATE employees SET salary = 70000 WHERE id = 102");

        // UPDATE department
        stmt.executeUpdate("UPDATE employees SET department = 'Finance' WHERE name = 'Alice'");

        // DELETE by id
        stmt.executeUpdate("DELETE FROM employees WHERE id = 103");

        // DELETE by department
        stmt.executeUpdate("DELETE FROM employees WHERE department = 'Sales'");

        con.close();
    }
}
