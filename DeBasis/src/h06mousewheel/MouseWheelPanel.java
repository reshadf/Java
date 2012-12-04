package h06mousewheel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MouseWheelPanel extends JPanel implements MouseWheelListener {
	
	private int grootte = 50;
	private final String str = "";
	private int x, y;
	private int size;
	
	public MouseWheelPanel() {
		this.addMouseWheelListener(this);
	}
	
	public void paintComponent( Graphics g ) {
		super.paintComponent( g );
		g.setColor( Color.YELLOW ); 
		g.fillOval( 10, 10, grootte, grootte );
		g.setColor(Color.black);
		g.drawString(str + size, x, y);
	}
	
	public void mouseWheelMoved( MouseWheelEvent e ) {
		// TODO Auto-generated method stub
		y = e.getY();
		x = e.getX();
		size = e.getWheelRotation();
	    grootte += e.getWheelRotation();
	    repaint(); 
	}
	
}