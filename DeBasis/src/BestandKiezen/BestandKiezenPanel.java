package BestandKiezen;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.sql.*;

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
				Connection con = null;
				Statement st = null;
				ResultSet rs = null;
				 try {
					 
					con = db.connectToAndQueryDatabase("test", "root", "root");
					System.out.println("connection established");
					
					st = con.createStatement();
					String query = "SELECT id, name, job_id, location FROM person";
					rs = st.executeQuery(query);
					
					while(rs.next()) {
						System.out.println(rs.getString("name"));
					}
					
					
					System.out.println("Selected query succesfull");
					
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				 finally {
					 	if (rs != null) {
					        try {
					            rs.close();
					        } catch (SQLException e2) { /* ignored */}
					    }
					    if (st != null) {
					        try {
					            st.close();
					        } catch (SQLException e2) { /* ignored */}
					    }					    
					    if (con != null) {
					        try {
					            con.close();
					        } catch (SQLException e2) { /* ignored */}
					    }
						System.out.println("connection closed");
				 }
		}
	}
}
