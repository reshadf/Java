package oefenTentamen;

import javax.swing.*;

public class KaartApp extends JFrame{

	public KaartApp() {
		JFrame frame = new JFrame();
		frame.setSize(500, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("kaartjes voorbeeld");
		frame.add(new HoofdPaneel());
		frame.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KaartApp();
	}

}
