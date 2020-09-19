import java.util.Scanner;
class Circle{
	static public void main(String args[])
	{
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter radius of circle");
	 double r = sc.nextDouble();
	 double area =(3.14*r*r);
	 double circum= (2*3.14*r);
	 System.out.println("Area= "+area+" circumference= "+circum);
	 
	}

}