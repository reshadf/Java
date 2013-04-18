package toDoList;

import java.sql.Date;

public class ToDoListModel {
	
	int id;
	String item;
	Date datum;
	
	public ToDoListModel(ToDoListView view) {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

}
