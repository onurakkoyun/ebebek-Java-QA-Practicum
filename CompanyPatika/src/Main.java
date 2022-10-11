
public class Main {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Onur", 2000, 45, 2000);
		System.out.println("Name : "+ employee1.getName() + "\nSalary before tax: " + employee1.getSalary() + "\nWeekly working hours : " + 
				employee1.getWorkHours() + "\nHire year : " + employee1.getHireYear());
		System.out.println(employee1);

	}

}
