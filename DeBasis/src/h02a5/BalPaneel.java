package h02a5;

import javax.swing.*;
import java.awt.*;

public class BalPaneel extends JPanel {

//	public JTextField grootte; // invoerbox veldgrootte
//	private JButton teken; // Teken button
//	
//	
//	public BalPaneel() {
//		
//		teken = new JButton("teken bal");
//		teken.addActionListener(new TekenBal());
//		grootte = new JTextField(3);
//		grootte.addActionListener(new TekenBal());
//		
//		add(grootte);
//		add(teken);
//	}
	
	TekenBal bal = new TekenBal();
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		bal.tekenBal(g, 50, 50, 20);
	}
	
}
