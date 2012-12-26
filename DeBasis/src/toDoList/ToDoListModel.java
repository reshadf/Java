package toDoList;

import java.sql.*;

import Databases.MysqlConnect;

public class ToDoListModel {
	
	MysqlConnect db = new MysqlConnect();
	
	private String value;
	private ToDoListView view;

	public ToDoListModel(ToDoListView view) {
		this.view = view;
	}
	
	public void getValue() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		 try {
			 
			con = db.connectToAndQueryDatabase("test", "root", "root");
			System.out.println("connection established");
			
			st = con.createStatement();
			String query = "SELECT id, item, datum FROM toDoList";
			rs = st.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getInt("id") + "\n" + rs.getString("item") + "\n" + rs.getDate("datum"));
				
			}
			
			
			System.out.println("Selected query succesfull");
			
			
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
			 
			con = db.connectToAndQueryDatabase("test", "root", "root");
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

}
