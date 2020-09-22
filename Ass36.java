import java.util.Scanner;
class MathOpe{
	void Multiply(int a, int b)
	{
		int mul=a*b;
		System.out.println("Multification ="+mul);
	}

	void Multiply(float a,float b,float c)
	{
		float mul= (float)a*b*c;
		System.out.println("Multification ="+mul);
	}

	void Multiply(int[] arr)
	{
		int mul=1;
		for(int a:arr)
		{
			mul*=a;		
		}
		System.out.println("Multification ="+mul);	
	}
	
	void Multiply(int a,double b)
	{
		double mul =(double)a*b;
		System.out.println("Multification ="+mul);
	}


}

class Demo{
	public static void main(String args[])
	{
	MathOpe M=new MathOpe();
	int arr[]={1,2,3};
	M.Multiply(10,20);
	M.Multiply(10.5F,10.0F,5.5F);
	M.Multiply(arr);
	M.Multiply(10,20.5);
	}
}