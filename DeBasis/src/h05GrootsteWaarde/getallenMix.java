package h05GrootsteWaarde;

import java.awt.*;

import javax.swing.*;

public class getallenMix {

	JFrame frame = null;
	
	public getallenMix() {
		
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Bepaal kleinste waarde");
		frame.setBackground(Color.white);
		
		GetallenGenerator generator = new GetallenGenerator();
		frame.add(generator);
		
		Bediening bediening = new Bediening(generator);
		frame.add(bediening);
		
		frame.setVisible(true);
		
		
	}

}
