package test;

public class test {
	
	/**
	 * @param args
	 */
	  public static void main(String[] args) {
		  
		  String[] dagVanDeWeek = {"Zo", "Ma", "Di", "Wo", "Do", "Vr", "Za"};
		  
		  for(int x = 0; x < dagVanDeWeek.length - 1; x++) {
			  dagVanDeWeek[x + 1] = dagVanDeWeek[x];
		  }
		  
		  for(String dag : dagVanDeWeek) {
			  System.out.println(dag);
		  }
		  
		  
		  
	  }   
}
