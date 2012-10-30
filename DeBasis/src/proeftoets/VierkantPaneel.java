package proeftoets;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class VierkantPaneel extends JPanel implements ActionListener {

	private Vierkant mijnVierkant;
	private Timer mijnTimer;
	private int richting;
	
	public VierkantPaneel() {
		
		mijnVierkant = new Vierkant(30, 30, 25, Color.red);
		richting = 3;
		mijnTimer = new javax.swing.Timer(100, this);
		mijnTimer.start();
	}
	
	public void setRichting (int richting) {
		this.richting = richting;
	}
	
	public int getRichting() {
		
		return richting;
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		mijnVierkant.teken(g);
		
	}
	
	public void actionPerformed (ActionEvent e) {
		
		switch(richting) {
		
			case 1 : mijnVierkant.setX(mijnVierkant.getX() -1);
			break;
			
			case 2 : mijnVierkant.setY(mijnVierkant.getY() -1);
			break;
			
			case 3 : mijnVierkant.setX(mijnVierkant.getX() +1);
			break;
			
			case 4 : mijnVierkant.setY(mijnVierkant.getY() +1);
			break;
		}
		
		repaint();
		
	}
	

}
