package h03getalenSlinger;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class CountPanel extends JPanel implements ActionListener {
	
	private JTextField invoerVeld;
	private JButton actieKnop;
	private JTextArea berekening;

	public CountPanel() {
		
		actieKnop = new JButton("Start Berekening");
		actieKnop.addActionListener(this);
		invoerVeld = new JTextField(3);
		invoerVeld.addActionListener(this);
		berekening = new JTextArea(15, 35);
		berekening.setBackground(Color.black);
		berekening.setForeground(Color.white);
		berekening.setWrapStyleWord(true);
		berekening.setLineWrap(true);
		
		add(new JLabel("Geheel getal"));
		add(invoerVeld);
		add(actieKnop);
		add(berekening);
		
	}
	
	
	public void actionPerformed (ActionEvent e) {
		int value = Integer.parseInt(invoerVeld.getText());
		
		do {
			if(value % 2 == 0) {
				
				value = value / 2;
				String output = Integer.toString(value);
				berekening.append(output + "   ");
			}
			else {
				value = (value * 3) + 1;
				String output = Integer.toString(value);
				berekening.append(output + "   ");
			}
		}
		while(value != 1);
		
	}

}
