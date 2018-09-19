package abstractFactoryPattern;

public class AbstractTestMain {

	
	public static void main(String[] args) {
		
		AbstractFactory teamFactory = FactoryMain.getFactory("Team");
		Team aTeam = teamFactory.getTeam("Ateam");
		aTeam.getTeamName();
		

	}
}
