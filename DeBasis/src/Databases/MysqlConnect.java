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
		
		 private Connection con = null;

		public void connectToAndQueryDatabase(String database, String username, String password) throws SQLException {

				try {
					con = DriverManager.getConnection(
					                     "jdbc:mysql://localhost:3306/" + database,
					                     username,
					                     password);
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
		public void closeCon() {
			con = null;
		}
	}