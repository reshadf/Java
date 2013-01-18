package toDoList;

import java.awt.*;
import java.util.*;

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
		
		tableModel = new DefaultTableModel(new Object[][]{},new String[]{"To do","Date added", "Modify"});
    
		table.setSize(450, 600);
	
		
        table.setModel(tableModel);
        JScrollPane scrlPan=new JScrollPane(table);
        
        for(int i = 0; i < model.getId().size(); i++) {
        	
    		tableModel.addRow(new Object[]{
    				model.getItem().get(i), 
    				model.getDate().get(i), 
    				model.getId().get(i)
    				});
        }
        
        add(scrlPan);
        add(table.getTableHeader(), BorderLayout.NORTH);
        add(table, BorderLayout.CENTER);
	}
		
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		table.repaint();
	}
	
}
