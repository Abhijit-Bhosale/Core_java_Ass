import java.util.Scanner;
class Ass21{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int arr[]=new int[10];
		int sum=0;
		float avg;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter element");
			arr[i]=sc.nextInt();
		}
		for(int a:arr)
		{
			sum=sum+a;
		}
		avg=(float)sum/10;
		System.out.println("sum= "+sum);
		System.out.println("avg= "+avg);
	}
}