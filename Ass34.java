import java.util.Scanner;
class Circle{
	private float radius;
	private float area;
	void init(float radius)
	{
		this.radius=radius;
		
	}
	void CalculateArea()
	{
		area=(float)(3.14*radius*radius);
	}
	void Display()
	{
		System.out.println("Area of circle = "+area);
	}

}
class CircleDemo{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius of circle= ");
		float radius=sc.nextFloat();
		Circle c=new Circle();
		c.init(radius);
		c.CalculateArea();
		c.Display();		
	}

}