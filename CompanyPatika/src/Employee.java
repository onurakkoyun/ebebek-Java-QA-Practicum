
public class Employee {
	
	public String name;
	public double salary;
	public double workHours;
	public int hireYear;
	
	public Employee(String name, double salary, double workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public void tax() {
		double taxation = 0;
		if (getSalary() >= 1000) {
			taxation = getSalary() * 3 / 100;
			double newSalary = getSalary() - taxation;
			setSalary(newSalary);
			System.out.println("Tax : " + taxation);
		}
		else {
			System.out.println("Tax : " + taxation);
		}
	}
	
	public void bonus() {
		if (getWorkHours() > 40) {
			double bonus = (getWorkHours() - 40) * 30;
			double newSalary = getSalary() + bonus;
			setSalary(newSalary);
			System.out.println("Bonus : " + bonus);
		}
	}
	
	public void raiseSalary() {
		if ((2021 - getHireYear()) < 10) {
			double raise = getSalary() * 5 / 100;
			this.salary = getSalary() + raise;
			setSalary(this.salary);
			System.out.println("Raise salary : "+raise);
		}
		else if ((2021 - getHireYear()) > 9 && (2021 - getHireYear()) < 20) {
			double raise = getSalary() * 10 / 100;
			this.salary = getSalary() + raise;
			setSalary(this.salary);
			System.out.println("Raise salary : "+ raise);
		}
		else if(2021 - getHireYear() > 19){
			double raise = getSalary() * 15 / 100;
			this.salary = getSalary() + raise;
			setSalary(this.salary);
			System.out.println("Raise salary : "+ raise);
		}
	}
	
	@Override
	public String toString() {
		System.out.println("Name : "+ getName() + "\nSalary before tax: " + getSalary() + "\nWeekly working hours : " + 
				getWorkHours() + "\nHire year : " + getHireYear());
		tax();
		bonus();
		raiseSalary();
        return "Net salary : " +getSalary();
    }
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getWorkHours() {
		return workHours;
	}

	public void setWorkHours(double workHours) {
		this.workHours = workHours;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}
	
	

}
