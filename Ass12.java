import java.util.Scanner;
class GS{
	public static void main(String args[])
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Basic salary of employee");
	 double sal= sc.nextDouble();
	 double HRA;
	 double DA;
	 double GSal;
	 if(sal< 10000)
	 {
		HRA=(10*sal)/100;
		DA=(90*sal)/100;
		GSal=sal+HRA+DA;
		System.out.println("Gross Salary= "+GSal);					
	 }
	 else
	 {
		HRA=2000;
		DA=(98*sal)/100;
		GSal=sal+HRA+DA;
		System.out.println("Gross Salary= "+GSal);
	 }	
 
	}
}