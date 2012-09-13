package h02;

import javax.swing.*;
import java.awt.event.*;

public class OptelPaneel extends JPanel implements ActionListener {
	
	private JTextField veld1, veld2, veld3, veldTotaal;
	private JButton optellen;
	
	public OptelPaneel() {
		
		optellen = new JButton("Tel op");
		optellen.addActionListener(this);
		veld1 = new JTextField(3);
		veld2 = new JTextField(3);
		veld3 = new JTextField(3);
		veldTotaal = new JTextField(3);
		add(veld1);
		add(veld2);
		add(veld3);
		add(optellen);
		add(veldTotaal);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		int getal1 = Integer.parseInt(veld1.getText());
		int getal2 = Integer.parseInt(veld2.getText());
		int getal3 = Integer.parseInt(veld3.getText());
		veldTotaal.setText("" + (getal1 + getal2 + getal3));
		
	}

}
