package h05RegenboogPatroon;

import java.awt.*;

import javax.swing.*;

public class TekenRegenboog extends JPanel {
	
	public int Breedte_Rechthoek = 30;
	//public int hoogte;

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		final int rechts = getWidth(); // neem width van scherm
		
		Color[] kleuren = new Color[7];
		kleuren[0] = new Color(221, 0, 0); // rood
		kleuren[1] = new Color(254, 98, 48); // orangje
		kleuren[2] = new Color(254, 246, 0); // geel
		kleuren[3] = new Color(0, 188 ,0); // groen
		kleuren[4] = new Color(0, 155, 254); // blauw
		kleuren[5] = new Color(0, 0, 131); // indigo 
		kleuren[6] = new Color(48, 155, 0); // violet
		
		int kleurnummer = 0; // set kleurnummer 0
		for(int xLoc = 0; xLoc <= rechts; xLoc+= getBreedte_Rechthoek()) {
			
			g.setColor(kleuren[kleurnummer]);
			g.fillRect(xLoc, 0, getBreedte_Rechthoek(), getHeight());
			kleurnummer = (kleurnummer + 1) % 7; // volgende kleur
			System.out.println("kleurnummer " + kleurnummer);
			
		}
	}
	
//	public void setHoogte(int HoogteLijn) {
//		
//		for(int yPos = 0; yPos < HoogteLijn; yPos += 10) {
//			
//			HoogteLijn += yPos;
//			System.out.println("test");
//			
//		}
//		
//		System.out.println("lijnhoogte" + HoogteLijn);
//		hoogte = HoogteLijn;
//		
//	}
//	
//	public int getHoogte() {
//		
//		System.out.println("hoogte " + hoogte);
//		return hoogte;
//		
//	}

	public void setBreedte_Rechthoek(int inPut) {
		
		Breedte_Rechthoek = inPut;
		
	}
	
	public int getBreedte_Rechthoek() {
		return Breedte_Rechthoek;
	}

}
