package h02a2;

import javax.swing.*;
import java.awt.event.*;

/*
 * eindtijd berekenen
 */

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
		tijdsDuur = new JTextField(2);
		eindTijd = new JTextField(25);
		eindTijd.setEditable(false);
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
	
	public void Calculate() {
		/*
		 * Berekening van de starttijd en invoertijd naar een eindtijd
		 */
	        double minutes = ((Integer.parseInt(veldUur.getText()) * 60) + Integer.parseInt(veldMinuut.getText()) + Integer.parseInt(tijdsDuur.getText()));// alle minuten optellen
	        double uitvoer = minutes / 60f; // alle minuten naar uren omrekenen
	        double hours = Math.floor(uitvoer); // omrekenen naar hele uren
	        minutes = minutes - (hours * 60); // overige minuten berekenen
	        minutes = Math.floor(minutes); // omrekenen naar hele minuten
	        String resultaat =  "De eindtijd is: " + (int)hours + " uren, en " + (int)minutes + " minuten, ";
	        eindTijd.setText(resultaat);	
	}
	
	public void actionPerformed(ActionEvent e) {
	// hier uitvoer	
		try{
			
			Calculate();
		}
		catch(NumberFormatException nfe) {
			
			//System.out.println("error: bevat geen numerieke waarde"); // system melding
			JOptionPane.showMessageDialog(null, "error: een van de velden bevat geen cijfer of is niet ingevuld!"); // alertbox melding
		}
	}

}
