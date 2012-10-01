package h03Bal;

import javax.swing.*;
import java.awt.*;

public class BalFrame {
	
	JFrame frame = null;

	public BalFrame() {
		
		JFrame frame = new JFrame();
		frame.setLocation(500, 400);
		frame.setSize(1000, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Verplaatsbare bal");
		frame.setBackground(Color.white);
		frame.setForeground(Color.black);
		frame.add(new Bal());
		frame.setVisible(true);
		
	}

}
