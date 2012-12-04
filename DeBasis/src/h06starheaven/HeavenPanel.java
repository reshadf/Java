package h06starheaven;

import javax.swing.*;
import java.awt.*;

public class HeavenPanel extends JPanel {

	public HeavenPanel() {
		
	}
	
	Star star = new Star();
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		star.Create(g);
		
	}
	
	

}
