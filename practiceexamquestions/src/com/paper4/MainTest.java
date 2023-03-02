package com.paper4;
class SuperClass
{
	int b=10;
	void display()
	{
		System.out.println("super");
	}
}
class SubClass extends SuperClass
{
	int b=20;
	void display()
	{
		//super.display();
		System.out.println("sub");
	}
}
public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass obj=new SubClass();
		System.out.println(obj.b);
		obj.display();

		//the above case output is 10 as per actual Question
		
		SubClass obj1=new SubClass();
		System.out.println(obj1.b);
		//obj1.display();
		//the above case output is 20

	}

}
