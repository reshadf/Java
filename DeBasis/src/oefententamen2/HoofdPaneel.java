package oefententamen2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class HoofdPaneel extends JPanel implements MouseListener {

	public HoofdPaneel() {
		setLayout(null);
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent me) {
		// TODO Auto-generated method stub
		KaartPaneel kp = new KaartPaneel(me.getX(), me.getY());
		add(kp);
	}

	@Override
	public void mouseReleased(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}

}
