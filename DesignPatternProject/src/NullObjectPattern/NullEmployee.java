package NullObjectPattern;

public class NullEmployee extends Employee{

	@Override
	public String getName() {
		return "Null Employee!!Check Out DB!!";
	}
	
	@Override
	public boolean isNil() {
		return true;
	}

}
