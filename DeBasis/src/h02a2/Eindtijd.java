package h02a2;

//import java.awt.*;
import javax.swing.*;

public class Eindtijd {
	
	JFrame venster = null;
	
	public Eindtijd() {
		
		JFrame venster = new JFrame();
		venster.setSize(350, 200);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setLocation(500, 100);
		venster.add(new EindtijdPaneel());  
		venster.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Eindtijd();
	}

}
