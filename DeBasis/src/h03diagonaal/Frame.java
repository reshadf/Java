package h03diagonaal;

import java.awt.Color;

import javax.swing.*;

public class Frame {
	
	JFrame frame = null;

	public Frame() {
		
		JFrame frame = new JFrame();
		frame.setSize(500, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Diagonale lijnen");
		frame.setBackground(Color.white);
		frame.setLocation(500, 500);
		frame.add(new DrawPanel());
		frame.setVisible(true);
		
	}

}
