package h05UitgeschrevenGetal;

import java.awt.event.*;
import java.util.regex.*;

import javax.swing.*;

public class GetalConverter extends JPanel implements ActionListener {
	
	private JLabel getal;
	private JTextField invoer, uitvoer;
	private int invoerWaarde;
	private String convertedVal;
	private JButton converteer;
	
	String[] klein = new String[20];
    String[] groot = new String[10];

	public GetalConverter() {
		
		getal = new JLabel("geef een geheel getal");
		add(getal);
		
		invoer = new JTextField(7);
		invoer.addActionListener(this);
		add(invoer);
		
		converteer = new JButton("In woorden");
		converteer.addActionListener(this);
		add(converteer);
		
		uitvoer = new JTextField(20);
		uitvoer.setEditable(false);
		add(uitvoer);
		
		klein[0] = "nul";
		klein[1] = "een";
		klein[2] = "twee";
		klein[3] = "drie";
		klein[4] = "vier";
		klein[5] = "vijf";
		klein[6] = "zes";
		klein[7] = "zeven";
		klein[8] = "acht";
		klein[9] = "negen";
		klein[10] = "tien";
		klein[11] = "elf";
		klein[12] = "twaalf";
		klein[13] = "dertien";
		klein[14] = "veertien";
		klein[15] = "vijftien";
		klein[16] = "zestien";
		klein[17] = "zeventien";
		klein[18] = "achtien";
		klein[19] = "negentien";
		
		groot[1] = "tien";
		groot[2] = "twintig";
		groot[3] = "dertig";
		groot[4] = "veertig";
		groot[5] = "vijftig";
		groot[6] = "zestig";
		groot[7] = "zeventig";
		groot[8] = "tachtig";
		groot[9] = "negentig";
		
	}
	
	public void setValue(int val) {
		
		 invoerWaarde = val;
	}
	
	public int getValue() {
		
		return invoerWaarde;
		
	}
	
	public void Convert()
	{
	   int grootVal, kleinVal;
	   String valueString;
	   if(invoerWaarde < 100){
	      // gevonden in arrays ?
	      grootVal = (int)Math.floor(invoerWaarde / 10.0);
	      kleinVal = invoerWaarde - (grootVal * 10);
	      try{
	    	  if(invoerWaarde < 20){
	    		  valueString = klein[kleinVal] + "" + groot[grootVal];
	    	  }
	    	  else {
	    		  valueString = klein[kleinVal] + "en" + groot[grootVal];  
	    	  }
	    	  
	    	  convertedVal = valueString;
	    	  
	      }
	      catch(ArrayIndexOutOfBoundsException err){
	          System.out.println("Error 1");
	      }
	   }
	}
	
	public String getConvertedValue() {
		
		return convertedVal;
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		setValue(Integer.parseInt(invoer.getText()));
		Convert();
		uitvoer.setText(convertedVal);
		
	}

}
