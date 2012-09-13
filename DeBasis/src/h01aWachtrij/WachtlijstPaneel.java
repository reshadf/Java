package h01aWachtrij;

import javax.swing.*;
import java.awt.event.*;

public class WachtlijstPaneel extends JPanel implements ActionListener {
	private JButton knop;
	private JTextField veld1;
	private JTextField veld2;
	private JTextField veld3;
	private JTextField veld4;
	private JTextArea textveld1;

	/*
	 * maak een form panel en geef ze weer zet veld 2 tot 4 en textarea op ReadOnly
	 */

	public WachtlijstPaneel() {
	
		knop = new JButton("Schuif op");
		knop.addActionListener(this);
		veld1 = new JTextField(13);
		veld2 = new JTextField(13);
		veld3 = new JTextField(13);
		veld4 = new JTextField(13);
		textveld1 = new JTextArea(15, 13);
		add(veld1);
		add(knop);
		add(veld2);
		add(veld3);
		add(veld4);
		add(textveld1);
		veld2.setEditable(false);
		veld3.setEditable(false);
		veld4.setEditable(false);
		textveld1.setEditable(false);
	}
	
	/*
	 * Hier wordt bepaald dat de value van de velden wordt verschoven
	 *  wanneer de button getriggerd wordt.
	 */
	public void actionPerformed(ActionEvent e) {
		
		// kijk of veld 1 ingevuld is
		if(veld1.getText() == null || veld1.getText().trim().equals( "" ) ) { 
	        // geef error
	        System.out.println("U heeft niets ingevuld in veld1");
	    }
	    else {
	    	
	    	textveld1.append( veld4.getText() + "\n" );
	    	veld4.setText( veld3.getText() );
			veld3.setText( veld2.getText() );
			veld2.setText( veld1.getText() );
			veld1.setText("");
	    }
	}
}