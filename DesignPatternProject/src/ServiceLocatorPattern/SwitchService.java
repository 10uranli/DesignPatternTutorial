package ServiceLocatorPattern;

public class SwitchService implements IService{

	
	@Override
	public String getName() {
		return SwitchService.class.getName();
	}

	@Override
	public void Exec() {
		System.out.println("Switch Service Executing..");
	}
	
}
