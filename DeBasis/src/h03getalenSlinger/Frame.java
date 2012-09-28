package h03getalenSlinger;

import java.awt.Color;
import javax.swing.*;

public class Frame {

	JFrame frame = null;
	
	public Frame() {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(500, 350);
		frame.setBackground(Color.white);
		frame.setTitle("getallen slinger");
		frame.setSize(500, 350);
		frame.add(new CountPanel());
		frame.setVisible(true);
		
	}

}
