package BuilderPattern;

public abstract class Person2 implements Ability {

	@Override
	public ProgrammingLang language() {
		return new DotNet();
	}
	
	  @Override
	  public abstract Integer salary();
}
