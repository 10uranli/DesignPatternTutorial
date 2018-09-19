package abstractFactoryPattern;

public class ColorFactory extends AbstractFactory{

	@Override
	Color getColor(String color) {
		if(color == null) {
			return null;
		}
		
		if(color.equals("Acolor")) {
			return new Acolor();
		}else if (color.equals("Bcolor")) {
			return new Bcolor();
		}
		return null;
	}

	@Override
	Team getTeam(String team) {
		return null;
	}

}
