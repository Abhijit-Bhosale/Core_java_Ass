import java.util.Scanner;
class Student{
	private int rollNo;
	private String nam;
	static int count=0;
	void setData(int roll,String nav)
	{
		rollNo=roll;
		nam=nav;
	}
	void showData()
	{
		System.out.println("Roll no = "+rollNo+" Name = "+nam);
	}
	Student()
	{
		count++;
	}
	
}

class StudentDemo{
	public static void main(String args[])
	{
		Student S=new Student();
		int count;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll no");
		int roll=sc.nextInt();
		System.out.println("enter name of student");
		String nav=sc.next();
		S.setData(roll,nav);
		S.showData();
		count=S.count;
		System.out.println("No of object created = "+count);
	}

}
