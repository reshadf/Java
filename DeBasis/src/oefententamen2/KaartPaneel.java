package oefententamen2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class KaartPaneel extends JPanel implements MouseListener {
	
	private boolean active;
	
	public KaartPaneel(int x, int y) {
		setBounds(x, y, 100, 100);
		setBackground(Color.blue);
		active = false;
		addMouseListener(this);
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		if(active) {
			g.setColor(Color.green);
			g.drawRect(0, 0, this.getWidth() - 1, this.getHeight() - 1);
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		active = true;
		setBackground(Color.red);
		repaint();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		active = false;
		setBackground(Color.blue);
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
