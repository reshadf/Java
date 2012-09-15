package h02a3;

import javax.swing.*;

public class Rechthoeken {

	JFrame venster = null;
	
	public Rechthoeken() {
		// TODO Auto-generated constructor stub
		
		JFrame venster = new JFrame();
		venster.setSize(500, 200);
		venster.setLocation(500, 500);
		venster.setTitle("Pixels in het venster");
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.add(new RechthoekenPaneel());
		venster.setVisible(true);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try { 
			new Rechthoeken();
		}
		
		catch(RuntimeException e) {
			JOptionPane.showMessageDialog(null, "error");
		}

	}

}
