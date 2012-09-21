package h02BTW;

import javax.swing.*;

public class BtwVenster {
	
	JFrame venster = null;

	public BtwVenster() {
		
		JFrame venster = new JFrame();
		venster.setSize(280, 250);
		venster.setLocation(300, 200);
		venster.setTitle("BTW berekenen");
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.add(new BtwPaneel());
		venster.setVisible(true);
		
	}

}