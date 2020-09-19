import java.util.Scanner;
class exp2{
	public static void main( String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value for x in exp");
		int x = sc.nextInt();
		int y= x*x + 3*x - 7;
		System.out.println("y= "+y);
		 y = x++ + ++x ;
		System.out.println("y = "+y+" x= "+x);
		int z = x++ - --y + x++ ;
		System.out.println("x= "+x+" y= "+y+" z="+z);
	}
}