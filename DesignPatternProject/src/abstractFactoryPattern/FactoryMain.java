package abstractFactoryPattern;

public class FactoryMain {

	public static AbstractFactory getFactory(String type) {
		
		if(type.equals("Team")) {
			return new TeamFactory();
		}else if (type.equals("Color")) {
			return new ColorFactory();
		}
		return null;
	}
	
}
