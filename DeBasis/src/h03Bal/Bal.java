package h03Bal;

import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;

public class Bal extends JPanel implements ActionListener {
	
	private JButton goLeft;
	private JButton goRight;
	private JButton sizePlus;
	private JButton sizeMinus;
	int size = 50;
	int pos = 0;

	public Bal() {
		
		goLeft = new JButton("Naar links");
		goLeft.addActionListener(this);
		goRight = new JButton("Naar rechts");
		goRight.addActionListener(this);
		sizeMinus = new JButton("-");
		sizeMinus.addActionListener(this);
		sizePlus = new JButton("+");
		sizePlus.addActionListener(this);
		
		add(sizeMinus);
		add(goLeft);
		add(goRight);
		add(sizePlus);
	}

	DrawBal bal = new DrawBal();
	
	public void paintComponent(Graphics g) {
		
		int xPos =  (getWidth() / 2) + pos;
		int yPos = getHeight() - (getHeight() / 2);
		
		bal.drawBal(g, xPos, yPos, size);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		// action for left button
		if( e.getSource() == goLeft ){
			pos -= 10;
			
		}
		if( e.getSource() == goRight) {
			pos += 10;
			
		}
		if( e.getSource() == sizePlus) {
			size += 5;
		}
		if( e.getSource() == sizeMinus) {
			size -= 5;
		}
		
		repaint();
	}

}
