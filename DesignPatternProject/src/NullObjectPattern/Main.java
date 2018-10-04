package NullObjectPattern;

public class Main {

	public static void main(String[] args) {
		Employee employee = EmployeeFactory.getEmployee("Onur");
		Employee employee2 = EmployeeFactory.getEmployee("Tolga");
		Employee employee3 = EmployeeFactory.getEmployee("xxx");
		
		
		System.out.println(employee.getName());
		System.out.println(employee2.getName());
		System.out.println(employee3.getName());
	}
}
