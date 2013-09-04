package toDoList;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ToDoListController extends JPanel implements ActionListener {
	
	private JTextField toDo;
	private JButton addItem;
	
	private ToDoListModel model;
	private ToDoListView view;

	public ToDoListController(ToDoListModel model, ToDoListView view) {
		this.model = model;
		this.view = view;
		
		setBackground(Color.ORANGE);
		
		toDo = new JTextField(25);
		toDo.addActionListener(this);
		add(toDo);
		
		addItem = new JButton("voeg toe");
		addItem.addActionListener(this);
		add(addItem);
		
		model.getItem();
		view.createTable();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == addItem) {
			view.deleteTable();
			model.setItem(toDo.getText());
			model.getItem();
			toDo.setText("");
			view.createTable();
			view.revalidate();
		}
		
	}
}
