package h01MVCstoplicht;

import java.awt.Color;

public class VerkeersLichtModel {

	private boolean rood, groen, oranje;
	
	public VerkeersLichtModel(boolean rood, boolean groen, boolean oranje) {
		this.rood = rood;
		this.groen = groen;
		this.oranje = oranje;
	}
	
	public void setRood() {
		this.rood = true;
	}
	
	public void setGroen() {
		this.groen = true;
	}
	
	public void setOranje() {
		this.oranje = true;
	}
	
	public void reset() {
		this.rood = false;
		this.groen = false;
		this.oranje = false;
	}
	
	public boolean getRood() {
		return this.rood;
	}
	
	public boolean getGroen() {
		return this.groen;
	}
	
	public boolean getOranje() {
		return this.oranje;
	}

}
