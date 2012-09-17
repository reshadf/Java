package h02a5;

import javax.swing.*;

public class BalPaneel extends JPanel {

	protected JTextField grootte; // invoerbox veldgrootte
	private JButton teken; // Teken button
	
	
	public BalPaneel() {
		
		teken = new JButton("teken bal");
		teken.addActionListener(new Resizer());
		grootte = new JTextField(3);
		grootte.addActionListener(new Resizer());
		
		add(grootte);
		add(teken);
	}
}
