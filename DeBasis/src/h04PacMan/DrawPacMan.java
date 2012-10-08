package h04PacMan;

import java.awt.*;

public class DrawPacMan {

	public void drawPacMan(Graphics g, int x, int y, Color color) {
		
		int radius = 75;
		
		g.setColor(color); // set color
		g.fillOval(x, y, radius, radius); // paint
		g.setColor(Color.black);
		g.drawOval(x, y, radius, radius); // outline
		// mouth?
		
		g.drawPolygon(int[] xPoints, int[] yPoints, nPoints)
		
	}
	
	public void drawGhost(Graphics g, int x, int y, Color color) {
		
		g.setColor(color); // color
		// here goes shape
		
	}

}
