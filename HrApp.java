package HrApp;

public class HrApp {
	public static void main(String[] args) {
		System.out.println("Hrapp start");
		Employee e=new Employee(10,"Jeo",10000);
		Employee e1=new Employee(11,"King ",5000);
		//System.out.println("Emp"+e);
		//System.out.println("Emp"+e1);
		Department def=new Department("Employee");
		def.addEmp(e);
		def.addEmp(e1);
		def.addEmp(new Employee(12,"kaushik",2500));
		Employee[] emps=def.getEmployee();
		for(Employee emp:emps) {
			System.out.println("Emp "+emp);
			//System.out.println("Emp"+e1);
		}
		System.out.println("total Sal"+def.getTotalSalary());
		System.out.println("Avg Sal"+def.getAveargeSalary());
		System.out.println("Id name "+def.getEmployeeById(15));
	}

}
