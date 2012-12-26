package toDoList;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ToDoListController extends JPanel implements ActionListener {
	
	private JTextField toDo;
	private JButton add;
	
	private ToDoListModel model;
	private ToDoListView view;

	public ToDoListController(ToDoListModel model, ToDoListView view) {
		this.model = model;
		this.view = view;
		
		setBackground(Color.ORANGE);
		
		toDo = new JTextField(25);
		toDo.addActionListener(this);
		add(toDo);
		
		add = new JButton("voeg toe");
		add.addActionListener(this);
		add(add);
		
		model.getValue();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == add) {
			model.insertValue(toDo.getText());
			model.getValue();
		}
	}
}
