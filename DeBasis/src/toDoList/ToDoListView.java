package toDoList;

import java.awt.Color;

import javax.swing.*;

public class ToDoListView extends JPanel {

	private ToDoListModel model;
	
	public ToDoListView(ToDoListModel model) {
		this.model = model;
		
		setBackground(Color.WHITE);		
	}

}
