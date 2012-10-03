package h03volgendeDag;

import java.awt.Color;

import javax.swing.*;

public class VolgendeDag {
	
	JFrame frame = null;

	public VolgendeDag() {
		
		JFrame frame = new JFrame();
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Bepaal volgende dag");
		frame.setBackground(Color.white);
		frame.setLocation(600, 400);
		frame.setVisible(true);
		
	}

}
