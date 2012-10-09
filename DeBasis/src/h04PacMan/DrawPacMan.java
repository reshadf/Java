package h04PacMan;

import java.awt.*;

public class DrawPacMan {

	public void drawPacMan(Graphics g, int x, int y, int radius, Color color) {
		
		g.setColor(color);
		g.fillArc(x,y,radius,radius,30,300);
		
	}

	public void drawGhost(Graphics g, int x, int y, int radius, Color color) {
		
		g.setColor(color); // color
		g.fillRect(x, y, radius, radius);
		g.drawRect(x, y, radius, radius);
		
	}

}
