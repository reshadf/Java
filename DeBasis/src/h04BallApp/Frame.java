package h04BallApp;

import java.awt.*;
import javax.swing.*;

public class Frame {

	JFrame frame = null;
	
	public Frame() {
		
		JFrame frame = new JFrame();
		frame.setSize(700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Verplaatsbare bal versie 2");
		frame.setLocation(100, 100);
		frame.add(new BallPanel());
		frame.setVisible(true);
		
	}

}
