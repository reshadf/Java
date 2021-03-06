package h01aWachtrij;

import javax.swing.*;

/*
 * Hoofdstuk 1A bevat een wachtlijst waarbij men in 1 textvak iets kan invullen en d.m.v.
 * een button de wachtlijst op kan laten schuiven.
 */

public class wachtLijst extends JFrame {

	public wachtLijst() {
		// stel venster in en geef deze een paar eigenschappen;
		JFrame venster = new JFrame();
		venster.setSize(200, 500);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Wachtlijst");
		venster.setLocation(400, 400);
		venster.add(new WachtlijstPaneel());
		venster.setVisible(true);

	}

	public static void main(String[] args) {
		new wachtLijst();
	}

}
