class Employee{

	static public int empNo=0;
	public float salary;
	static public float totSalary=0.0F;
	
	Employee(float salary)
	{
		empNo++;
		this.salary=salary;
		totSalary+=salary;
	}
	void display()
	{
		System.out.println("total Employee = "+empNo+" total Salary= "+totSalary);
	}
}
class EmployeeDemo{
	public static void main(String args[])
	{
		Employee e=new Employee(1000.50F);
		Employee f=new Employee(1000.50F);
		Employee g=new Employee(1000.50F);
		Employee h=new Employee(1000.50F);
		h.display();
	}

}