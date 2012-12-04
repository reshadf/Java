package h06starheaven;

import javax.swing.*;

public class CreateHeaven extends JFrame {
	
	public CreateHeaven() {
		JFrame frame = new JFrame();
		frame.setLocationRelativeTo(null);
		frame.setSize(700, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Stars Made In Heaven");
		
		frame.add( new HeavenPanel() );
		
		frame.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new CreateHeaven();
	}

}
