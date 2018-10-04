package NullObjectPattern;

public class EmployeeFactory {

	public static String[] DBNamesList = {"Onur", "F�rat", "Tolga"};
	
	public static Employee getEmployee(String name) {
		
		for (String dbName : DBNamesList) {
			if(dbName.equalsIgnoreCase(name)) {
						return new NotNullEmployee(name);
			}
		}
		return new NullEmployee();
	}
}
