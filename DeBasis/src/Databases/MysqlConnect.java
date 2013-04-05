	package Databases;
	
import java.sql.*;
import java.util.*;
import javax.sql.*;
	
	/*
	 * klasse om een database connectie te maken
	 * @author Reshad Farid 
	 * voorbeeld connectie zie onderstaand.
	 */
	
	public class MysqlConnect{

		public Connection connectToAndQueryDatabase(String database, String username, String password) throws SQLException {
			Connection con = null;
				try {
					con = DriverManager.getConnection(
					                     "jdbc:mysql://localhost:3306/" + database,
					                     username,
					                     password);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				return con;
		}
		
	}