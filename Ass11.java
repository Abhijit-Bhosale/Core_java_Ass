import java.util.Scanner;
class Swap{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 number num1 & num2");
	int num1= sc.nextInt();
	int num2= sc.nextInt();
	num1=&num2;
	num2=&num1;
	System.out.println("num1= "+num1+"num2= "+num2);
	}
} 