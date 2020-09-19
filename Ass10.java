import java.util.Scanner;
class Tempp{
	public static void main(String args[])
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter temperature in Ferenheit");
	 float f=sc.nextFloat();
	 float C=(5*(f-32)/9);
	 System.out.println("In deg Celsius= "+C);
	}
}