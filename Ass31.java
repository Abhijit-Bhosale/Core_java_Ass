import java.util.Scanner;
class Student{
	private int rollNo;
	private String nam;
	void setData(int roll,String nav)
	{
		rollNo=roll;
		nam=nav;
	}
	void showData()
	{
		System.out.println("Roll no = "+rollNo+" Name = "+nam);
	}

}
class StudentDemo{
	public static void main(String args[])
	{
		Student S=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll no");
		int roll=sc.nextInt();
		System.out.println("enter name of student");
		String nav=sc.next();
		S.setData(roll,nav);
		S.showData();
	}

}
