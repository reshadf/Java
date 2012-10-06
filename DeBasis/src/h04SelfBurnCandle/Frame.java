package h04SelfBurnCandle;

import javax.swing.*;

public class Frame {

	JFrame frame = null;
	
	public Frame() {
		
		JFrame frame = new JFrame();
		frame.setSize(350, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(400, 300);
		frame.add(new CandlePanel());
		frame.setVisible(true);
		
	}

}
