package inheritance;

public class Main {
	public static void main(String[] args) {
		EmployeeManager employeeManager = new EmployeeManager();
		
		employeeManager.listCustomers();
		employeeManager.addCustomer();
		employeeManager.bestEmployee();
		
		Employee employee = new Employee();
		
		System.out.println(employee.age); //Override instance.
	}
}
