package h04PacMan;

import java.awt.*;
import java.lang.Math;

public class DrawPacMan {
	
	int angle;
	
	/*
	 * Drawing of Pacman
	 */

	public void drawPacMan(Graphics g, int x, int y, int radius, int direction, Color color) {
		
		//pacman body
		angle = (int) (20 * (Math.sin((x + y)*2*Math.PI/50) + 1)); 
		g.setColor(color);
		//System.out.println(angle);
		g.fillArc(x, y, radius, radius, angle/2 + direction, 360-angle);
		
		// pacman eyes
		g.setColor(Color.black);
		g.fillOval(x + radius / 4 ,y + radius / 4 , radius / 5, radius / 5); // drawing eye;

		
	}

}
