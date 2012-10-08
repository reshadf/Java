package h04autoBal;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import h03Bal.DrawBal;

/*
 * klasse om bal automatisch te laten bewegen
 */

public class AutoBal extends JPanel implements ActionListener {

	private int horizontalePlaats = 250; // x location
	private int verticalePlaats = 150; // y location
	private int richtingEnSnelheid = +1; // RECHTS
	private final int WACHTTIJD = 500; // DELAY
	
	public AutoBal() { // constructor
		
		// create timer and start timer
		javax.swing.Timer autoKlik = new javax.swing.Timer(WACHTTIJD, this);
		
		autoKlik.start();
		
	}
	
	// huidige x positie geven
	
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
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		setHorPlaats( getHorPlaats() + richtingEnSnelheid);
		repaint();
		
	}
	
	DrawBal balletje = new DrawBal();
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		final int BALDIAMETER = 100; //  grootte bal
		
		balletje.drawBal(g, getVerPlaats(), getHorPlaats(), BALDIAMETER);
		
	}

}
