package h04SelfBurnCandle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import h02aKaars.DrawCandle;

public class CandlePanel extends JPanel implements ActionListener {

	private boolean aan = true;
	private int lengte = 500;
	private int x;
	private int y;
	private int speed = 1;
	private final int WACHTTIJD = 100; // wachttijd voor de timer
	
	public CandlePanel() {
		
		javax.swing.Timer autoburn = new javax.swing.Timer(WACHTTIJD,this);
		
		autoburn.start();
		
	}
	
	DrawCandle candle = new DrawCandle();
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		x = 10;
		y = getHeight() - (lengte + 10);
		
		for(int i=0; i < 5; i++) {
			
			if(lengte > 15){
			
			candle.drawCandle(g, x, y, lengte, aan);
			
			}
			else {
				
				candle.drawCandleBurned(g, x, y, lengte);
				
			}
			
			x = x + 70;
			
			System.out.println(lengte);
			
		}
		
	}
	
	public int getCandleSize() {
		
	    if(lengte > 15) {
	        lengte -= speed;
	    }

	    return lengte;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		getCandleSize();
		//System.out.println(lengte);
		repaint();
		
	}

}
