package h02aKaars;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class CandlePaneel extends JPanel implements ActionListener {
	
	int height = 250;
	int height2 = 250;
	public JTextField textfield;
	private JButton burn, toggle1, toggle2;
	private boolean aan1, aan2;
	
	public CandlePaneel() {
		
		burn = new JButton("Burn");
		burn.addActionListener(this);
		textfield = new JTextField(3);
		textfield.addActionListener(this);
		toggle1 = new JButton("1 Aan/Uit");
		toggle1.addActionListener(this);
		toggle2 = new JButton("1 Aan/Uit");
		toggle2.addActionListener(this);
		
		add(new JLabel("vul een cijfer tussen 0 en 15 in"));
		add(textfield);
		add(burn);
		add(toggle1);
		add(toggle2);
		
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
		if (height > 15 && aan1 == true) {
			
			candle.drawCandle(g, 20, positionY, height, aan1);
			
		}
		else {
			
			candle.drawCandleBurned(g, 20, positionY, height);
			
		}
		if (height2 > 15 && aan2 == true) {
			
			candle2.drawCandle(g, 120, position2Y, height2, aan2);
		}
		else {
			
			candle2.drawCandleBurned(g, 120, position2Y, height2);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if( e.getSource() == toggle1 ) {
			
			aan1 = !aan1;
			
			System.out.println(aan1);
			repaint();
		}
		
		if( e.getSource() == toggle2 ) {
			
			aan2 = !aan2;
			
			System.out.println(aan2);
			repaint();
			
		}

		try {
			// controleer of de ingevulde waarde tussen de 0 en de 15 is
			if( e.getSource() == burn && Integer.parseInt(textfield.getText()) < 16 && Integer.parseInt(textfield.getText()) > 0) {
				// brand kaars
				if( height > 15 && aan1 == true) {
					
					int aantal = Integer.parseInt(textfield.getText());
					height -= aantal;
				}

				
				if( height2 > 15 && aan2 == true) {
					int aantal = Integer.parseInt(textfield.getText());
					height2 -= aantal;
				}
				
				// opnieuw tekenen
				repaint();
				
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
