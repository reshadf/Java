package h07tekening;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

public class DrawingPanel extends JPanel implements MouseListener {
	
	Random r = new Random();
	Color color = new Color(r.nextInt(255 - 0 + 1) + 0, r.nextInt(255 - 0 + 1) + 0, r.nextInt(255 - 0 + 1) + 0); // kleur vasthouden
	Drawing draw; // class definition
	private ArrayList<Drawing> tekening = new ArrayList<Drawing>();
	
	public DrawingPanel() {
		setBackground(Color.WHITE); // background
		this.addMouseListener(this); // control de mouselistener
		draw = new Drawing(color);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw.draw(g);
		for(Drawing draw : tekening) {
			draw.draw(g);
			if(tekening.size() >= 1) {
				draw.line(g);
			}
		}
		repaint();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(e.getButton() == MouseEvent.BUTTON1) {
			Point k = new Point(e.getX(), e.getY());
			draw.addPoint(k);
			//System.out.println("punt gezet op " + k);
		}
		if(e.getButton() == MouseEvent.BUTTON3) {
			tekening.add(draw);
			draw.setColor(color);
			color = new Color(r.nextInt(255 - 0 + 1) + 0, r.nextInt(255 - 0 + 1) + 0, r.nextInt(255 - 0 + 1) + 0);
			//System.out.println("new color " + color);
			draw = new Drawing(color);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Point k = new Point(e.getX(), e.getY());
		draw.addPoint(k);
		//System.out.println("startpunt");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		Point k = new Point(e.getX(), e.getY());
		draw.addPoint(k);
		//tekening.add(draw);
		//System.out.println("eindpunt");
	}

}
