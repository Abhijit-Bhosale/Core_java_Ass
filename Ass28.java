import java.util.Scanner;
class Ass28{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of string");
		int N=sc.nextInt();
		String str[]=new String[N];
		for(int i=0;i<str.length;i++)
		{
			System.out.println("enter string");
			str[i]=sc.nextLine();
		}
		for(String s:str)
		{
			System.out.println(s);
		}
	}
}