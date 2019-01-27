package CreationalPatterns.Singleton;

public class Death {

	private final static Death death = new Death();//final is important.Once creational
	private Death() {
		// TODO Auto-generated constructor stub
	}
	
	public static Death getDeath() {
		return death;
	}
	
	public static void helloDeath(){
		 System.out.println("The Death is coming..");
	}
	
}
