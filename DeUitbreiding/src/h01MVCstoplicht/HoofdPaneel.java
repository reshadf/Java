package h01MVCstoplicht;

import java.awt.*;
import javax.swing.*;

public class HoofdPaneel extends JFrame {
	
	JFrame frame = null;
	
	private VerkeersLichtModel model;
	private VerkeersLichtView view;
	private VerkeersLichtController controller;

	public HoofdPaneel() {
		
		frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Stoplicht");
		frame.setLocationRelativeTo(null);
		
		frame.setLayout(new BorderLayout());
		
		model = new VerkeersLichtModel();
		view = new VerkeersLichtView();
		controller = new VerkeersLichtController();
		
		frame.add(view, BorderLayout.CENTER);
		frame.add(controller, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		
	}

}
