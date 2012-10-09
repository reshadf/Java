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
	private int richtingEnSnelheid = +10; // RECHTS
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
	
	// huidige y positie geven
	
	public int getVerPlaats() {
		return verticalePlaats;
	}
	
	// snelheid en richting
	public int getRichtingEnSnelheid() {
		return richtingEnSnelheid;
	}
	
	// new x position
	
	public void setHorPlaats(int nieuweHorPlaats) {
		
		horizontalePlaats = nieuweHorPlaats;
		
	}
	
	// new y position 
	public void setVerPlaats(int nieuweVerPlaats) {
		
		verticalePlaats = nieuweVerPlaats;
		
	}
	
	public void setRichtingEnSnelheid(int nieuweRichtingEnSnelheid) {
		
		richtingEnSnelheid = nieuweRichtingEnSnelheid;
		
	}
	
	public void setBesturing(int besturing) {
		
		besturing = waarde;
		
		if(waarde == 1) {
			setVerPlaats( getVerPlaats() + richtingEnSnelheid);
		}
		else if(waarde == 0){
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
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		diameter = 75;	
		pacman.drawPacMan(g, getHorPlaats(), getVerPlaats(), diameter, Color.yellow);
		
	//	int[] ghostx, ghosty;
		
		pacman.drawGhost(g, 50, 40, diameter, Color.red);
		
	}

}
