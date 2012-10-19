package h05GrootsteWaarde;

import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;

public class Bediening extends JPanel implements ActionListener {

	GetallenGenerator generator;
	private JButton bereken;
	private JTextArea veld;
	
	public Bediening(GetallenGenerator generator) {
		
		this.generator = generator;
		
		bereken = new JButton("Bereken kleinste");
		bereken.addActionListener(this);
		add(bereken);
		
		veld = new JTextArea(13, 40);
		veld.setEditable(false);
		veld.setWrapStyleWord(true);
		veld.setLineWrap(true);
		add(veld);
		
	}
	
	public void actionPerformed ( ActionEvent e ) {
		
		generator.setRandomValue();
		String hoi = " " + Arrays.toString(generator.getRandomValue());
		veld.setText(hoi + "\n Getal " + generator.getPosition() + " heeft de kleinste waarde namelijk" + generator.getLowestValue());
		
	}

}
