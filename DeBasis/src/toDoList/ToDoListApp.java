package toDoList;

import java.awt.*;
import javax.swing.*;

/*
 * To Do List gemaakt door
 * @author Reshad Farid
 * @version 1.0
 */

public class ToDoListApp {

	JFrame frame = null;
	
	private ToDoListModel model;
	private ToDoListView view;
	private ToDoListController controller;
	
	public ToDoListApp() {
		
		frame = new JFrame();
		frame.setSize(450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("To Do List");
		frame.setLocationRelativeTo(null);
		
		frame.setLayout(new BorderLayout());
		
		model = new ToDoListModel(view);
		view = new ToDoListView(model);
		controller = new ToDoListController(model, view);
		
		frame.add(view, BorderLayout.CENTER);
		frame.add(controller, BorderLayout.NORTH);
		
		frame.setVisible(true);

	}
	
	public static void main(String[] args) {
		new ToDoListApp();
	}

}