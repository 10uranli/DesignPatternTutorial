package ServiceLocatorPattern;

public class ProposalService implements IService {

	@Override
	public String getName() {
		return ProposalService.class.getName();
	}

	@Override
	public void Exec() {
		System.out.println("Proposal Service Executing..");
	}

}
