package sep27;
class Emp{
	int empId;
	String name;
	double salary;
	
	Emp(){
		
	}
	int getempId() {
		return empId;
	}
	
	public Emp(int empId,String name,double salary) {
		super();
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public boolean equals(Object a) {
		Emp e=(Emp) a;
		return empId == e.empId;
	}
	
	
}
public class Q50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e[]= { new Emp(20,"abhi",20000),new Emp(10,"abhiji",25000),new Emp(10,"abhijit",40000),new Emp(20,"abhiji",25000)};
	    for(int i=1;i<e.length;i++)
	    {
	    	if(e[0].equals(e[i]))
	    	{
	    		System.out.println("Id is already there "+i);
	    	}
	    }
	    	for(Emp i:e) 
	    	{
	    		System.out.println(i);
	    	}
	    
	}

}
