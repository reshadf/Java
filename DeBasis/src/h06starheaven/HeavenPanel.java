package h06starheaven;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

/*
 * Hier in deze applicatie wordt een hemel gesimuleerd wat vol staat met gele sterren
 * die van grootte veranderen en rode sterren die dieper van kleur.
 * 
 * @author Reshad Farid
 * @version 1.0 
 */

public class HeavenPanel extends JPanel implements MouseWheelListener {

	
	ArrayList<Star> stars = new ArrayList<Star>();
	ArrayList<StarRed> rs = new ArrayList<StarRed>();
	
	public HeavenPanel() {
		
		setBackground(Color.blue); // geef het paneel een blauwe kleur

		
		this.addMouseWheelListener(this); // set de mouselistener
		
		
		for(int i = 0; i < 10; i++) {
			stars.add(new Star (r.nextInt(10 + 50), r.nextInt(10 + 701), r.nextInt(10 + 701)));
		}
		
		for(int k = 0; k < 10; k++) {
			rs.add(new StarRed(40, r.nextInt(30 + 701), r.nextInt(30 + 701)));
		}
		
	}
	
	
	Random r = new Random();
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(Star star: stars) {
			star.draw(g);
		}
		
		for (StarRed s: rs) {
			s.draw(g);
		}
		
	}
	
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		
		for(Star star: stars){
			star.radius += e.getWheelRotation();
		}
		
		for(StarRed s: rs) {
			s.r += e.getWheelRotation();
		}
		repaint();
	}

}
