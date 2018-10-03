package singleton.v1;

public class Singleton {

	private static Singleton singletonInstance = new Singleton();
	
	private Singleton() {
		// dýþarýdan obje oluþturmasýný engellemek için
	}
	public static Singleton getInstance() {
		return singletonInstance;
	}
	
	public void getClassInfo(){
		
		System.out.println("Class Info : " + Singleton.class);
	
	}
}
