package h01MVCstoplicht;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class VerkeersLichtController extends JPanel implements ActionListener {
	
	private JButton roodKnop, groenKnop, oranjeKnop; 
	private VerkeersLichtView view;
	private VerkeersLichtModel model;
	
	public VerkeersLichtController(VerkeersLichtModel model, VerkeersLichtView view) {
		this.model = model;
		this.view = view;
		
		setBackground(Color.GRAY);
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		
		model.reset();
		
		if(e.getSource() == roodKnop) {
			model.setRood();
		}
		if(e.getSource() == oranjeKnop) {
			model.setOranje();
		}
		if(e.getSource() == groenKnop) {
			model.setGroen();
		}
		
		view.repaint();
		
	}

}
