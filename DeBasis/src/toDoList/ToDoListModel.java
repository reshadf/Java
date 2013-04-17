package toDoList;

import java.sql.*;
import java.sql.Date;
import java.util.*;

import Databases.MysqlConnect;

public class ToDoListModel {
	
	MysqlConnect db = new MysqlConnect();
	
	@SuppressWarnings("unused")
	private String value;
	@SuppressWarnings("unused")
	private ToDoListView view;
	
	private ArrayList<Integer> id = new ArrayList<Integer>();
	private ArrayList<String> item = new ArrayList<String>();
	private ArrayList<Date> datum = new ArrayList<Date>();

	public ToDoListModel(ToDoListView view) {
		this.view = view;
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
	
	public void getValue() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		 try {
			 
			con = db.connectToAndQueryDatabase("toDo", "root", "root");
			
			st = con.createStatement();
			String query = "SELECT id, item, datum FROM toDoList";
			rs = st.executeQuery(query);
			
			while(rs.next()) {
				//System.out.println(rs.getInt("id") + "\n" + rs.getString("item") + "\n" + rs.getDate("datum"));
				id.add(rs.getInt("id"));
				item.add(rs.getString("item"));
				datum.add(rs.getDate("datum"));
		
			}
			
			
		} catch (SQLException e1) {
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
	
	public void insertValue(String value) {
		
		this.value = value;
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		 try {
			 
			con = db.connectToAndQueryDatabase("toDo", "root", "root");
			System.out.println("connection established");
			
			st = con.createStatement();
			String query = "INSERT INTO toDoList(item,datum) " + "VALUES ('" + value + "', CURDATE())";
			st.executeUpdate(query);
			
			
			System.out.println("update query succesfull");
			
			
		} catch (SQLException e1) {
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
	
	public void deleteValue(int itemID) {
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		 try {
			 
			con = db.connectToAndQueryDatabase("toDo", "root", "root");
			System.out.println("connection established");
			
			st = con.createStatement();
			String query = "DELETE FROM test WHERE id ='" + itemID + "'";
			st.executeUpdate(query);
			
			
			System.out.println("delete succesfull");
			
			
		} catch (SQLException e1) {
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
