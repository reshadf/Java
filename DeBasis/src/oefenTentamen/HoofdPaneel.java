package oefenTentamen;

import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class HoofdPaneel extends JPanel implements MouseListener, KeyListener {
	
	private ArrayList<KaartPaneel> mijnKaartLijst;
	private ArrayList<KaartPaneelController> mijnControllerLijst;

	public HoofdPaneel() {
		setLayout(null);
		addMouseListener(this);
		addKeyListener(this);
		setFocusable(true);
		mijnKaartLijst = new ArrayList<KaartPaneel>();
		mijnControllerLijst = new ArrayList<KaartPaneelController>();
	}

	@Override
	public void keyPressed(KeyEvent ke) {
		if(ke.getKeyCode() == KeyEvent.VK_D) {
			for(KaartPaneel kp : mijnKaartLijst) {
				remove(kp);
				repaint();
			}
		}
		
		if(ke.getKeyCode() == KeyEvent.VK_I) {
			for(KaartPaneel kp : mijnKaartLijst) {
				add(kp);
				repaint();
			}
		}
		
		if(ke.getKeyCode() == KeyEvent.VK_H) {
			for(KaartPaneelController kpc : mijnControllerLijst) {
				kpc.pleaseStart();
			}
		}
		
		if(ke.getKeyCode() == KeyEvent.VK_E) {
			for(KaartPaneelController kpc : mijnControllerLijst) {
				kpc.pleaseStop();
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent ke) {}

	@Override
	public void keyTyped(KeyEvent ke) {
		System.out.println(ke.getKeyChar());
	}

	@Override
	public void mouseClicked(MouseEvent me) {}

	@Override
	public void mouseEntered(MouseEvent me) {
		requestFocus();
	}

	@Override
	public void mouseExited(MouseEvent me) {}

	@Override
	public void mousePressed(MouseEvent me) {
		KaartPaneel kp = new KaartPaneel( me.getX(), me.getY(), 50);
		KaartPaneelController kpc = new KaartPaneelController(kp);
		add(kp);
		mijnKaartLijst.add(kp);
		mijnControllerLijst.add(kpc);
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent me) {}

}
