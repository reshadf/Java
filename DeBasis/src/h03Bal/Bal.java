package h03Bal;

import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.*;

public class Bal extends JPanel implements ActionListener, KeyListener {
	
	private JButton goLeft;
	private JButton goRight;
	private JButton sizePlus;
	private JButton sizeMinus;
	int size = 50;
	int pos = 0;
	
	// acties


	public Bal() {
		
		goLeft = new JButton("Naar links");
		goLeft.addActionListener(this);
		this.addKeyListener(this);
		this.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "pressed");
		goRight = new JButton("Naar rechts");
		goRight.addActionListener(this);
		sizeMinus = new JButton("-");
		sizeMinus.addActionListener(this);
		sizePlus = new JButton("+");
		sizePlus.addActionListener(this);
		this.setFocusable(true);
		
		add(sizeMinus);
		add(goLeft);
		add(goRight);
		add(sizePlus);
	}

	DrawBal bal = new DrawBal();
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		int xPos =  (getWidth() / 2) + pos ;
		int yPos = getHeight() - (getHeight() / 2);
		
		bal.drawBal(g, xPos, yPos, size);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		// action for left button
		if( e.getSource() == goLeft ){
			pos -= 10;
			
		}
		// action for right button
		if( e.getSource() == goRight) {
			pos += 10;
			
		}
		// action for size up
		if( e.getSource() == sizePlus) {
			if(getHeight() / 2 > size && getWidth() > size) {
				size += 5;
			}
			else {
				JOptionPane.showMessageDialog(null, "Bal past niet meer in het frame!");
			}
		}
		//action for size down
		if( e.getSource() == sizeMinus) {
			
			if(size > 5) {
				size -= 5;
			}
			else {
				
				JOptionPane.showMessageDialog(null, "Bal kan niet kleiner dan 5 pixels zijn!");
				
			}
		}
		
		repaint();
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keyPressed");
		
		char c = e.getKeyChar();
		
		if( c == KeyEvent.VK_LEFT  ) {
			
			pos -= 10;
			
		}
		
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		System.out.println("keyTyped");
		char v = arg0.getKeyChar();
		if( v == KeyEvent.VK_LEFT ) {
			
			pos -= 10;
			
		}
		repaint();
		
	}

}
