package h04PacMan;

import java.awt.*; // border layout pacman

import javax.swing.*; //JFrame swing

/*
 * maak nieuw venster aan voor pacman en plaats de bediening
 * en veld in bijbehorende velden
 */

public class PacManStart {
	
	JFrame frame = null;

	public PacManStart() {
		
		JFrame frame = new JFrame();
		frame.setSize(700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("PacMan");
		frame.setLocation(100, 100);
		
		PacMan pacman;
		pacman = new PacMan();
		frame.add(pacman, BorderLayout.CENTER);
		
		PacManBediening bedieningspaneel;
		bedieningspaneel = new PacManBediening(pacman);
		frame.add(bedieningpaneel, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		
		
		
		
	}

}
