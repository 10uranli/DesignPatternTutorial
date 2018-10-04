package BuilderPattern;

public abstract class Person1 implements Ability {

	@Override
	public ProgrammingLang language() {
		return new Java();
	}

	  @Override
	  public abstract Integer salary();
}
