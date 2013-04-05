package h06mousewheel;

import javax.swing.*;

public class MouseWheelEvent extends JFrame {
	
	public MouseWheelEvent() {
		JFrame venster = new JFrame();
		venster.setSize(400,400);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Demo mousewheel events");
		venster.setLocationRelativeTo(null);
		
		venster.add( new MouseWheelPanel() );
		
		venster.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new MouseWheelEvent();
	}

}