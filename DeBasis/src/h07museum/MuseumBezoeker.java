package h07museum;

public class MuseumBezoeker {

	String kaartNummer;
	private int aankomstUur;
	private int aankomstMinuten;
	
	public MuseumBezoeker(String kaartNummer, int aankomstUur, int aankomstMinuten) {
		this.kaartNummer = kaartNummer;
		this.aankomstUur = aankomstUur;
		this.aankomstMinuten = aankomstMinuten;
	}
	
	public int berekenAanwezigheid(int vertrekUur, int vertrekMinuten) {
		
		int tijd = (vertrekUur - aankomstUur) + (vertrekMinuten - aankomstMinuten);
		
		return tijd;
	}

}
