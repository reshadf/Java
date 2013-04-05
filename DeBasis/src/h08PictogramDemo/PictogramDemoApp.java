package h08PictogramDemo;

import javax.swing.*;

/*
 * PictogramDemo
 * @author Reshad Farid
 */

public class PictogramDemoApp extends JFrame {

	public PictogramDemoApp() {
		JFrame frame = new JFrame();
		frame.setSize(350, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Demonstratie icon");
		frame.setLocationRelativeTo(null);
		frame.add(new PictogramDemoPanel());
		frame.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new PictogramDemoApp();

	}

}
