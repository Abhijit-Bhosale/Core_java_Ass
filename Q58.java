package sep27;
import java.util.Scanner;
public class Q58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		System.out.println("Enter number between 0-6 for weekdays .0 for sunday");
		try {
			 int index=sc.nextInt();
			 for(int i=0;i<=index;i++)
			 {
				 if(i==index)
				 {
				 System.out.println("Weekday is="+str[index]);
				 }
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter number between 0-6");
	}
}
}
