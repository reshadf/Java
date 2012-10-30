package proeftoets;

import java.awt.*;

public class Vierkant {
	
	private int x;
	private int y;
	private int grootte;
	private Color kleur;
	
	public Vierkant(int x, int y, int grootte, Color kleur) {
		
		this.x = x;
		this.y = y;
		this.grootte = grootte;
		this.kleur = kleur;
		
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int w) {
		this.x = w;
	}
	
	public void setY(int w) {
		this.y = w;
	}
	
	public void teken(Graphics g) {
		g.setColor(kleur);
		g.fillRect(getX(), getY(), grootte, grootte);
	}
	
	

}
