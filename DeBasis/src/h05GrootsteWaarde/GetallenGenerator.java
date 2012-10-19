package h05GrootsteWaarde;

import javax.swing.*;
import java.util.*;

public class GetallenGenerator extends JPanel {

	int klein;
	
	public GetallenGenerator() {

	}
	
	
	int[] val = new int[21];
	Random generator = new Random();
	
	public void setRandomValue() {
		
		
		 for (int i = 0; i < val.length; i++)
		 {
			 val[i] = generator.nextInt(201) - 100;
		 } 
		 
	}
	
	public int[] getRandomValue() {
		
		setLowestValue();
		return val;
		
	}
	
	int positie;

	
	public int getPosition() {
		return positie;
	}
	
	public void setLowestValue() {
		
		int kleinste = val[0]; // kleinste getal initialiseren
		for(int index=1; index<val.length; index++) {
			
			if(val[index] < kleinste) {
				
				kleinste = val[index];
				positie = index + 1;
			}
			
		}
		
		klein = kleinste;
		
	}
	
	public int getLowestValue() {
		
		return klein;
		
	}

}
