package h06starheaven;

import java.awt.Color;

public class StarRed extends Star {
	
	protected int r = 221;
	protected Color rood = new Color(221, 0, 0);

	public StarRed(int radius, int x, int y) {
		super(radius, x, y);
		
		
		this.color = rood;
		
		System.out.println(r);
	}
	
}
