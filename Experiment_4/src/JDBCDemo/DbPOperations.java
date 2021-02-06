package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbPOperations {
	
	public static void main(String[] args) throws SQLException {
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDetails","root","");
		
		
			Statement stmt = con.createStatement();
		
			System.out.println("Creating Table STUDENT1ent...");
			String query = "create table STUDENT1(sid integer, sname varchar(20), branch varchar(10))";
			stmt.executeUpdate(query);
			System.out.println("Created table in the database...");
		
			System.out.println("Inserting records into the table...");
			String query1 = "INSERT INTO STUDENT1 VALUES (10, 'Rineesha', 'IT')";
			stmt.executeUpdate(query1);
			query1 = "INSERT INTO STUDENT1 VALUES (20, 'Lavanya', 'IT')";
			stmt.executeUpdate(query1);
			query1 = "INSERT INTO STUDENT1 VALUES (30, 'Supriya', 'CSE')";
			stmt.executeUpdate(query1);
			query1 = "INSERT INTO STUDENT1 VALUES (40, 'Geetha', 'ECE')";
			stmt.executeUpdate(query1);
			System.out.println("Records inserted into the table...");
	    
			String query2 = "SELECT * from STUDENT1";
			ResultSet rs = stmt.executeQuery(query2);
			while(rs.next()){
				int sid  = rs.getInt("sid");
				String sname = rs.getString("sname");
				String branch = rs.getString("branch");

				System.out.print("ID: " + sid);
				System.out.print(", Name: " + sname);
				System.out.println(", Branch: " + branch);
				System.out.println();
			}
	      
	    	  con.close();
	      }
	      catch(Exception e) {
	    	  e.printStackTrace();
	      }
	}

}
