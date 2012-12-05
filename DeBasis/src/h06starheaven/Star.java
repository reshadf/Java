package h06starheaven;

import java.awt.*;

/*
 * Hier wordt aan de hand van voorafbepaalde coordinaten een ster getekent
 * 
 * @author Reshad Farid
 * @version %i%, %g%
 * @since 1.0
 * @param Create(Graphics g, int radius, int middelpunt){}
 */

public class Star {
	
	protected int radius;
	private int xmiddelpunt;
	private int ymiddelpunt;
	protected Color color;
	
	public Star(int radius, int x, int y, Color color) {
		this(radius, x, y);
		this.color = color;
	}
	
	public Star(int radius, int x, int y) {
		xmiddelpunt = x;
        ymiddelpunt = y;
        this.radius = radius;
        
        this.color = Color.yellow;
	}
	
	public void draw(Graphics g) {

		
		if(xmiddelpunt < radius) {
			xmiddelpunt += radius;
		}
		if(ymiddelpunt < radius) {
			ymiddelpunt += radius;
		}
		if(radius > 50) {
			radius = 50;
		}
		if(radius < 10) {
			radius = 10;
		}
		
		Point p1 = new Point(xmiddelpunt, ymiddelpunt - radius);
		Point p2 = new Point(xmiddelpunt - radius / 3, ymiddelpunt - radius / 3);
		Point p3 = new Point(xmiddelpunt - radius, ymiddelpunt);
		Point p4 = new Point(xmiddelpunt - radius / 3, ymiddelpunt + radius / 3);
		Point p5 = new Point(xmiddelpunt, ymiddelpunt + radius);
		Point p6 = new Point(xmiddelpunt + radius / 3, ymiddelpunt + radius / 3);
		Point p7 = new Point(xmiddelpunt + radius, ymiddelpunt);
		Point p8 = new Point(xmiddelpunt + radius / 3, ymiddelpunt - radius /3);
		
		 int xPoints[] = { p1.x, p2.x, p3.x, p4.x, p5.x, p6.x, p7.x, p8.x};
		 int yPoints[] = { p1.y, p2.y, p3.y, p4.y, p5.y, p6.y, p7.y, p8.y};
		
		 g.setColor(color);
		 g.drawPolygon(xPoints, yPoints, 8);
		 g.fillPolygon(xPoints, yPoints, 8);
	}

}