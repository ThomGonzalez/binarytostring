package mx.com.mycloud;
import mx.com.mycloud.utils.Convert;

public class Demo {
	
	public static void main(String[] args) {
		
		TestWS ws = new TestWS();
		String x = ws.Ws();
		System.out.println("WS" + " " + x);
		
		try {
			String s = args[0];
			//String binary = Convert.stringToBinary(s);
	        //System.out.println("binary:" +binary);
	    
	        byte[] bytes = Convert.fromBinary(s);
	        //System.out.println("Bytes:" +bytes);
	  
	        String string = new String(bytes, "UTF-8");
	        System.out.println("String:" +string);
	        	        
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

	}
}
