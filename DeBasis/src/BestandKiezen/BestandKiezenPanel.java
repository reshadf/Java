package BestandKiezen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Databases.MysqlConnect;

public class BestandKiezenPanel extends JPanel implements ActionListener {

	private JButton openKnop, saveKnop;
	private JTextArea tekstvak;
	private JFrame frame;
	
	public BestandKiezenPanel(JFrame parentFrame) {
		
		frame = parentFrame;
		
		openKnop = new JButton("Openen...");
		openKnop.addActionListener(this);
		
		add(openKnop);
		
		saveKnop = new JButton("Opslaan als...");
		saveKnop.addActionListener(this);
		
		add(saveKnop);
		
		tekstvak = new JTextArea(8, 26);
		tekstvak.setLineWrap(true);
		tekstvak.setWrapStyleWord(true);
		
		add(tekstvak);

	}
	
	MysqlConnect db = new MysqlConnect();

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == openKnop) {
				
				 try {
					 String query = "SELECT id, name, job_id, location FROM person WHERE name = 'Tom Swift'";
					 
					db.connectToAndQueryDatabase("test", "root", "root");
					
					System.out.println("connectie tot stand gebracht");
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				 finally {
					 db.closeCon();
						System.out.println("connectie gesloten");
				 }
		}
		else {
		
		}
	
	}

}
