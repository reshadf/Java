package h06starheaven;

import java.awt.Color;

	public class StarRed extends Star {
		
		protected int r = 100;
		protected Color rood = new Color(211, 0, 0);
	
		public StarRed(int radius, int x, int y) {
			super(radius, x, y);
			
			this.color = rood;
		}
		
	}
