package sep27;
import java.util.Scanner;
public class Q57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s=sc.nextLine();
		String s2="";
		String wr[]=s.split(" ");
		for(int i=0;i<wr.length;i++)
		{
			String revword="";
			for(int j=wr[i].length()-1;j>=0;j--)
			{
				revword+=wr[i].charAt(j);
			}
			s2=s2+revword+" ";
		}
		System.out.println("Reverse each word of string is ="+s2);
	}

}
