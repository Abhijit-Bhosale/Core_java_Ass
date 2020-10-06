package oct6;
import java.util.Scanner;
class voter{
	int id;
	String name;
	int age;
	voter(int id,String name,int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("invalid");
		}
		else
		{
			this.id=id;
			this.name=name;
			this.age=age;
			System.out.println("Welcome to vote");
		}	
	}
	
}
public class Q59 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter voter id ,name ,age");
	int id=sc.nextInt();
	String name=sc.next();
	int age=sc.nextInt();
	voter v=new voter(id,name,age);

	}

}
