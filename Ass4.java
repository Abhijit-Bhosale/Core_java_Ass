import java.util.Scanner;
class DwCast{
	static public void main(String args[])
	{
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter short type value");
	 short num1 = sc.nextShort();
	 byte  num2 =(byte)num1;
	System.out.println(num2);
	}

}