package h04autoBal;

import java.awt.event.*;

import javax.swing.*;

public class AutoBalBediening extends JPanel implements ActionListener {
	
	private JButton wisselRichting;
	private JButton verticaal;
	AutoBal bal;

	public AutoBalBediening(AutoBal bal) {
		
		this.bal = bal;
		
		wisselRichting = new JButton("Wissel van richting");
		wisselRichting.addActionListener(this);
		add(wisselRichting);
		
		verticaal = new JButton("Verplaats verticaal");
		verticaal.addActionListener(this);
		add(verticaal);
		
	}
	
	/*
	 * Bediening bij een klik
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if( e.getSource() == wisselRichting ) {
			
			bal.setRichtingEnSnelheid( -bal.getRichtingEnSnelheid() );
			
		}
		else {
			
			bal.setVerPlaats( bal.getVerPlaats() + bal.getRichtingEnSnelheid() );
			
		}
		
	}

}
