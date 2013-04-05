package h09zuigers;

import java.awt.*;
import javax.swing.*;

public class Zuiger extends JPanel implements Runnable {
	
	private int zuigerHoogte, zuigerBreedte;
	private int paneelBreedte;
	private final int HOUDER_HOOGTE = 20;
	private int paneelHoogte;
	int bewegingsrichting = -1;
	int WACHTTIJD = 10;
	

	public Zuiger(int breedte, int hoogte) {
		
		zuigerBreedte = breedte;
		zuigerHoogte = hoogte;
		paneelBreedte = 3 * zuigerBreedte;
		paneelHoogte = zuigerHoogte + HOUDER_HOOGTE;
		Thread beweging = new Thread(this);
		beweging.start();
		
	}
	
	public void run() {
		
		while(true) {
			zuigerHoogte = zuigerHoogte + bewegingsrichting;
			
			if(zuigerHoogte < paneelHoogte / 4 || zuigerHoogte > paneelHoogte) {
				bewegingsrichting = bewegingsrichting * -1;
			}
			
			repaint();
			
			try {
				Thread.sleep(WACHTTIJD);
			}
			catch(InterruptedException e) {}
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0,  paneelHoogte - HOUDER_HOOGTE / 2, paneelBreedte, HOUDER_HOOGTE);
		
		g.setColor(Color.gray);
		int yLoc = paneelHoogte - zuigerHoogte;
		g.fillRect(zuigerBreedte, yLoc, zuigerBreedte, zuigerHoogte);
	}

}
