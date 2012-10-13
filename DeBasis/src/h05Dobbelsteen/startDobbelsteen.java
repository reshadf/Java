package h05Dobbelsteen;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class startDobbelsteen {
	
	JFrame frame = null;

	public startDobbelsteen() {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.white);
		frame.setTitle("Dobbelsteen");
		frame.setBounds(200, 200, 450, 450);
		
		DobbelSteen dobbelsteen = new DobbelSteen();
		frame.add(dobbelsteen, BorderLayout.CENTER);
		
		Worp worp = new Worp(dobbelsteen);
		frame.add(worp, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		
	}

}
