package h02a5;

import javax.swing.*;

public class Bal {
	
	JFrame venster = null;
	
	public Bal() {
		
		JFrame venster = new JFrame();
		venster.setSize(300, 300);
		venster.setLocation(500, 500);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Bal tekenen");
		venster.add(new BalPanel());
		venster.setVisible(true);
		
	}
}
