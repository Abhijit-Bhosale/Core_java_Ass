import java.util.Scanner;
class Floor{
		
		public int length;
		public int width;
		public int edgLength;
		Floor(int length,int width)
		{
			this.length=length;
			this.width=width;
		}
		void totalTile(int edgLength)
		{
			this.edgLength=edgLength;
			float tiles=(float)((length*width)/edgLength);	
			System.out.println("No of styles = "+tiles);
		}
	

}
class Tile{
	public int edLength;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length and width of style");
		int length=sc.nextInt();
		int width=sc.nextInt();
		Floor F=new Floor(length,width);
		System.out.println("enter size of tile width and length");
		int L=sc.nextInt();
		int W=sc.nextInt();
		int edgLength=L*W;
		F.totalTile(edgLength);
	}
}