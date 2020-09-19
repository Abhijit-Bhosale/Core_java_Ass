import java.util.Scanner;
class Ass23{
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
		for(int j=arr.length-1; j>=0;j--)
		{
			System.out.println(arr[j]);
		}
		
	}
}