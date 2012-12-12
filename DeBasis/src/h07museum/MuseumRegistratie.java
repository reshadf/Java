package h07museum;

import java.util.*;

import javax.swing.JOptionPane;

public class MuseumRegistratie {
	
	int gesommeerdeTijd;
	int aantalBezoekers = 0;
	
	ArrayList<MuseumBezoeker> bezoeker = new ArrayList<MuseumBezoeker>();

	public void checkIn(String kaartNummer, int aankomstUur, int aankomstMinuten) {
		bezoeker.add(new MuseumBezoeker(kaartNummer, aankomstUur, aankomstMinuten));
	}
	
	public void checkOut(String kaartNummer, int vertrekUur, int VertrekMinuten) {
		aantalBezoekers++;
		bezoeker.remove(kaartNummer);
	}
	
	public int getAantalAanwezig() {
		return bezoeker.size();
	}
	
	public void sluitRegistratie() {
		
		if(bezoeker.isEmpty()) {
			
			try {
				String str = "Gemiddelde tijd bezoekers: " + (gesommeerdeTijd / aantalBezoekers);
				JOptionPane.showMessageDialog(null, str);
			} catch (ArithmeticException ax) {
				JOptionPane.showMessageDialog(null, "er zijn geen bezoekers geweest");
			}
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Bezoekers zijn nog niet weg");
		}
		
	}

}
