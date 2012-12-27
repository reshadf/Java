package toDoList;

import java.awt.*;
import java.util.*;

import javax.swing.*;
import javax.swing.table.*;

public class ToDoListView extends JPanel {

	private ToDoListModel model;
	
	JTable table = null;
	
	public ToDoListView(ToDoListModel model) {
		this.model = model;
		
		setBackground(Color.WHITE);
		
		JTable table = new JTable();
		
		DefaultTableModel tableModel = new DefaultTableModel(new Object[][]{},new String[]{"To do","Date added"});
    
        table.setModel(tableModel);
        
        tableModel.addRow(new Object[]{"something","1-1-2012"});
        
        for(int i = 0; i < model.getRows().size(); i++) {
        	
        		tableModel.addRow(model.getRows().get(i));
        }
        
        add(table);
		
	}

}
