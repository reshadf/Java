package oefententamen2;

import javax.swing.*;

public class KaartApp extends JFrame{

	public KaartApp() {
		
		setSize(500, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Kaartjes voorbeeld");
		add(new HoofdPaneel());
		setVisible(true);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KaartApp();
	}

}
