package h05GekleurdeRechthoeken;

import java.awt.event.*;

import javax.swing.*;

public class KleurenstrookBediening extends JPanel implements ActionListener {
	
	private JButton tekenknop;
	KleurenstrookTeken tekenpaneel;

	public KleurenstrookBediening(KleurenstrookTeken tekenpaneel) {
		
		this.tekenpaneel = tekenpaneel;
		tekenknop = new JButton("Teken kleurvlakken");
		tekenknop.addActionListener(this);
		add(tekenknop);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		tekenpaneel.repaint();
		
	}

}
