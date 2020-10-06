package oct6;
import java.util.Scanner;
interface StudentFee{
	void getFee();
}
class Student implements StudentFee{

	@Override
	public void getFee() throws ArithmeticException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student  name and fee");
		String name=sc.next();
		int fee=sc.nextInt();
		if(fee<0 )
		{
			throw new ArithmeticException("invalid fee");
		}
		else
		{
			System.out.println(name+" "+fee);
		}
		
	}
	
	
}

public class Q60 {

	public static void main(String[] args) {
		
		try {
			Student s=new Student();
		s.getFee();
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
