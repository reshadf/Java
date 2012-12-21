package BestandKiezen;

import javax.swing.*;

public class BestandKiezenApp {
	
	JFrame frame = null;

	public BestandKiezenApp() {
		
		JFrame frame = new JFrame();
		frame.setSize(350, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Versiebeheer systeem");
		frame.setLocationRelativeTo(null);
		
		frame.add(new BestandKiezenPanel(frame));
		
		frame.setVisible(true);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new BestandKiezenApp();
	}

}
