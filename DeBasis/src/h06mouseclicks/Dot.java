package h06mouseclicks;

import java.awt.*;

public class Dot {
	
	public void setDot(Graphics g, int x, int y, int grootte) {
		
		g.drawOval(x, y, grootte, grootte);
		g.setColor(Color.black);
		g.fillOval(x, y, grootte, grootte);
		g.setColor(Color.white);
		
	}
	
}
