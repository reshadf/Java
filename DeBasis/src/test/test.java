package test;

public class test {

//	public static String s1 = "leiden";
//	public static String s = "";
//	
	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		
//		for(int i = s1.length() - 1; i >= 0; i--) {
//			
//			s = s + i;
//			System.out.println(s);
//			
//		}	
//
//	}
	  public static void main(String[] args) {
		   
		    StringBuilder a = new StringBuilder("did");
		    StringBuilder b = new StringBuilder(a);

		    if (b.toString().equals(a.reverse().toString())) {
		        System.out.println("true");
		    } else {
		        System.out.println("false");
		    }
		  }

}
