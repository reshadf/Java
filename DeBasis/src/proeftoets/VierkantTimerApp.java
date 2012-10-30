package proeftoets;

import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;

public class VierkantTimerApp extends JFrame implements ActionListener {
	
	VierkantPaneel mijnPaneel;
	JButton linkerButton, rechterButton;
	JButton naarBovenButton, naarBenedenButton;
	
	public VierkantTimerApp() {
		
		setSize(300, 100);
		setTitle("Spelen met vierkanten");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		linkerButton = new JButton("links");
		rechterButton = new JButton("rechts");
		naarBovenButton = new JButton("boven");
		naarBenedenButton = new JButton("beneden");
		
		linkerButton.addActionListener(this);
		rechterButton.addActionListener(this);
		naarBovenButton.addActionListener(this);
		naarBenedenButton.addActionListener(this);
		
		add(linkerButton, BorderLayout.WEST);
		add(naarBovenButton, BorderLayout.NORTH);
		add(rechterButton, BorderLayout.EAST);
		add(naarBenedenButton, BorderLayout.SOUTH);
		
		add(mijnPaneel, BorderLayout.CENTER);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == linkerButton) {
			mijnPaneel.setRichting(1);
		}
		if(ae.getSource() == rechterButton) {
			mijnPaneel.setRichting(3);
		}
		if(ae.getSource() == naarBovenButton) {
			mijnPaneel.setRichting(2);
		}
		if(ae.getSource() == naarBenedenButton) {
			mijnPaneel.setRichting(4);
		}
	}
	
	public static void main(String[] args) {
		
		new VierkantTimerApp();

	}

}
