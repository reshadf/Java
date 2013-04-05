package h04PacMan;

import java.awt.Color;
import java.awt.Graphics;

public class DrawGhost {

	/*
	 * Drawing of Pacman eating Ghost
	 */

	public void drawGhost(Graphics g, int x, int y, int radius, Color color) {
		
		// ghost body
		g.setColor(color);
		g.fillArc (x, y, radius, radius, 0, 180); 
		
		g.setColor(color);
		g.drawRect(x, y + radius / 2, radius, radius / 2);
		g.fillRect(x, y + radius / 2, radius, radius / 2);

		// ghost eyes
		g.setColor(Color.black);
		g.fillOval(x + radius / 4 ,y + radius / 4 , radius / 5, radius / 5); // drawing eye;
		g.setColor(Color.black);
		g.fillOval(x + radius / 4 + (radius / 4) ,y + radius / 4 , radius / 5, radius / 5); // drawing eye;

	}

}
