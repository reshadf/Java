package h02BTW;

import javax.swing.*;
import java.awt.event.*;

public class BtwPaneel extends JPanel implements ActionListener {
	
	public JTextField bedragInclusief, bedragBtw;
	public JTextArea uitvoer;
	public JButton berekenBtw;
	
	public BtwPaneel() {
		
		berekenBtw = new JButton("Bereken Btw");
		berekenBtw.addActionListener(this);
		bedragInclusief = new JTextField(9);
		bedragBtw = new JTextField(3);
		uitvoer = new JTextArea(6, 15);
		
		add(new JLabel("Bedrag inclusief btw"));
		add(bedragInclusief);
		add(new JLabel("Btw-percentage"));
		add(bedragBtw);
		add(new JLabel("%"));
		add(berekenBtw);
		add(uitvoer);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}

}
