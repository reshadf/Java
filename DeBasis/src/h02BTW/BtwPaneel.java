package h02BTW;

import javax.swing.*;

import java.awt.event.*;

public class BtwPaneel extends JPanel implements ActionListener {
	
	public JTextField bedragInclusief, bedragBtw;
	public JTextArea uitvoer;
	public JButton berekenBtw;
	
	public BtwPaneel() {
		
		berekenBtw = new JButton("Bereken Btw");
		berekenBtw.addActionListener(this);
		bedragInclusief = new JTextField(9);
		bedragBtw = new JTextField(3);
		uitvoer = new JTextArea(6, 15);
		
		add(new JLabel("Bedrag inclusief btw"));
		add(bedragInclusief);
		add(new JLabel("Btw-percentage"));
		add(bedragBtw);
		add(new JLabel("%"));
		add(berekenBtw);
		add(uitvoer);
		
		
	}
	
	public void berekening() {
        // zet te textfields in variabelen
        float bedrag = Float.parseFloat(bedragInclusief.getText());
        float btwPercentage = 100 + Float.parseFloat(bedragBtw.getText());
        float bedragExBtw = bedrag / btwPercentage * 100; // netto prijs berekenen
        float btwBedrag = bedrag / btwPercentage * (btwPercentage - 100); // btw berekenen
        float b = (float)Math.round(bedragExBtw * 100) / 100;
        float x = (float)Math.round(btwBedrag * 100) / 100;
        
        uitvoer.setText("Bedrag ex btw: " + b + "\n" + "Bedrag van de Btw: " + x); 
        
	}
	
	public void actionPerformed(ActionEvent e) {
		
		try {
			
			berekening();
			
		}
		catch (NumberFormatException error) {
			
			JOptionPane.showMessageDialog(null, "Heeft u alles goed ingevuld?");
		}
	}

}
