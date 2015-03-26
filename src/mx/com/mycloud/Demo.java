package mx.com.mycloud;
import mx.com.mycloud.utils.Convert;

public class Demo {
	
	public static void main(String[] args) {
		
		TestWS ws = new TestWS();
		String x = ws.Ws();
		System.out.println("Main" + " " + x);
		
		try {
			String s = "I am programmer Java";
			String binary = Convert.stringToBinary(s);
	        System.out.println("Binary:" +binary);
	    
	        byte[] bytes = Convert.fromBinary(binary);
	        System.out.println("Bytes:" +bytes);
	  
	        String string = new String(bytes, "UTF-8");
	        System.out.println("String:" +string);
	        	        
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

	}
}
