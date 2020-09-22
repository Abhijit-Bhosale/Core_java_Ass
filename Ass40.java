import java.util.Scanner;
class Student{
	public String name;
	public int rollNo;
	public int age;
	public int score;
	Student()
	{

	}
	Student(String name,int rollNo,int age,int score)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.age=age;
		this.score=score;
	}

	public int getScore()
	{
		return score;
	}
	void show()
	{
		System.out.println(name+" "+rollNo+" "+age+" "+score);
	}
}
class StudentDemo{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Student arr[]=new Student[10];
	
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter student name,rollNo,age &score");
			String name=sc.next();
			int rollNo=sc.nextInt();
			int age=sc.nextInt();
			int score=sc.nextInt();
			Student S=new Student(name,rollNo,age,score);
			arr[i]=S;
		}
			
		
		System.out.println("Student score between 0-50");
		for(Student a:arr)
		{
			if(a.getScore()>0 && a.getScore()<50)
			{
				a.show();
			}
		}
		
		System.out.println("Student score between 50-65");
		for(Student a:arr)
		{
			if(a.getScore()>50 && a.getScore()<65)
			{
				a.show();
			}
		}

		System.out.println("Student score between 65-80");
		for(Student a:arr)
		{
			if(a.getScore()>65 && a.getScore()<80)
			{
				a.show();
			}
		}
		System.out.println("Student score between 80-100");
		for(Student a:arr)
		{
			if(a.getScore()>80 && a.getScore()<100)
			{
				a.show();
			}
		}
	}
}