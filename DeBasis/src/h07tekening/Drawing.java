package h07tekening;

import java.awt.*;
import java.util.*;

public class Drawing {
	
	private Color color;
	private ArrayList<Point> p = new ArrayList<Point>();
	
	public Drawing(Color color) {
		this.color = color;
		System.out.println("kleur " + color);
	}
	
	public void addPoint(Point punt) {
		p.add(punt);
		for(int i = 0; i < p.size(); i++) {
			//System.out.println(p.get(i));
		}
	}
	
	public void setColor(Color color) {
		   this.color = color;
	}
	
	public void draw(Graphics g) {
		for(int i = 0; i < p.size(); i++) {
			g.setColor(color);
			g.fillRect(p.get(i).x, p.get(i).y, 10, 10);
		}
	}
	
	public void line(Graphics g) {
		for(int j = 1; j < p.size(); j++) {
			g.setColor(color);
			g.drawLine(p.get(j - 1).x, p.get(j - 1).y, p.get(j).x, p.get(j).y);
		}
	}

}
