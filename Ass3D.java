import java.util.Scanner;
class expD{
	static public void main(String args[])
	{
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter boolean value for x and y");
	 boolean x= sc. nextBoolean();
	 boolean y= sc. nextBoolean();
	 boolean z= x && y || !(x || y);
	 System.out.println("z= "+z);
	}

}