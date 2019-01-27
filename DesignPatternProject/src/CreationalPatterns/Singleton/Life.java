package CreationalPatterns.Singleton;

import java.util.Random;

public class Life {
	
	private static Life ourLife;
	private static int age = new Random().nextInt(10);
	
	private Life() {
		// Dýþarýdan eriþim olmamalý
	}

	public static Life getOurLife() {
		if(ourLife == null){
			 ourLife = new Life();			
		}
		return ourLife;
	}
	
	public void getAge() {
		System.out.println("My age is " + age);
	}
}
