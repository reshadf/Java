package h02a1;

import javax.swing.*;

public class Optellen {
	
	JFrame venster = null;
	
	public Optellen() {
		JFrame venster = new JFrame();
		venster.setSize(500, 100);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Verwissel opdracht hoofdstuk 2");
		venster.setLocation(500, 500);
		venster.add(new OptelPaneel());
		venster.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Optellen();
	}

}