package NullObjectPattern;

public class NotNullEmployee extends Employee {

	public NotNullEmployee(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public boolean isNil() {
		return false;
	}

}
