import java.util.Scanner;
class Ass19{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum=12;
		int sum1=12;
		for(int i=2;i<=num;i++)
		{
		 sum=sum+10;
		 sum1=sum1+sum;	
		}
		System.out.println("Sum of series= "+sum1);
	}
}