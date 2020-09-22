import java.util.Scanner;
class MathOpe{
	//private int num1;
	//private int num2;
	static int add(int num1,int num2)
	{
		//this.num1=num1;
		//this.num2=num2;
		int sum=num1+num2;
		return sum;
	}
	static int substract(int num1,int num2)
	{
		//this.num1=num1;
		//this.num2=num2;
		int sub=num1-num2;
		return sub;
	}
	static int multiply(int num1,int num2)
	{
		//this.num1=num1;
		//this.num2=num2;
		int mul=num1*num2;
		return mul;
	}
	static int power(int num1,int num2)
	{
		int pow=num2;
		for(;num2!=1;--num2)
		{
		num1 *=pow;
		}
		return num1;
	}
}

class Demo{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers for add,substract,multification & power operations");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int add=MathOpe.add(num1,num2);
		System.out.println("Addition = "+add);	
		int sub=MathOpe.substract(num1,num2);
		System.out.println("Substraction = "+sub);
		int mul=MathOpe.multiply(num1,num2);
		System.out.println("multiply = "+mul);
		int pow=MathOpe.power(num1,num2);
		System.out.println("power = "+pow);
	}
}


