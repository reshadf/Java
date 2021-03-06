package h01;

import javax.swing.*;
import java.awt.event.*;

public class Kopieerpaneel extends JPanel implements ActionListener {
	private JTextField veld1;
	private JTextField veld2;
	private JButton actieknop;
	
	/*
	 * maak paneel met twee tekstvelden en een knop ertussen.
	 */
	public Kopieerpaneel() {
		actieknop = new JButton(">Kopieer>");
		actieknop.addActionListener(this);
		veld1 = new JTextField(13); // textvak met ruimte voor 13 tekens.
		veld2 = new JTextField(13);
		veld1.setToolTipText("Vul hier uw text in");
		veld2.setToolTipText("Hier komt een kopie van het linkerveld");
		actieknop.setToolTipText("Kopieer veld");
		add(veld1);
		add(actieknop);
		add(veld2);	
	}
	
	/*
	 * veld 2 krijgt de inhoud van veld 1
	 */
	public void actionPerformed(ActionEvent e) {
		veld2.setText( veld1.getText() );
		veld1.setText("");
	}
	
}
