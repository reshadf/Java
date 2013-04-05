package h07tekening;

import javax.swing.*;

public class DrawingApp {
	
	JFrame frame = null;

	public DrawingApp() {
		
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Maak een mooie tekening");
		frame.setLocationRelativeTo(null);
		frame.add( new DrawingPanel() );
		
		frame.setVisible(true);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new DrawingApp();
	}

}
