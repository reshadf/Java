package h06mouseclicks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MouseEventPanel extends JPanel implements MouseListener {

	JLabel gebeurtenisverslag;
	private int x, y;

	public MouseEventPanel(JLabel uitleg) {
		gebeurtenisverslag = uitleg;
		setBackground(Color.YELLOW);
		this.addMouseListener(this);
		gebeurtenisverslag.setText("klik ergens in het gele gebied");
	}
	
	@Override
	public void mouseEntered(MouseEvent m) {} // not used

	@Override
	public void mouseExited(MouseEvent m) {} // not used

	@Override
	public void mouseClicked(MouseEvent m) {
		// TODO Auto-generated method stub
		gebeurtenisverslag.setText( 
				m.getClickCount() + " keer geklikt op " + m.getX() + "," + m.getY());
		  x = m.getX();
		  y = m.getY();
	}

	@Override
	public void mousePressed(MouseEvent m) {
		// TODO Auto-generated method stub
		gebeurtenisverslag.setText(" Muis ingedrukt op " + m.getX() + "," + m.getY());
	}

	@Override
	public void mouseReleased(MouseEvent m) {
		// TODO Auto-generated method stub
		gebeurtenisverslag.setText(" Muis omhoog op " + m.getX() + "," + m.getY());
	}
	
	Dot punt = new Dot();
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
			punt.setDot(g, x, y, 5);		
			repaint();
	}

}
