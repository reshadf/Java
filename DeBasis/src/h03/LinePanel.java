package h03;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LinePanel extends JPanel implements ActionListener {
	
	private JTextField afstand;
	private JButton teken;

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
	int input = Integer.parseInt(afstand.getText());
	int positionY = getHeight() - input; // absolut positioning
	int yPos = 0;
	public void paintComponent(Graphics g) {
			
		super.paintComponent(g);
		
		
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
