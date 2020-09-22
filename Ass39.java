import java.util.Scanner;
class Product{
	public int pid;
	public float price;
	public int quantity;
	
	Product()
	{

	}

	Product(int pid,float price,int quantity)
	{
	 this.pid=pid;
	 this.price=price;
	 this.quantity=quantity;	
	}

	static void calculate(Product [] arr)
	{
		float res=0;
		for(Product a:arr)
		{
			res=res+(float)(a.price*a.quantity);
		}
		System.out.println("Total Amount Spent: "+res);
	}
	void show()
	{
		System.out.println(pid+" "+price+" "+quantity);
	}
}

class ProductDemo{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		/*Product P1=new Product();
		Product P2=new Product();
		Product P3=new Product();
		Product P4=new Product();
		Product P5=new Product();
		Product arr[]={P1,P2,P3,P4,P5};*/

		Product arr[]=new Product[5];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter ID,Price & Quantity");
			int id=sc.nextInt();
			float price=sc.nextFloat();
			int quantity=sc.nextInt();
			Product P=new Product(id,price,quantity);
			arr[i]=P;		
		}

		float max=arr[0].price;
		Product P=new Product();
		for(Product a:arr)
		{
			a.show();
			if(a.price>max)
			{
				max=a.price;
				P=a;
			}
		}
		System.out.println("Max Product element: "+P.pid+" "+P.price+" "+P.quantity);	
		Product.calculate(arr);	
	}

}
















