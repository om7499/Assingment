package Inheritance_Task;

class Employee{
	private String name;
	private int empId;
	private int salary;
	public Employee(String name,int empId,int salary) {
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}
	void displayDitaile() {
		System.out.println("Name : "+name+" "+"EmpId : "+empId+" "+"Salary : "+salary);
	}
	
}

class Manager extends Employee{
	private String department;
	public Manager(String name,int empId,int salary,String department) {
		super(name, empId, salary);
		this.department = department;
	}
	void managTeam() {
		super.displayDitaile();
		System.out.println("managing the Team "+department);
	}
}

class Devloper extends Employee{
	private String progLang;
	public Devloper(String name,int empId,int salary,String progLang) {
		super(name,empId,salary);
		this.progLang = progLang ;
	}
	void writeCode() {
	     super.displayDitaile();
		System.out.println("Write code in "+progLang);
	}
}

public class _03_Main {
	public static void main(String[] args) {
		Devloper dev = new Devloper("om",101,10000,"python");
		dev.writeCode();
		Manager man = new Manager("jay",102,40000,"maintance");
		man.managTeam() ;
	}
}

/* output :
	Name : om EmpId : 101 Salary : 10000
	Write code in python
	Name : jay EmpId : 102 Salary : 40000
	managing the Team maintance
*/

