package sep27;

public class Q54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Abhijit Bhosale";
		char ch[]=s.toCharArray();
		System.out.println(ch.length);
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}

}
