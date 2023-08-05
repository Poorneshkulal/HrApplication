package HrApp;

public class Department {
	private String name;
	private Employee[] employee = new Employee[10];
	private int lastAddedEmployeeIndex = -1;

	public Department(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addEmp(Employee anEmployee) {
		if (lastAddedEmployeeIndex < employee.length) {
			lastAddedEmployeeIndex++;
			employee[lastAddedEmployeeIndex] = anEmployee;
		}
	}

	public Employee[] getEmployee() {
		Employee[] actualEmployee = new Employee[lastAddedEmployeeIndex + 1];
		for (int i = 0; i < actualEmployee.length; i++) {
			actualEmployee[i] = employee[i];

		}
		return actualEmployee;

	}

	public int getEmployeeCount() {
		return lastAddedEmployeeIndex + 1;
	}

	public Employee getEmployeeById(int empId) {
		for (Employee emp : employee) {
			if (emp != null) {
				if (emp.getId() == (empId)) {
					return emp;
				}
			}

		}
		return null;

	}

	public double getTotalSalary() {
		double totalSalary = 0.0;
		for (int i = 0; i <= lastAddedEmployeeIndex; i++) {
			totalSalary += employee[i].getSalary();
		}
		return totalSalary;
	}

	public double getAveargeSalary() {
		if (lastAddedEmployeeIndex > -1) {
			return getTotalSalary() / lastAddedEmployeeIndex + 1;

		}
		return 0.0;
	}

	public String toString() {
		return name;
	}

}
