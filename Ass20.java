import java.util.Scanner;
class Ass20{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		for(int i=num1;i<=num2;i++ )
		{
			outer:
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					
					break outer;

				}
				if(j==i/2)
				{
					System.out.println(i);
				}
			}
		}
	}
}