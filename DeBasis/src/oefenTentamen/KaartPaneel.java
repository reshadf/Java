package oefenTentamen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class KaartPaneel extends JPanel implements MouseListener, MouseMotionListener, MouseWheelListener, KeyListener {

	private Color kleur;
	private boolean dragged;
	private int dragAnkerX;
	private int dragAnkerY;
	
	Random r = new Random();
	
	public KaartPaneel(int x, int y, int size) {
		
		dragged = false;
		setBounds(x, y, size, size);
		kleur = Color.blue;
		addMouseListener(this);
		addMouseMotionListener(this);
		addMouseWheelListener(this);
		addKeyListener(this);
		setFocusable(true);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(kleur);
	}

	public void verplaats() {
		int richting = r.nextInt(4);
		
		switch(richting) {
			case 0: setLocation(getX() + 5, getY());
				break;
			case 1: setLocation(getX(), getY() + 5);
				break;
			case 2: setLocation(getX() - 5, getY());
				break;
			case 3: setLocation(getX(), getY() - 5);
				break;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent ke) {
		if(ke.getKeyCode() == KeyEvent.VK_D) {
			System.out.println("Delete toets");
		}
		
		if(ke.getKeyCode() == KeyEvent.VK_I) {
			System.out.println("insert toets");
		}
	}

	@Override
	public void keyReleased(KeyEvent ke) {}

	@Override
	public void keyTyped(KeyEvent ke) {
		System.out.println(ke.getKeyChar());
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent mwe) {
		int ticks = mwe.getWheelRotation();
		setSize(getWidth() + ticks, getHeight() + ticks);
		
	}

	@Override
	public void mouseDragged(MouseEvent me) {
		if(!dragged) {
			dragged = true;
			dragAnkerX = me.getX();
			dragAnkerY = me.getY();
		}
		
		int x = getX() + me.getX() - dragAnkerX;
		int y = getY() + me.getY() - dragAnkerY;
		
		setLocation(x, y);
	}

	@Override
	public void mouseMoved(MouseEvent me) {}

	@Override
	public void mouseClicked(MouseEvent me) {}

	@Override
	public void mouseEntered(MouseEvent me) {
		kleur = Color.red;
		requestFocus();
		repaint();
	}

	@Override
	public void mouseExited(MouseEvent me) {
		kleur = Color.blue;
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent me) {}

	@Override
	public void mouseReleased(MouseEvent me) {
		dragged = false;
	}

}
