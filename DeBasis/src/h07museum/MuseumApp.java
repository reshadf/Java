package h07museum;

import javax.swing.*;

public class MuseumApp {
	
	JFrame frame = null;

	public MuseumApp() {
		
		JFrame frame = new JFrame();
		frame.setSize(450, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Museum Oud en historisch");
		frame.setLocationRelativeTo(null);
		MuseumRegistratie museum = new MuseumRegistratie();
		frame.add( new MuseumPanel(museum) );
		
		frame.setVisible(true);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new MuseumApp();
	}

}
