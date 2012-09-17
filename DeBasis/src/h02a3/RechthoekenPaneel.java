package h02a3;

import javax.swing.*;
import java.awt.*;

public class RechthoekenPaneel extends JPanel {
	
	//teken rechthoeken
	public void paintComponent(Graphics g) {
		
		super.paintComponent( g );
		g.setColor(Color.red);
		g.fillRect(110, 110, 30, 30);
	}
}
