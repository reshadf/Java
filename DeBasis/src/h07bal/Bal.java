package h07bal;

import java.awt.*;
import javax.swing.*;

/*
 * klasse voor een bal van variabele grootte op een paneel
 * @author Reshad Farid
 */

public class Bal extends JPanel {
	
	private int diameter;
	private final int X_LOC = 0, Y_LOC = 0;

	public Bal(int grootte) {
		diameter = grootte;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.ORANGE);
		g.fillOval(X_LOC, Y_LOC, diameter, diameter);
		g.setColor(Color.BLACK);
		g.drawOval(X_LOC, Y_LOC, diameter, diameter);
		g.drawOval(X_LOC + diameter / 4, Y_LOC, diameter / 2, diameter);
	}

}
