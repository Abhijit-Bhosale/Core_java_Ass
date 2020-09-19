import java.util.Scanner;
class Ass25{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int N=sc.nextInt();
		int s_even=0;
		int s_odd=0;
		int arr[]=new int[N];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter element");
			arr[i]=sc.nextInt();
		}
		for( int a:arr)
		{
			if(a%2==0)
			{
				s_even=s_even+a;
			}
			else
			{
				s_odd=s_odd+a;
			}
		}
		
		System.out.println("sum of Even Number = "+s_even);
		System.out.println("sum of Even Number = "+s_odd);
	}
}