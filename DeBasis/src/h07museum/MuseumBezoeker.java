package h07museum;

public class MuseumBezoeker {

	private String kaartNummer;
	private int aankomstUur;
	private int aankomstMinuten;
	
	public MuseumBezoeker(String kaartNummer, int aankomstUur, int aankomstMinuten) {
		this.kaartNummer = kaartNummer;
		this.aankomstUur = aankomstUur;
		this.aankomstMinuten = aankomstMinuten;
	}
	
	public String getKaartNummer() {
		return kaartNummer;
	}
	
	public int berekenAanwezigheid(int vertrekUur, int vertrekMinuten) {
		
		int remainingTime = ((vertrekUur * 60) + vertrekMinuten ) - ((aankomstUur * 60) + aankomstMinuten);
		int tijd = remainingTime / 60 + remainingTime % 60;
		
		return tijd;
	}

}
