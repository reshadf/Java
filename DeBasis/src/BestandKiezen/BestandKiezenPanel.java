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
				
				try {
					Statement stmt = db.createStatement();
					ResultSet rs = stmt.executeQuery(query);
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
				
				db.closeCon();
				
			} catch (SQLException sqlE) {

				System.out.println("fout met query");
				sqlE.printStackTrace();
			}
		}
		else {
		
		}
	}

}
