package h02a2;

import javax.swing.*;
import java.awt.event.*;

public class EindtijdPaneel extends JPanel implements ActionListener {
	// declareer alle velden
	private JLabel uur, minuut, tijd;
	private JTextField veldUur, veldMinuut, tijdsDuur, eindTijd;
	private JButton bereken;
	
	public EindtijdPaneel() {
		
		bereken = new JButton("Bereken eindtijd");
		bereken.addActionListener(this);
		veldUur = new JTextField(2);
		veldMinuut = new JTextField(2);
		tijdsDuur = new JTextField(10);
		eindTijd = new JTextField(25);
		uur = new JLabel("Begintijd uren");
		minuut = new JLabel("minuten");
		tijd = new JLabel("Tijdsduur in minuten");
		add(uur);
		add(veldUur);
		add(veldMinuut);
		add(minuut);
		add(tijd);
		add(tijdsDuur);
		add(bereken);
		add(eindTijd);
	}
	
	public void showResult() {
		// berekening
	}
	
	public void actionPerformed(ActionEvent e) {
	// hier uitvoer	
		
	}

}
