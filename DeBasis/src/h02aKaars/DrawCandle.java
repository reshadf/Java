package h02aKaars;

import java.awt.*;

public class DrawCandle {
	
	public void drawCandle(Graphics g, int x, int y, int lengte, boolean aan) {
		
		g.setColor(Color.white);
		g.drawRect(x, y, 50, lengte);
		g.fillRect(x, y, 50, lengte);
		g.setColor(Color.yellow);
		g.drawOval(x + 10, y - 60, 30, 50);
		g.fillOval(x + 10, y - 60, 30, 50);
		g.setColor(Color.black);
		g.drawLine(x + 25, y, x + 25, y - 10);
		
	}
	
	public void drawCandleBurned(Graphics g, int x, int y, int lengte) {
		
		g.setColor(Color.white);
		g.drawRect(x, y, 50, lengte);
		g.fillRect(x, y, 50, lengte);
		g.setColor(Color.black);
		g.drawLine(x + 25, y, x + 25, y - 10);
		
	}

}
