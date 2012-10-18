package h05Dobbelsteen;

import java.awt.*;

import javax.swing.JPanel;

public class DobbelSteen extends JPanel {
	
	private final static int SPOT_DIAMETER = 40; // diameter dobbelsteen rondjes
	private int faceValue; // getoonde waarde op scherm

	public DobbelSteen() {
		
	}
	
	/*
	 * roll de dobbelsteen
	 */
	public int roll() {
		
		int val = (int) (6*Math.random() + 1); // bepaal getal tussen 1 - 6
		setValue(val);
		System.out.println(val);
		return val;
		
	}
	
	/*
	 * set de waarde van de roll
	 */
	public void setValue(int spots) {
		faceValue = spots;
		repaint();
	}
	
	/*
	 * get de waarde van de roll
	 */
	public int getValue() {
		return faceValue;
	}
	
	/*
	 * teken de view van de dobbelsteen
	 */
	public void paintComponent(Graphics g) {
		
		int w = getWidth();  // Get height and width
        int h = getHeight();
        
        // Graphics naar 2d
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        
        //... Paint background
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, w, h);
        g2.setColor(Color.BLACK);
        
        g2.drawRect(0, 0, w-1, h-1);  // Draw border
        
        switch (faceValue) {
            case 1:
                drawSpot(g2, w/2, h/2);
                break;
            case 3:
                drawSpot(g2, w/2, h/2);

            case 2:
                drawSpot(g2, w/4, h/4);
                drawSpot(g2, 3*w/4, 3*h/4);
                break;
            case 5:
                drawSpot(g2, w/2, h/2);
            case 4:
                drawSpot(g2, w/4, h/4);
                drawSpot(g2, 3*w/4, 3*h/4);
                drawSpot(g2, 3*w/4, h/4);
                drawSpot(g2, w/4, 3*h/4);
                break;
            case 6:
                drawSpot(g2, w/4, h/4);
                drawSpot(g2, 3*w/4, 3*h/4);
                drawSpot(g2, 3*w/4, h/4);
                drawSpot(g2, w/4, 3*h/4);
                drawSpot(g2, w/4, h/2);
                drawSpot(g2, 3*w/4, h/2);
                break;
        }
    }
	
	/*
	 * Teken de spots
	 */
    private void drawSpot(Graphics2D g2, int x, int y) {
        g2.fillOval(x-SPOT_DIAMETER/2, y-SPOT_DIAMETER/2, SPOT_DIAMETER, SPOT_DIAMETER);
    }

}
