import java.util.Scanner;
class Ass30{
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
		int sum=0;
		int m=0;
		
		for(int ar[]:arr)
		{
			int n=0;
			
			for(int a:ar)
			{
				
				if(m==n)
				{
					sum=sum+a;
					
				}
				
				n++;		
			}
			m++;
		}
		System.out.println("Sum of diagonal elements are = "+sum);
	}
}