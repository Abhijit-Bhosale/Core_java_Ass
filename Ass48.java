import java.util.Scanner;
abstract class Processor{
	int data;
	void showData()
	{
		System.out.println("Data= "+data);
	} 
	abstract void Process();	
}
class Factorial extends Processor{
	void Process()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number whose factorial you want");
		int f=sc.nextInt();
		int j=1;
		 for(int i=1;i<=f;i++)
		{
			j=j*i;
		}
		data=j;
	}

}
class Circle extends Processor{

	void Process()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius of circle");
		int r=sc.nextInt();
		final float PI=3.14F;
		float area=(float)(PI*r*r);
		data=(int)area;
	}

}

class Demo{
	public static void main(String args[])
	{
		System.out.println("enter choice 1 for factorial and any number for circle");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		if(ch==1)
		{
			Processor P=new Factorial();
			P.Process();
			P.showData();
			
		}
		else
		{
			Processor P1=new Circle();
			P1.Process();
			P1.showData();
		}
	}

}