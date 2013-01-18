package h09zuigers;

import javax.swing.*;

public class Zuigers extends JFrame {

	public Zuigers() {
		JFrame venster = new JFrame();
		venster.setSize(760, 400);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("zuigers");
		venster.setLocationRelativeTo(null);
		venster.setLayout(null);
		
		final int PANEELBREEDTE = 182;
		final int BOVENMARGE = 20;
		
		for (int tel=0; tel <= 3; tel++) {
			Zuiger zuiger = new Zuiger(60, 300);
			zuiger.setBounds(tel * PANEELBREEDTE, BOVENMARGE, 180, 400);
			venster.add(zuiger);
		}
		
		venster.setVisible(true);
		
 	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Zuigers();

	}

}
