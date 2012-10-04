package h03volgendeDag;

import javax.swing.*;
import java.awt.event.*;

public class VolgendeDagPaneel extends JPanel implements ActionListener {

	private JTextField dagVeld, maandVeld, jaarVeld;
	private JButton berekenknop;
	private JTextField resultaatVeld;
	
	public VolgendeDagPaneel() {
		
		add(new JLabel("Dag"));
		dagVeld = new JTextField("14", 2);
		add(dagVeld);
		
		add(new JLabel("Maand"));
		maandVeld = new JTextField("9", 12);
		add(maandVeld);
		
		add(new JLabel("Jaar"));
		jaarVeld = new JTextField("2009", 4);
		add(jaarVeld);
		
		berekenknop = new JButton("volgende dag");
		berekenknop.addActionListener(this);
		add(berekenknop);
		
		resultaatVeld = new JTextField(23); // geen defaulttekst
		add(resultaatVeld);
		
	}
	
	BerekenDag berekening = new BerekenDag();
	
	public void actionPerformed(ActionEvent e) {
		
		int invoerdag = Integer.parseInt(dagVeld.getText());
		int invoermaand = Integer.parseInt(maandVeld.getText());
		int invoerjaar = Integer.parseInt(jaarVeld.getText());
		
		String resultaat = berekening.maakResultaattekst(invoerdag, invoermaand, invoerjaar);
		resultaatVeld.setText(resultaat);
		
	}

}
