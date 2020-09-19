import java.util.Scanner;
class Yr{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter no of days");
	int day = sc.nextInt();
	int yr ;
	int months;
	int days;
	if(day%365 !=0)
	{
	 yr = day/365;
	 System.out.println("year= "+yr);
	days=day%365;
	 if(days !=0)
		{
		  months = days/30;
		  System.out.println("Months = "+months);
		 	 if((days % 30) !=0)
				{
				 int d=days % 30;
				 System.out.println("days= "+d);
				}
		}
	 else
		{
		 months = days /30;
		 System.out.println("Months = "+months);
		}
	}
	else
	{
	 yr = day/365;
	 System.out.println("year= "+yr);
	}
  }			

}