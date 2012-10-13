package h05Dobbelsteen;

import java.awt.event.*;
import javax.swing.*;

public class Worp extends JPanel implements ActionListener {

	private JButton worp;
	
	DobbelSteen dobbelsteen;
	
	public Worp(DobbelSteen dobbelsteen) {
		
		this.dobbelsteen = dobbelsteen;
		
		dobbelsteen = new DobbelSteen();
		worp = new JButton("Werp de dobbelsteen");
		worp.addActionListener(this);
		
		add(worp);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		dobbelsteen.roll();
		repaint();
		
	}

}
