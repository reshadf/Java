package h03;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LinePanel extends JPanel implements ActionListener {
	
	private JTextField afstand;
	private JButton teken;
	int invoer = Integer.parseInt(afstand.getText());

	public LinePanel() {
		
		teken = new JButton("Teken de lijnen");
		teken.addActionListener(this);
		afstand = new JTextField(2);
		afstand.addActionListener(this);
		
		add(new JLabel("Afstand tussen de lijnen"));
		add(afstand);
		add(teken);
		
	}
	
	DrawLines lines = new DrawLines();
	
	public void paintComponent(Graphics g) {
			
		super.paintComponent(g);
		int positionY = getHeight() - invoer; // absolut positioning
		
		int yPos = 0;
		
		while(yPos <= positionY) {
			
			lines.drawLines(g, 0, yPos, getWidth(), yPos);
			yPos = yPos + Integer.parseInt(afstand.getText());
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		try {
			
			repaint();			
			
		}
		catch(NumberFormatException err) {
			
			JOptionPane.showMessageDialog(null, "something went wrong! heeft u wel een waarde opgegeven?", "Opnieuw", JOptionPane.CANCEL_OPTION);
			
		}
		
	}

}
