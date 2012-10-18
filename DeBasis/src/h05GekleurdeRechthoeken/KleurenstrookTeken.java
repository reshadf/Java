package h05GekleurdeRechthoeken;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class KleurenstrookTeken extends JPanel {
	
	Random generator = new Random();
	
	// teken 3 verschillende rechthoeken in 3 verschillende kleuren
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		final int BREEDTE_RECHTHOEK = 30; // smalle rechthoek
		int rechts = getWidth(); // breedte scherm
		int beneden = getHeight(); // hoogte scherm
		
		final int KLEURGRENS = 85; // 1/3 van 255
		
		Color[] kleuren = new Color[3];
		kleuren[0] = new Color(generator.nextInt(KLEURGRENS), 
				generator.nextInt(KLEURGRENS), 
				generator.nextInt(KLEURGRENS));
		kleuren[1] = new Color(generator.nextInt(KLEURGRENS) + KLEURGRENS,
				generator.nextInt(KLEURGRENS) + KLEURGRENS,
				generator.nextInt(KLEURGRENS) + KLEURGRENS);
		kleuren[2] = new Color(generator.nextInt(KLEURGRENS) + 2 + KLEURGRENS,
				generator.nextInt(KLEURGRENS) + 2 + KLEURGRENS,
				generator.nextInt(KLEURGRENS) + 2 + KLEURGRENS);
		
		int kleurnummer = 0; // start met 0
		for(int xLoc = 0; xLoc <= rechts; xLoc+=BREEDTE_RECHTHOEK) {
			
			g.setColor(kleuren[kleurnummer]);
			g.fillRect(xLoc, 0, BREEDTE_RECHTHOEK, beneden);
			kleurnummer = (kleurnummer + 1) % 3; // volgende kleur
			
		}
			
	}

}
