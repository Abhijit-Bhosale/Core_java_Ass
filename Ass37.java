class Person{
	public String name;
	public int age=18;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void Display()
	{
		System.out.println("name= "+name+" age="+age);
	}

}
class PersonDemo{
	public static void main(String args[])
	{
	Person P=new Person("abhi",20);
	P.Display();
	}
}