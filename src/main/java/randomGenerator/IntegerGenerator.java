package randomGenerator;

import java.util.Random;
//import java.util.concurrent.ThreadLocalRandom;

public class IntegerGenerator {
	
	public Random random = new Random();
	
	public double highNumber=1;
	public double signedlowNumber=0;
	public static final int UnsignedlowNumber = 1;
	public int randomNumber=0;
	public enum IntTypes{
		INT256,
		INT128,
		INT64,
		INT32,
		INT,
		UINT256,
		UINT128,
		UINT64,
		UINT32,
		UINT;
		
		
	}
	
	public String GenerateInteger(String type)
	{
		
		type=type.toUpperCase();
		
		switch(type) {
		case "INT256":
		case "INT":
			highNumber = (Math.pow(2, 255)-1);
			signedlowNumber = (int) (Math.pow(-2, 255)-1);
			
			randomNumber = (int) (random.nextDouble()*((highNumber-signedlowNumber)+1)+signedlowNumber);
			break;
		case "INT128":
			highNumber = (Math.pow(2, 127)-1);
			signedlowNumber = (int) (Math.pow(-2, 127)+1);
			randomNumber = (int) (random.nextDouble()*((highNumber-signedlowNumber)+1)+signedlowNumber); 
			break;
		case "INT64":
			highNumber = (Math.pow(2, 63)-1);
			signedlowNumber = (int) (Math.pow(-2, 63)+1);
			randomNumber = (int) (random.nextDouble()*((highNumber-signedlowNumber)+1)+signedlowNumber);
			break;
		case "INT32":
			highNumber = (Math.pow(2, 32)-1);
			signedlowNumber = (int) (Math.pow(-2, 32)+1);
			randomNumber = (int) (random.nextDouble()*((highNumber-signedlowNumber)+1)+signedlowNumber);
			break;
		case "UINT":
		case "UINT256":
			highNumber = (Math.pow(2, 255)-1);
			randomNumber = random.nextInt((int)highNumber - UnsignedlowNumber + 1);
			break;
		case "UINT128":
			highNumber = (Math.pow(2, 127)-1);
			randomNumber = random.nextInt((int)highNumber - UnsignedlowNumber + 1);
			break;
		case "UINT64":
			highNumber = (Math.pow(2, 63)-1);
			randomNumber = random.nextInt((int)highNumber - UnsignedlowNumber + 1);
			break;
		case "UINT32":
			highNumber = (Math.pow(2, 31)-1);
			randomNumber = random.nextInt((int)highNumber - UnsignedlowNumber + 1);
			break;
				
		}
		return Integer.toString(randomNumber);
		
	}

}
