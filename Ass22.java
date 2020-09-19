import java.util.Scanner;
class Ass22{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int N=sc.nextInt();
		int arr[]=new int[N];
		
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter element");
			arr[i]=sc.nextInt();
		}
		for(int j=0; j<arr.length;j++)
		{
			int max=1;
			for(int k=0;k<arr.length;k++)
			{
				if(max<arr[k])
				{
					max=arr[k];
					index=k;
				}
			}
			System.out.println(max);
			arr[index]=-9999;
		}
		
	}
}