package h05RegenboogPatroon;

import javax.swing.*;
import java.awt.event.*;

public class RegenboogBediening extends JPanel implements ActionListener {
	
	private JTextField invoerWaarde;
	private JButton tekenknop;
	TekenRegenboog tekenpaneel;

	public RegenboogBediening(TekenRegenboog tekenpaneel) {
		
		this.tekenpaneel = tekenpaneel;
		
		invoerWaarde = new JTextField(3);
		invoerWaarde.addActionListener(this);
		add(invoerWaarde);
		
		tekenknop = new JButton("teken opnieuw");
		tekenknop.addActionListener(this);
		add(tekenknop);
		
		//tekenpaneel.setHoogte(300);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		tekenpaneel.setBreedte_Rechthoek(Integer.parseInt(invoerWaarde.getText()));
		tekenpaneel.repaint();
		
	}

}
