package toDoList;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class ToDoListView extends JPanel {

	private ToDoListModel model;
	
	protected JTable table;
	protected DefaultTableModel tableModel;
	
	public ToDoListView(ToDoListModel model) {
		this.model = model;
		
		setBackground(Color.WHITE);
		
		this.setLayout(new BorderLayout());
		
		
		
	}
	
	public void createTable() {
		
		table = new JTable();
		
		tableModel = new DefaultTableModel(new Object[][]{},new String[]{"To do","Date added", "ID"});
    
		table.setSize(450, 600);
		
		JScrollPane scrollPane = new JScrollPane(table);
		this.add(scrollPane);
		
        table.setModel(tableModel);
        
        for(int i = 0; i < model.getId().size(); i++) {
        	
    		tableModel.addRow(new Object[]{
    				model.getItem().get(i), 
    				model.getDatum().get(i), 
    				model.getId().get(i)
    				});
        }
        
        add(table.getTableHeader(), BorderLayout.NORTH);
        add(table, BorderLayout.CENTER);
	}
	
	 public void deleteTable() {
		   remove(table);
		    table = null;
		    tableModel = null;
	}
}
