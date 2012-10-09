package h04PacMan;

import java.awt.*;
import java.lang.Math;

public class DrawPacMan {
	
	int angle;

	public void drawPacMan(Graphics g, int x, int y, int radius, Color color) {
		
		angle = (int) (20 * (Math.sin((x + y)*2*Math.PI/50) + 1)); 
		g.setColor(color);
		g.fillArc(x, y, 50, 50, angle/2, 360-angle);
		
	}

	public void drawGhost(Graphics g, int x, int y, int radius, Color color) {
		
		g.setColor(color); // color
		g.fillRect(x, y, radius, radius);
		g.drawRect(x, y, radius, radius);
		
	}

}
