package JDBCDemo;

import java.sql.*;


public class PreparedStatement {

	public static void main(String[] args) {
		Connection con=null;
		java.sql.PreparedStatement psmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDetails","root","");
			
			String query = "update Student1 set sname=? where sid=?";
			psmt = con.prepareStatement(query);  
			psmt.setString(1,"Lalitha");
			psmt.setInt(2,20);
			int i = psmt.executeUpdate();  
			System.out.println(i+" records updated");  
			
			psmt = con.prepareStatement("select * from Student1");  
			ResultSet rs = psmt.executeQuery();  
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
		catch(Exception e){
			e.printStackTrace();
		}
		
		

		
		
	}
}
