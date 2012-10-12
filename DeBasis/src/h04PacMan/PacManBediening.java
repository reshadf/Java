package h04PacMan;

/*
 * bediening van PacMan
 */

import java.awt.event.*;

import javax.swing.*;

public class PacManBediening extends JPanel implements ActionListener {
	
	private JButton links, rechts, boven, beneden;
	PacMan pacman;

	public PacManBediening(PacMan pacman) {
		
		this.pacman = pacman;
		
		links = new JButton("<");
		links.addActionListener(this);
		add(links);
		
		rechts = new JButton(">");
		rechts.addActionListener(this);
		add(rechts);
		
		boven = new JButton("^");
		boven.addActionListener(this);
		add(boven);
		
		beneden = new JButton("v");
		beneden.addActionListener(this);
		add(beneden);
		
	}
	
	/*
	 * bediening bij een klik
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == links) {
			
			pacman.setRichtingEnSnelheid( -10 );
			pacman.setBesturing(0);
			pacman.setView(180);
			//System.out.println("links");
		}
		else if(e.getSource() == rechts) {
			pacman.setRichtingEnSnelheid( +10 );
			pacman.setBesturing(0);
			pacman.setView(0);
			//System.out.println("rechts");
		}
		else if(e.getSource() == boven) {
			pacman.setRichtingEnSnelheid( -10);
			pacman.setBesturing(1);
			pacman.setView(90);
			//System.out.println("boven");
		}
		else {
			pacman.setRichtingEnSnelheid( +10);
			pacman.setBesturing(1);
			pacman.setView(270);
			//System.out.println("beneden");
		}
		
		
	}

}
