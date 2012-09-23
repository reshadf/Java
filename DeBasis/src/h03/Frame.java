package h03;

import javax.swing.*;

public class Frame {
	
	JFrame frame = null;

	public Frame() {
		
		frame = new JFrame();
		frame.setSize(500, 200);
		frame.setTitle("Horizontale lijnen");
		frame.setLocation(400, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new LinePanel());
		frame.setVisible(true);
		
	}

}
