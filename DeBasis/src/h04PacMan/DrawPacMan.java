package h04PacMan;

import java.awt.*;
import java.lang.Math;

public class DrawPacMan {
	
	int angle;
	
	/*
	 * Drawing of Pacman
	 */

	public void drawPacMan(Graphics g, int x, int y, int radius, Color color) {
		
		//pacman body
		angle = (int) (20 * (Math.sin((x + y)*2*Math.PI/50) + 1)); 
		g.setColor(color);
		g.fillArc(x, y, radius, radius, angle/2, 360-angle);
		
		// pacman eyes
		g.setColor(Color.black);
		g.fillOval(x + 15 ,y + 5 , radius / 4, radius / 4); // drawing eye;

		
	}
	
	/*
	 * Drawing of Pacman eating Ghost
	 */

	public void drawGhost(Graphics g, int x, int y, int radius, Color color) {
		
		// ghost body
		g.setColor(color);
		g.fillArc (x, y, radius, radius, 0, 180); 

		// ghost eyes
		g.setColor(color.black);
		g.drawOval(x + 20,y + 15, 10,5); 
		g.fillOval(x + 20,y + 15, 5,5); 
		g.drawOval(x + 40,y +15, 10,5);
		g.fillOval(x + 40, y + 15, 5,5); 
		
	}

}
