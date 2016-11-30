package lu.uni.lassy.excalibur.examples.icrash.dev.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
/**
 * Simple Java program to connect to MySQL database running on localhost and
 * running SELECT and INSERT query to retrieve and add data.
 * @author Javin Paul
 */
public class MySQLController {
 
    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/icrashfx";
    private static final String user = "root";
    private static final String password = "";
 
    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
 
    public static void main(String args[]) {
        String query = "select count(*) from books";
 
        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);
 
            // getting Statement object to execute query
            stmt = con.createStatement();
 
            // executing SELECT query
            rs = stmt.executeQuery(query);
 
            while (rs.next()) {
                int count = rs.getInt(1);
                System.out.println("Total number of books in the table : " + count);
            }
            
 
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }
    }
    
    public void generateCode(String login)
    {
    	String query = "UPDATE Coordinators SET code = 200 WHERE login = "+login;
    		
    	
    }
    public String getData(String query)
    {
    	String temp=" ";
    	return temp;
    }
    public String insertData(String query)
    {
    	String temp=" ";
    	return temp;
    }
}