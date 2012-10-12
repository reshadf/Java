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
		System.out.println(angle);
		g.fillArc(x, y, radius, radius, angle/2 + direction, 360-angle);
		
		// pacman eyes
		g.setColor(Color.black);
		g.fillOval(x + 20 ,y + 15 , radius / 5, radius / 5); // drawing eye;

		
	}
	
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
		g.setColor(color.black);
		g.drawOval(x + 20,y + 15, 10,5); 
		g.fillOval(x + 20,y + 15, 5,5); 
		g.drawOval(x + 40,y +15, 10,5);
		g.fillOval(x + 40, y + 15, 5,5); 
		
	}

}
