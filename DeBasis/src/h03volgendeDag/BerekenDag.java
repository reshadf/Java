package h03volgendeDag;

public class BerekenDag {
	
	public String maakResultaattekst(int dag, int maand, int jaar) {
		
		if(bestaanbareDatum(dag, maand, jaar)) {
		
			String resultaat = "De dag na " +
			dag + "-" + maand + "-" + jaar + " is ";
			
			dag++;
			if( dag > aantalDagenInMaand(maand, jaar)) {
				
				dag = 1;
				maand++;
				
				if(maand > 12) {
					
					maand = 1;
					jaar++;
					
				}
				
			}
			return resultaat + dag + "-" + maand + "-" + jaar;
		}
		else {
			return "ongeldige datum";
		}
	}
	
	public int aantalDagenInMaand( int maand, int jaar ) {
		
		final int APRIL=4, JUNI=6, SEPTEMBER=9, NOVEMBER=11;
		final int FEBRUARI=2;
		int aantalDagen = 31;
		
		if(maand == APRIL || maand == JUNI || maand == SEPTEMBER || maand == NOVEMBER) {
			
			aantalDagen = 30;
			
		}
		else if(maand == FEBRUARI) {
			
			aantalDagen = 28;
			if(isSchrikkeljaar(jaar)) {
				
				aantalDagen = 29;
				
			}
			
		}
		
		return aantalDagen;
		
	}
	
	public boolean isSchrikkeljaar(int jaartal) {
		
		return ((jaartal % 4 == 0) && (jaartal % 100 != 0)) || (jaartal % 400 == 0);
		
	}
	
	public boolean bestaanbareDatum(int dag, int maand, int jaar) {
		
		return ((jaar >= 1582) && (maand > 0) && (maand < 13) && (dag > 0) && (dag < 32));
		
	}

}
