import java.util.Scanner;
class Ass26{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of element");
		int N = sc.nextInt();
		System.out.println("enter size of row");
		int row=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter elem");
			arr[i]=sc.nextInt();
		}
		int count=-1;
		for(int ar:arr)
		{
			count++;
			if(count==row*1 || count==row*2 || count==row*3)
			{
				System.out.println("");		
			}
			System.out.print(" "+ar);
		}
	}
} 