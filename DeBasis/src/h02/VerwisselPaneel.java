package h02;

import javax.swing.*;
import java.awt.event.*;

public class VerwisselPaneel extends JPanel implements ActionListener {
	
	private JTextField veld1, veld2;
	private JButton knop;
	
	public VerwisselPaneel() {
		
		knop = new JButton("Verwissel");
		knop.addActionListener(this);
		veld1 = new JTextField(13);
		veld2 = new JTextField(13);
		add(veld1);
		add(knop);
		add(veld2);
	}
	
	public void actionPerformed(ActionEvent e) {
		String storage = veld2.getText();
		veld2.setText(veld1.getText());
		veld1.setText(storage);
		
	}
}
