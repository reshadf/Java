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
	private final String database = "toDo", user = "root", password = "";
	
	private ArrayList<Integer> id = new ArrayList<Integer>();
	private ArrayList<String> item = new ArrayList<String>();
	private ArrayList<Date> datum = new ArrayList<Date>();
	private String value;
	private String query;
	private int itemId;

	
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
	
	public ArrayList<ToDoListModel> getModel() {
		
		
		
		return null;
	}
	
	public Object getAll() {
		
		String selectQuery = "SELECT id, item, datum FROM toDoList";
		
		return this.executeQuery(selectQuery);
		
	}
	
	public Object insertItem(String value) {
		
		this.value = value;
		
		String insertQuery = "INSERT INTO toDoList(item,datum) " + "VALUES ('" + value + "', CURDATE())";
		
		return this.executeQuery(insertQuery);
	}
	
	public Object removeItem(int id) {
		
		this.itemId = id;
		String deleteQuery = "DELETE FROM test WHERE id ='" + itemId + "'";
		
		return this.executeQuery(deleteQuery);
		
	}
	
	private ResultSet executeQuery(String query) {
		
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
		return rs;
	}

}
