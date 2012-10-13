package h05UitgeschrevenGetal;

import javax.swing.*;

public class GetalFrame {
	
	JFrame frame = null;

	public GetalFrame() {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200, 200, 700, 400);
		frame.setTitle("Getallen converter");
		
		GetalConverter GetalConv = new GetalConverter();
		frame.add(GetalConv);
		
		frame.setVisible(true);
	}

}
