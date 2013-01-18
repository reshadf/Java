package oefenTentamen;

public class KaartPaneelController implements Runnable {
	
	private KaartPaneel hetKaartPaneel;
	private boolean doorgaan;

	public KaartPaneelController(KaartPaneel kp) {
		hetKaartPaneel = kp;
	}

	@Override
	public void run() {
		while (doorgaan) {
			slaap(500);
			hetKaartPaneel.verplaats();
		}
	}
	
	public void pleaseStart() {
		doorgaan = true;
		Thread draadje = new Thread(this);
		draadje.start();
	}
	
	public void pleaseStop() {
		doorgaan = false;
	}
	
	private void slaap(int hoelang) {
		try {
			Thread.sleep(hoelang);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}

}
