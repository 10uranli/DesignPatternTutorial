package singleton.v1;

public class Singleton {

	private static Singleton singletonInstance = new Singleton();
	
	private Singleton() {
		// d��ar�dan obje olu�turmas�n� engellemek i�in
	}
	public static Singleton getInstance() {
		return singletonInstance;
	}
	
	public void getClassInfo(){
		
		System.out.println("Class Info : " + Singleton.class);
	
	}
}
