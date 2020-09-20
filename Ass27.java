import java.util.Scanner;
class Ass27{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n =sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter element");
			arr[i]=sc.nextInt();
		}
		int max=-9999;
		int min=9999;
		for(int ar:arr)
		{
			if(max < ar)
			{
				max=ar;	
			}
			if(min > ar)
			{
				min=ar;
			}
		}
		System.out.println("max value= "+max);
		System.out.println("min value= "+min);
	}
}