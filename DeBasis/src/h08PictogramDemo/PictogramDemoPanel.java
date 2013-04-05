package h08PictogramDemo;

import javax.swing.*;

public class PictogramDemoPanel extends JPanel {

	private String[] pictogramNaam;
	
	public PictogramDemoPanel() {
		
		pictogramNaam = new String[5];
		pictogramNaam[0] = "GreenApple";
		pictogramNaam[1] = "Orange";
		pictogramNaam[2] = "Pear";
		pictogramNaam[3] = "RedApple";
		pictogramNaam[4] = "Strawberry";
		
		setLayout(null);
		
		String tekst;
		ImageIcon afbeelding;
		JButton knop;
		int MARGE = 20;
		int KNOP_BREEDTE = 200;
		int KNOP_HOOGTE = 56;
		int KNOP_AFSTAND = KNOP_HOOGTE + 4;
		int X_LOCATIE = 80;
		
		for(int x=0; x<pictogramNaam.length; x++) {
			tekst = pictogramNaam[x];
			afbeelding = new ImageIcon("Fruit/" + tekst + ".gif");
			knop = new JButton(tekst, afbeelding);
			knop.setBounds(X_LOCATIE, x * KNOP_AFSTAND + MARGE, KNOP_BREEDTE, KNOP_HOOGTE);
			add(knop);
		}
	}
	
}
