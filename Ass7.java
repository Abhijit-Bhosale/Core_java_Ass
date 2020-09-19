import java.util.Scanner;
class percent{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int sum =0;
	int sub;
	System.out.println("enter 5 subject marks out of 100");
	for(int i=0;i<5;i++)
	{
	System.out.println("enter marks");
	sub= sc.nextInt();
	sum=sum+sub;
	}
	double per=sum/5;
	System.out.println("Percentage Marks= "+per+"%");
	}			

}