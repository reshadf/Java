package h02a5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BalPaneel extends JPanel implements ActionListener {

	public JTextField grootte; // invoerbox veldgrootte
	private JButton teken; // Teken button
	int balRadius = 150;
	
	public BalPaneel() {
		
		
		teken = new JButton("teken bal");
		teken.addActionListener(this);
		grootte = new JTextField(3);
		grootte.addActionListener(this);
		
		add(grootte);
		add(teken);
	}
	
	TekenBal bal = new TekenBal();
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		int horizontaal = getWidth() / 4;
		int verticaal = 50;
		
		bal.tekenBal(g, horizontaal, verticaal, balRadius);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		int invoer = Integer.parseInt(grootte.getText());
		balRadius = invoer ;
		repaint();
		
		
	}
	
}
