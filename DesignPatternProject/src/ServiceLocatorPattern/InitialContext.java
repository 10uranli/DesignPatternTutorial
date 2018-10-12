package ServiceLocatorPattern;

public class InitialContext {

	public Object lookup(String jndiName){
		   
	      if(jndiName.equalsIgnoreCase(ProposalService.class.getName())){
	         System.out.println("Looking up and creating a new ProposalService object");
	         return new ProposalService();
	      }
	      else if (jndiName.equalsIgnoreCase(SwitchService.class.getName())){
	         System.out.println("Looking up and creating a new SwitchService object");
	         return new SwitchService();
	      }
	      return null;		
	   }
	
}
