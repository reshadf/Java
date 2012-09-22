package h02aBal;

import java.awt.*;

public class TekenBal {
	
	public void tekenBal(Graphics g, int x, int y, int grootte) {
		
		g.drawOval(x, y, grootte, grootte);
		g.setColor(Color.orange);
		g.fillOval(x, y, grootte, grootte);
		g.setColor(Color.black);
		g.drawOval(x + grootte / 4, y, grootte / 2, grootte);
		g.drawLine(x, y + grootte, grootte + x, grootte + y);
	}

}
