package singleton.v1;

public class MainClass {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		instance.getClassInfo();
	}
}
