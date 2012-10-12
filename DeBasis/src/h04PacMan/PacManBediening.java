package h04PacMan;

/*
 * bediening van PacMan
 */

import java.awt.event.*;

import javax.swing.*;

public class PacManBediening extends JPanel implements ActionListener, KeyListener {
	
	private JButton links, rechts, boven, beneden;
	PacMan pacman;
	private final int minus = -10;
	private final int plus = 10;

	public PacManBediening(PacMan pacman) {
		
		this.pacman = pacman;
		this.setFocusable(true);
		this.addKeyListener(this);
		
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
			
			pacman.setRichtingEnSnelheid( minus );
			pacman.setBesturing(0);
			pacman.setView(180);
			//System.out.println("links");
		}
		else if(e.getSource() == rechts) {
			pacman.setRichtingEnSnelheid( plus );
			pacman.setBesturing(0);
			pacman.setView(0);
			//System.out.println("rechts");
		}
		else if(e.getSource() == boven) {
			pacman.setRichtingEnSnelheid( minus );
			pacman.setBesturing(1);
			pacman.setView(90);
			//System.out.println("boven");
		}
		else {
			pacman.setRichtingEnSnelheid( plus );
			pacman.setBesturing(1);
			pacman.setView(270);
			//System.out.println("beneden");
		}
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_LEFT) {
			pacman.setRichtingEnSnelheid( minus );
			pacman.setBesturing(0);
			pacman.setView(180);
			System.out.println("links");
		}
		else if(key == KeyEvent.VK_RIGHT) {
			pacman.setRichtingEnSnelheid( plus );
			pacman.setBesturing(0);
			pacman.setView(0);
			System.out.println("rechts");
		}
		else if(key == KeyEvent.VK_UP) {
			pacman.setRichtingEnSnelheid( minus );
			pacman.setBesturing(1);
			pacman.setView(90);
			System.out.println("boven");
		}
		else if(key == KeyEvent.VK_DOWN) {
			pacman.setRichtingEnSnelheid( plus );
			pacman.setBesturing(1);
			pacman.setView(270);
			System.out.println("beneden");
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
