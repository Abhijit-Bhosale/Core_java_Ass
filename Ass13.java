import java.util.Scanner;
class Greatest{
	static public void main(String args[])
	{
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter 3 numbers");
	int num1=sc.nextInt();
	 int num2=sc.nextInt();
	 int num3=sc.nextInt();
	 if((num1 > num2) && ( num1 > num3))
	 {
		System.out.println("greater number= "+ num1);
	 }
	else if((num2 > num1) && (num2 > num3))
	 {
		System.out.println("greater number= "+num2);
	 }
	 else
	 {
		System.out.println(num3+" is greater number");
	 } 


	
	}

}