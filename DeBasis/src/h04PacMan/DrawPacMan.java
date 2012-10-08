package h04PacMan;

import java.awt.*;

public class DrawPacMan {

	public void drawPacMan(Graphics g, int x, int y, int radius, Color color) {
		
		g.setColor(color); // set color
		g.fillOval(x, y, radius, radius); // paint
		g.setColor(Color.black);
		g.drawOval(x, y, radius, radius); // outline
		// mouth?
		
		//g.drawPolygon(int[] xPoints, int[] yPoints, nPoints)
		
	}
	
	public void drawGhost(Graphics g, int x, int y, int radius, Color color) {
		
		g.setColor(color); // color
		g.fillRect(x, y, radius, radius);
		g.drawRect(x, y, radius, radius);
		
	}

}
