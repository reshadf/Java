package h02a4;

import javax.swing.*;

/*
 * Paraplu. 
 * teken een paraplu 
 * en de mogenlijkheid om een rgb kleur in te geven
 */

public class Paraplu extends JFrame {

	public Paraplu() {
		// TODO Auto-generated constructor stub
		JFrame venster = new JFrame();
		venster.setSize(500, 500);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("gekleurde paraplu");
		venster.setLocation(100, 100);
		venster.add(new ParapluPaneel());
		venster.setVisible(true);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Paraplu();
	}

}
