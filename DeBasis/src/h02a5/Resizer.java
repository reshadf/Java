package h02a5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

public class Resizer implements ActionListener {

	// afmetingen
	private int huidigeBuitenLijn = 10;
	private int huidigeBinnenLijn = 5;
	private int buitenLijn = 50;
	private int binnenLijn = buitenLijn / 2;

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.setColor(Color.BLUE);
		
	}

	public void actionPerformed(ActionEvent e) {
		
		setSize();
	}
	
	public void setSize() {
		
		int formaat = Integer.parseInt(grootte.getText());
		
	}

}
