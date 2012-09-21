package h02aKaars;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class CandlePaneel extends JPanel implements ActionListener {
	
	int height = 250;
	int height2 = 250;
	public JTextField textfield;
	private JButton burn;
	
	public CandlePaneel() {
		
		burn = new JButton("Burn");
		burn.addActionListener(this);
		textfield = new JTextField(3);
		textfield.addActionListener(this);
		
		add(new JLabel("vul een cijfer tussen 0 en 15 in"));
		add(textfield);
		add(burn);
		
	}
	
	// define variabel Candle aan new DrawCandle();
	DrawCandle candle = new DrawCandle();
	DrawCandle candle2 = new DrawCandle();
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		int positionY = getHeight() - (height + 10); // absolute positionering 10px van onderen
		int position2Y = getHeight() - (height2 + 10);
		
		// teken een kaars met vlam als hoogte > 15 anders teken een kaars zonder vlam
		if (height > 15) {
			
			candle.drawCandle(g, 20, positionY, height);
			
		}
		else {
			
			candle.drawCandleBurned(g, 20, positionY, height);
			
		}
		if (height2 > 15) {
			
			candle2.drawCandle(g, 120, position2Y, height2);
		}
		else {
			
			candle2.drawCandleBurned(g, 120, position2Y, height2);
		}
	}
	
	public void actionPerformed(ActionEvent e) {

		try {
			// controleer of de ingevulde waarde tussen de 0 en de 15 is
			if(Integer.parseInt(textfield.getText()) < 16 && Integer.parseInt(textfield.getText()) > 0) {
				// brand kaars
				if( height > 15 ) {
					
					int aantal = Integer.parseInt(textfield.getText());
					height -= aantal;
					repaint();
				}
				else {
					
					JOptionPane.showMessageDialog(null, "Oeps: Uw kaars is opgebrand!"); // alertbox melding
				}
			}
			else {
				
				JOptionPane.showMessageDialog(null, "error: vul een getal tussen de 0 en 15 in!"); // alertbox melding
				
			}
		}
		catch(NumberFormatException error) {
			
			JOptionPane.showMessageDialog(null, "error: een van de velden bevat geen cijfer of is niet ingevuld!"); // alertbox melding
			
		}
		
	}

}
