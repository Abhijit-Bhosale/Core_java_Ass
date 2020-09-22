import java.util.Scanner;
class OneBHK{
	private int roomArea;
	private int hallArea;
	private int price;

	OneBHK()
	{
		roomArea=1000;
		hallArea=1500;
		price=15000;
	}
	OneBHK(int roomArea,int hallArea,int price)
	{
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;
	}
	void show()
	{
		System.out.print("roomArea = "+roomArea+" hallArea= "+hallArea+" price= "+price);
	}

}
class TwoBHK extends OneBHK{
	private int room2Area;
	TwoBHK()
	{
		room2Area=1200;
	}
	TwoBHK(int room2Area,int roomArea,int hallArea,int price)
	{
		this.room2Area=room2Area;
	}
	void show()
	{
		super.show();
		System.out.print(" room2Area= "+room2Area);
	}
}

class AreaDemo{
	public static void main(String args[])
	{
		TwoBHK T=new TwoBHK();
		T.show();
	}
}