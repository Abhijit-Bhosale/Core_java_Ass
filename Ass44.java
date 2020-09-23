import java.util.Scanner;
class Faculty{
	Scanner sc=new Scanner(System.in);
	private int fid;
	public float salary;
	void Input()
	{
		System.out.println("enter faculty ID");
		fid=sc.nextInt();	
	}
	void PrintSalary()
	{
		System.out.println("Salary ="+salary);
	}

}
class FullTimeFaculty extends Faculty{
	private float b_salary;
	private float allowance;
	void Input()
	{
		super.Input();
		System.out.println("Enter FullTimeFaculty basic salary & allowance");
		b_salary=sc.nextFloat();
		allowance=sc.nextFloat();
	}
	void init(){
	 salary=(float)(b_salary + allowance);
	}
	void PrintSalary()
	{
		super.PrintSalary();
	}
	
}

class PartTimeFaculty extends Faculty{
	private int work_hour;
	private float ratePerHr;
	void Input()
	{
		super.Input();
		System.out.println("enter working hours and rate per hours");
		work_hour=sc.nextInt();
		ratePerHr=sc.nextFloat();
	}
	void init(){
	super.salary=(float)(work_hour*ratePerHr);
	}
	void PrintSalary()
	{
		super.PrintSalary();
	}
}
class Demo44{
	public static void main(String args[])
	{
		FullTimeFaculty F=new FullTimeFaculty();
		F.Input();
		F.init();
		F.PrintSalary();
		PartTimeFaculty P=new PartTimeFaculty();
		P.Input();
		P.init();
		P.PrintSalary();
	}
}