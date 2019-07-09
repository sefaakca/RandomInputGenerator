package randomGenerator;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class StringGenerator {
	
	private int hex_down = 65; // letter 'A'
    private int hex_up = 122; // letter 'z'
    private int targetStringLength = 10;
    private Random random = new Random();
	public String stringGenerator()
	{
		
	    
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = hex_down + (int) 
	          (random.nextFloat() * (hex_up - hex_down + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();
	 
	    System.out.println(generatedString);
	    return generatedString;
	}
	


}
