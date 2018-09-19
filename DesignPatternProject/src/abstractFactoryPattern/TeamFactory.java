package abstractFactoryPattern;

public class TeamFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		return null;
	}

	@Override
	Team getTeam(String team) {
		if(team == null) {
			return null;
		}
		
		if(team.equals("Ateam")) {
			return new Ateam();
		}else if (team.equals("Bteam")) {
			return new Bteam();
		}
		return null;
	}

}
