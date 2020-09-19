import java.util.Scanner;

class Marriage{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a gender(m/f)");
		char gen= sc.next().charAt(0);
		System.out.println("Enter a age");
		int age =sc.nextInt();
		System.out.println(gen);
		if(gen=='m')
		{
			if(age>21)
			{
			System.out.println("Eligible");
			}
			else
			{
			System.out.println(" Not Eligible");
			}
		}
		else
		{
			if(age>18)
			{
			System.out.println("Eligible");
			}
			else
			{
			System.out.println(" Not Eligible");
			}
		}
	}

}