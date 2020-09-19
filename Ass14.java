import java.util.Scanner;

class LeapYr{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int yr = sc.nextInt();
		if(yr%4==0)
		{
			if(yr%100==0)
			{
				if(yr%400==0)
				{
				System.out.println(" leap Yr");
				}
				else
				{
				System.out.println("Non leap Yr");
				}
			}
			else
			{
			System.out.println(" leap Yr");
			}
		}
		else
		{
		System.out.println("Non leap Yr");
		}
	}

}