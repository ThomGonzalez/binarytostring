package mx.com.mycloud.utils;
import java.io.UnsupportedEncodingException;

public class Convert {

	public static byte[] fromBinary(String string) {
	    int sLen = string.length();
	    int len = sLen / Byte.SIZE;
	    if (sLen % Byte.SIZE != 0) {
	        len++;
	    }
	    byte[] toReturn = new byte[len];
	    for (int i = 0; i < sLen; i++) {
	        if (string.charAt(i) == '1') {
	            toReturn[i / Byte.SIZE] = (byte) (toReturn[i / Byte.SIZE] | (0x80 >>> (i % Byte.SIZE)));
	        }
	    }
	    return toReturn;
	}
	
    // Bytes to string
	public static String byteToBinary(String param) throws UnsupportedEncodingException {
		byte[] byt = param.getBytes("UTF-8");
		String str = new String(byt, "UTF-8");        
		return str;
	}
	
	public static String stringToBinary(String s) throws UnsupportedEncodingException{
		byte[] bytes = s.getBytes("UTF-8");
	    StringBuilder binary = new StringBuilder();
	    for (byte b : bytes)
	    {
	       int val = b;
	       for (int i = 0; i < 8; i++)
	       {
	          binary.append((val & 128) == 0 ? 0 : 1);
	          val <<= 1;
	       }
	       //binary.append(' ');
	    }
	    return binary.toString().trim();
	}
	
	public static String toString(String str) throws UnsupportedEncodingException{
		byte[] bytes = str.getBytes();
        byte[] newBytes = new byte[str.getBytes().length];
        for(int i = 0; i < bytes.length; i++){
              String binaryString = String.format("%8s", Integer.toBinaryString(bytes[i] & 0xFF)).replace(' ', '0');
              byte newByte = Byte.parseByte(binaryString, 2);
              newBytes[i] = newByte;
          }
        String string = new String(newBytes, "UTF-8");
        return string;
	}
}
