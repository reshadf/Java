package h03diagonaal;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel implements ActionListener {
	
	private JTextField tussenRuimte;
	private JButton tekenKnop;

	public DrawPanel() {
		
		tekenKnop = new JButton("Teken de lijnen");
		tekenKnop.addActionListener(this);
		tussenRuimte = new JTextField(3);
		tussenRuimte.addActionListener(this);
		
		add(new JLabel("Afstand tussen de lijnen"));
		add(tussenRuimte);
		add(tekenKnop);
		
	}
	
	DrawLines line = new DrawLines();
	int value = 8;
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		int xPos = 0;
		int yPos = getHeight() - (getHeight() / 2);
		
		for(int aantalLines = 0; aantalLines < 20; aantalLines++ ) {
			  line.drawLines(g, xPos,       yPos +        ((aantalLines + 1) * value), 
			                    getWidth(), getHeight() - ((aantalLines + 1) * value) );
			}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		try {
			value = Integer.parseInt(tussenRuimte.getText());
			repaint();
		}
		catch(NumberFormatException err) {
			JOptionPane.showMessageDialog(null, "Number Format Error: Vul alles goed in s.v.p");
		}
		
	}

}
