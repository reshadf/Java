package h04autoBal;

import java.awt.*; // borderlayout
import javax.swing.*; // voor JFrame;

public class AutoBalOpstart {
	
	JFrame frame = null;

	public AutoBalOpstart() {
		
		JFrame frame = new JFrame();
		frame.setSize(700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Automatische bal");
		frame.setLocation(100, 100);
		
		AutoBal bal; // de auto bal
		bal = new AutoBal();
		frame.add(bal, BorderLayout.CENTER);
		
		AutoBalBediening bedieningspaneel; // knoppen
		bedieningspaneel = new AutoBalBediening(bal);
		frame.add(bedieningspaneel, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		
	}

}
