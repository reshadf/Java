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
	int diameter;
	int waarde;

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
		
		besturing = waarde;
		
		if(waarde == 0) {
			setVerPlaats( getVerPlaats() + richtingEnSnelheid);
		}
		else if(waarde == 1){
			setHorPlaats( getHorPlaats() + richtingEnSnelheid);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		setBesturing(waarde);
		System.out.println(waarde);
		repaint();
		
	}
	
	DrawPacMan pacman = new DrawPacMan();
	DrawPacMan ghost1 = new DrawPacMan();
	DrawPacMan ghost2 = new DrawPacMan();
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		// pacman movement
		diameter = 75;	
		pacman.drawPacMan(g, getHorPlaats(), getVerPlaats(), diameter, Color.yellow);
		
		// ghosts movement
		int g1x;
		for(g1x = 0; g1x < 10; g1x++) {
			
			pacman.drawGhost(g, g1x, 40, diameter, Color.red);
			
		}
		pacman.drawGhost(g, 170, 70, diameter, Color.blue);
		
		
	}

}
