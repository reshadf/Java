package h02a3;

import javax.swing.*;
import java.awt.*;

public class RechthoekenPaneel extends JPanel {
	
	//teken rechthoeken
	public void paintcomponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		super.paintComponent( g );
		//g.fillRect(110, 110, 30, 30);
		g.setColor(Color.red);
		g.drawOval(0, 0, width, height);
	}
}
