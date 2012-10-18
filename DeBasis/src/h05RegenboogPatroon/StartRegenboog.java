package h05RegenboogPatroon;

import javax.swing.*;
import java.awt.*;

public class StartRegenboog {
	
	JFrame frame = null;

	public StartRegenboog() {
		
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 700, 300); // margin, margin, breedte, hoogte waardes
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Regenboog Patroon");
		
		TekenRegenboog tekenpaneel = new TekenRegenboog();
		frame.add(tekenpaneel, BorderLayout.CENTER);
		
		RegenboogBediening bedieningspaneel = new RegenboogBediening(tekenpaneel);
		frame.add(bedieningspaneel, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		
		
	}

}
