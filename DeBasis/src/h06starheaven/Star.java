package h06starheaven;

import java.awt.*;

public class Star {
	
	public void Create(Graphics g) {
		
		 int xPoints[] = { 55, 67, 109, 73, 83, 55, 27, 37, 1, 43 };
		 int yPoints[] = { 0, 36, 36, 54, 96, 72, 96, 54, 36, 36 };
		
		 g.setColor(Color.yellow);
		 g.drawPolygon(xPoints, yPoints, 10);
		 g.fillPolygon(xPoints, yPoints, 10);
	}

}
