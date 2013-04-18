package toDoList;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Databases.MysqlConnect;

public class DataMapper {

	MysqlConnect db = new MysqlConnect();
	String query;
	private final String database = "toDo", user = "root", password = "";
	
	private ArrayList<Integer> id = new ArrayList<Integer>();
	private ArrayList<String> item = new ArrayList<String>();
	private ArrayList<Date> datum = new ArrayList<Date>();

	
	public DataMapper() {
		
	}
	
	public ArrayList<Integer> getId() {
		return id;
	}
	
	public ArrayList<String> getItem() {
		return item;
	}
	
	public ArrayList<Date> getDate() {
		return datum;
	}
	
	public void executeQuery(String query) {
		
		this.query = query;
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			 
			con = db.connectToAndQueryDatabase(database, user, password);
			
			st = con.createStatement();
			st.executeUpdate(query);
			
		} 
		catch (SQLException e1) {
			e1.printStackTrace();
		}
		finally {
			 	if (rs != null) {
			        try {
			            rs.close();
			        } catch (SQLException e2) { /* ignored */}
			    }
			    if (st != null) {
			        try {
			            st.close();
			        } catch (SQLException e2) { /* ignored */}
			    }					    
			    if (con != null) {
			        try {
			            con.close();
			        } catch (SQLException e2) { /* ignored */}
			    }
				System.out.println("connection closed");
		 }
	}

}
