package h05UitgeschrevenGetal;

import java.awt.event.*;
import java.util.Random;

import javax.swing.*;
import java.util.*;

public class GetalConverter extends JPanel implements ActionListener {
	
	private JLabel getal;
	private JTextField invoer, uitvoer;
	private int invoerWaarde;
	private JButton converteer;
	
	private int klein = 19;
	String[] strings = new String[klein];
    Random random = new Random();
    
    private int groot = 90;
    String[] stringsGroot = new String[groot];
    
    int standardValue = 0;

	public GetalConverter() {
		
		getal = new JLabel("geef een geheel getal");
		
		invoer = new JTextField(7);
		invoer.addActionListener(this);
		add(invoer);
		
		converteer = new JButton("In woorden");
		converteer.addActionListener(this);
		add(converteer);
		
		uitvoer = new JTextField(7);
		uitvoer.setEditable(false);
		add(uitvoer);
		
		/*
		 * kleine getallen
		 */
		
		for(int i = 0; i < klein; i++) {
			
			strings[i] = "" + random.nextInt(klein);
			
		}
		
		
		/*
		 * grote getallen
		 */
		
		for(int g = 0; g < groot; g += 10) {
			
			stringsGroot[g] = "" + random.nextInt(groot);
			
		}
		
		
		
	}
	
	public void setValue(int val) {
		
		 invoerWaarde = val;
		 //System.out.println(invoerWaarde);
	}
	
	public int getValue() {
		
		return invoerWaarde;
		
	}
	
//	public void convert(int waar) {
//		
//		for(int i=0;i<strings.length;i++){
//			   if(strings[i].equals(invoerWaarde)){
//				      System.out.println("index" + i);
//				      System.out.println("valye" + strings[i]);
//			   }
//			}
//		
//	}
	
	public void convert(Integer waar) {
	    for(int index=0;index<strings.length;index++){
	       if(strings[index].equals(String.valueOf(waar))){
	          System.out.println("index -> "+index);
	       }
	    }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		setValue(Integer.parseInt(invoer.getText()));
		convert(invoerWaarde);
		System.out.println(invoerWaarde);
		
	}

}
