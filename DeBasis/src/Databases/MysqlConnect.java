	package Databases;
	
	import java.sql.*;
	import javax.sql.*;
	
	public class MysqlConnect{
		
		 public void connectToAndQueryDatabase(String username, String password) throws SQLException {
	
			    Connection con = null;
				try {
					con = DriverManager.getConnection(
					                     "jdbc:mysql://localhost:3306/test",
					                     username,
					                     password);
				} catch (SQLException e) {
					e.printStackTrace();
				}
	
			    Statement stmt = con.createStatement();
			    ResultSet rs = stmt.executeQuery("SELECT id, name, job_id, location FROM person");
	
			    while (rs.next()) {
			        int x = rs.getInt("id");
			        String s = rs.getString("name");
			        int f = rs.getInt("job_id");
			        int l = rs.getInt("location");
			        
			        System.out.println("" + x + s + f + l);
			    }
			}
		 
			/**
			 * @param args
			 * @throws SQLException 
			 */
			public static void main(String[] args) throws SQLException {
				
				try {
				    System.out.println("Loading driver...");
				    Class.forName("com.mysql.jdbc.Driver");
				    System.out.println("Driver loaded!");
				} catch (ClassNotFoundException e) {
				    throw new RuntimeException("Cannot find the driver in the classpath!", e);
				}
				
				MysqlConnect db = new MysqlConnect();
				db.connectToAndQueryDatabase("root", "root");
			}
	}