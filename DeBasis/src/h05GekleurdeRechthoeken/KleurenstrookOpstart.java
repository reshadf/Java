package h05GekleurdeRechthoeken;

import javax.swing.*;
import java.awt.*;

public class KleurenstrookOpstart {

	JFrame frame = null;
	
	public KleurenstrookOpstart() {
		
		JFrame frame = new JFrame();
		frame.setSize(700, 300); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Afwisselende kleuren");
		frame.setLocation(100, 100);
		
		KleurenstrookTeken tekenpaneel = new KleurenstrookTeken();
		frame.add(tekenpaneel, BorderLayout.CENTER);
		
		KleurenstrookBediening knoppaneel = new KleurenstrookBediening(tekenpaneel);
		frame.add(knoppaneel, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		
	}

}
