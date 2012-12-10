package h07museum;

import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class MuseumPanel extends JPanel implements ActionListener {
	
	private JTextField kaartnummer;
	private JTextField uur, minuut;
	private JButton aankomst, vertrek, overzicht, sluiting;
	
	private int hour;
	private int minute;
	private final int REFRESH = 1000;
	
	MuseumRegistratie museum;

	public MuseumPanel(MuseumRegistratie museum) {
		
		this.museum = museum;
		
		// zorg ervoor dat de huidige tijd wordt opgehaald.
		javax.swing.Timer timer = new javax.swing.Timer(REFRESH, this);
		timer.start();
		
		kaartnummer = new JTextField(15);
		uur = new JTextField(2);
		minuut = new JTextField(2);
		aankomst = new JButton("Komt binnen");
		aankomst.addActionListener(this);
		vertrek = new JButton("Vertrekt");
		vertrek.addActionListener(this);
		overzicht = new JButton("aantal aanwezig");
		overzicht.addActionListener(this);
		sluiting = new JButton("sluiting");
		sluiting.addActionListener(this);
		
		add(new JLabel("Kaartnummer"));
		add(kaartnummer);
		add(new JLabel("tijdstip van aankomst of vertrek "));
		add(uur);
		add(new JLabel(" uur en "));
		add(minuut);
		add(new JLabel(" minuten"));
		add(aankomst);
		add(vertrek);
		add(overzicht);
		add(sluiting);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Calendar now = Calendar.getInstance();
		hour = now.get(Calendar.HOUR_OF_DAY);
		minute = now.get(Calendar.MINUTE);
		
		uur.setText("" + hour);
		minuut.setText("" + minute);
		
		// aankomst
		if(e.getSource() == aankomst) {
			try {
				
				museum.checkIn(kaartnummer.getText(), hour, minute);
			} catch (NullPointerException ex) {
				
				System.out.println("cardnumber: " + kaartnummer.getText() + " hour " + hour + " minute " + minute);
			}
		}
		// vertrek
		if(e.getSource() == vertrek) {
			museum.checkOut(kaartnummer.getText(), hour, minute);
		}
		// overzicht
		if(e.getSource() == overzicht) {
			//museum.getAantalAanwezig();
			JOptionPane.showMessageDialog(null, "Nog " + museum.getAantalAanwezig() + " personen aanwezig.");
		}
		// sluiting
		if(e.getSource() == sluiting) {
			museum.sluitRegistratie();
		}
	}
}
