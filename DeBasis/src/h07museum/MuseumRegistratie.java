package h07museum;

import java.util.*;

import javax.swing.JOptionPane;

public class MuseumRegistratie {
	
	int gesommeerdeTijd;
	int aantalBezoekers;
	
	ArrayList<MuseumBezoeker> bezoeker = new ArrayList<MuseumBezoeker>();

	public void checkIn(String kaartNummer, int aankomstUur, int aankomstMinuten) {
		bezoeker.add(new MuseumBezoeker(kaartNummer, aankomstUur, aankomstMinuten));
	}
	
	public void checkOut(String kaartNummer, int vertrekUur, int VertrekMinuten) {

		bezoeker.remove(kaartNummer);
	}
	
	public int getAantalAanwezig() {
		
		try {
			
			aantalBezoekers = bezoeker.size();
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			aantalBezoekers = 0;
		}
		
		return aantalBezoekers;
	}
	
	public void sluitRegistratie() {
		
		aantalBezoekers = bezoeker.size();
		
		if(!(aantalBezoekers >= 0)) {
			
			String str = "Gemiddelde tijd bezoekers: " + (gesommeerdeTijd / aantalBezoekers);
			
			JOptionPane.showMessageDialog(null, str);
		}
		else {
			JOptionPane.showMessageDialog(null, "Bezoekers zijn nog niet weg");
		}
		
	}

}
