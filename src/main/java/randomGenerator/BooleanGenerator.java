package randomGenerator;

import java.util.Random;

public class BooleanGenerator {
	
	public String boolGenerator()
	{
		Boolean b = new Random().nextBoolean(); 
		System.out.println(b);
		return b.toString(); 
	}

}
