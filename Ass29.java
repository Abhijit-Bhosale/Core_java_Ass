import java.util.Scanner;
class Ass29{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of row in array");
		int row =sc.nextInt();
		System.out.println("enter no of col in array");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
	
		for(int j=0;j<arr.length;j++)
		{
			for(int k=0;k<col;k++)
			{
				System.out.println("enter element");
				arr[j][k]=sc.nextInt();
			}
		} 
		int count=0;
		System.out.println("No of 1-D array in 2-D array are = "+row);
		for(int ar[]:arr)
		{
			count++;
			System.out.println("no of elements in "+count+" 1-D array are= ");
			for(int a:ar)
			{
				System.out.print(" "+a);
			}
			System.out.println("");
		}
	
	}
}