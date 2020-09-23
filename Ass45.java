import java.util.Scanner;
class Student{
	int rollNo;
	float percent;
	Student()
	{
		rollNo=101;
		percent=60.00F;
	}

	Student(int rollNo,float percent)
	{
		this.rollNo=rollNo;
		this.percent=percent;
	}
	void show()
	{
		System.out.println("Roll No= "+rollNo+" Percentage= "+percent);
	}
	float getGrade()
	{
		return percent;
	}

}
class ClgStudent extends Student{

	int semester;
	ClgStudent()
	{
		semester=1;
	}
	ClgStudent(int rollNo,float percent,int semester)
	{
		super(rollNo,percent);
		this.semester=semester;
	}
	void show()
	{
		super.show();
		System.out.println(" semester= "+semester);
	}
}

class SchoolStudent extends Student{
	String className;
	SchoolStudent()
	{
		className="12th";
	}
	SchoolStudent(String className,int rollNo,float percent)
	{
		super(rollNo,percent);
		this.className=className;	
	}
	void show()
	{
		super.show();
		System.out.println(" className= "+className);
	}

}

class Demo{
	public static void main(String args[])
	{
		Student arr[]=new Student[5];
		Scanner sc=new Scanner(System.in);
		//ClgStudet C1=new Student(102,66.50F,3);
		int total=0;
		 int i=0;	
		for(i=0;i<3;i=i+1)
		{
			System.out.println("enter collage student semester,roll No,Percentage");
			int semester=sc.nextInt();
			int rollNo=sc.nextInt();
			float percent=sc.nextFloat();
			ClgStudent C1=new ClgStudent(rollNo,percent,semester);
			arr[i]=C1;
		}
		for(int j=i;j<5;j++)
		{
			System.out.println("enter School student className,roll No,Percentage");
			String className=sc.next();
			int rollNo=sc.nextInt();
			float percent=sc.nextFloat();
			SchoolStudent S1=new SchoolStudent(className,rollNo,percent);
			arr[j]=S1;
		}

		for(Student ss:arr)
		{
			if(ss.getGrade()>75)
			{
				total=total+1;
			}
			
		}

		
		System.out.println("total A gread students are= "+total);
	}
}
	