package h02aKaars;

import javax.swing.*;

public class Candle {
	
	JFrame venster = null;
	
	public Candle() {
		
		JFrame venster = new JFrame();
		venster.setSize(200,400);
		venster.setLocation(500,500);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Candle");
		venster.add(new CandlePaneel());
		venster.setVisible(true);
	}

}
