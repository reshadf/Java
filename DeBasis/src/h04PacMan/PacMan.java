package h04PacMan;

/*
 * PacMan laten bewegen
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PacMan extends JPanel implements ActionListener {
	
	private int horizontalePlaats = 250; // x location
	private int verticalePlaats = 150; // y location
	private int richtingEnSnelheid = +10; // speed
	private final int WACHTTIJD = 500; // DELAY
	int diameter; //radius of pacman
	int direction; // view of pacman
	int waarde; //direction pacman is going
	final int ghostSpeed = 5; // speed of ghost

	public PacMan() {
		
		// create timer and start timer
				javax.swing.Timer autoKlik = new javax.swing.Timer(WACHTTIJD, this);
				
				autoKlik.start();
	}
	
	public int getHorPlaats() {
		return horizontalePlaats;
	}
	
	// current y positie
	
	public int getVerPlaats() {
		return verticalePlaats;
	}
	
	// speed and way;
	public int getRichtingEnSnelheid() {
		return richtingEnSnelheid;
	}
	
	// new x position
	
	public void setHorPlaats(int nieuweHorPlaats) {
		
		if(nieuweHorPlaats > getWidth()) {
			
			nieuweHorPlaats = 0;
		}
		else if(nieuweHorPlaats < 0) {
			
			nieuweHorPlaats = getWidth();
		}
		
		horizontalePlaats = nieuweHorPlaats;
		
	}
	
	// new y position 
	public void setVerPlaats(int nieuweVerPlaats) {
		
		if(nieuweVerPlaats > getHeight()) {
			
			nieuweVerPlaats = 0;
		}
		else if(nieuweVerPlaats < 0) {
			
			nieuweVerPlaats = getHeight();
		}
		
		verticalePlaats = nieuweVerPlaats;
		
	}
	
	public void setRichtingEnSnelheid(int nieuweRichtingEnSnelheid) {
		
		richtingEnSnelheid = nieuweRichtingEnSnelheid;
		
	}
	
	//movement
	public void setBesturing(int besturing) {
		
		waarde = besturing;
		
		if(waarde == 0) {
			setHorPlaats( getHorPlaats() + richtingEnSnelheid);
		}
		else if(waarde == 1){
			setVerPlaats( getVerPlaats() + richtingEnSnelheid);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		setBesturing(waarde);
		//System.out.println(waarde);
		repaint();
		
	}
	
	DrawPacMan pacman = new DrawPacMan();
	DrawPacMan ghost1 = new DrawPacMan();
	DrawPacMan ghost2 = new DrawPacMan();
	
	public void setView(int view) {
		
		direction = view;
		
	}
	
	public int getView() {
		
		return direction;
	}
	
	int g1x = 0;
	boolean g1r = true;
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		// pacman movement
		diameter = 75;	 
		pacman.drawPacMan(g, getHorPlaats(), getVerPlaats(), diameter, getView(), Color.yellow);
		
		// ghosts movement
		if(g1r == true) {
			
			g1x += ghostSpeed;
			
		}
		
		if(g1r == false) {
			
			g1x -= ghostSpeed;
			
		}
		
		
		if(g1x == 500 || g1x == 0) {
			
			g1r = !g1r;
			
		}
		
		System.out.println(g1r);
		ghost1.drawGhost(g, g1x, 40, diameter, Color.red);
		
		
	}

}
