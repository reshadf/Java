package h01MVCstoplicht;

import javax.swing.*;
import java.awt.event.*;

public class VerkeersLichtController extends JPanel implements ActionListener {
	
	private JButton roodKnop, groenKnop, oranjeKnop; 

	@Override
	public void actionPerformed(ActionEvent e) {
		
		roodKnop = new JButton("rood");
		roodKnop.addActionListener(this);
		add(roodKnop);
		
		groenKnop = new JButton("groen");
		groenKnop.addActionListener(this);
		add(groenKnop);
		
		oranjeKnop = new JButton("oranje");
		oranjeKnop.addActionListener(this);
		add(oranjeKnop);
		
		
		
	}

}
