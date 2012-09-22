package h02aBal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BalPanel extends JPanel implements ActionListener {

	public JTextField grootte; // invoerbox veldgrootte
	private JButton teken; // Teken button
	int balRadius = 150;
	
	public BalPanel() {
		
		
		teken = new JButton("teken bal");
		teken.addActionListener(this);
		grootte = new JTextField(3);
		grootte.addActionListener(this);
		
		add(grootte);
		add(teken);
	}
	
	TekenBal bal = new TekenBal();
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		int horizontaal = 30;
		int verticaal = getHeight() - (balRadius + 30);
		
		bal.tekenBal(g, horizontaal, verticaal, balRadius);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		int invoer = Integer.parseInt(grootte.getText());
		balRadius = invoer ;
		repaint();
		
		
	}
	
}
