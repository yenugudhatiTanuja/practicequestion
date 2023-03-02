package com.paper4;
class SuperClass1
{
	int b=10;
	//in actual question the declare SuperClass1 constructor as private
	SuperClass1()
	{
		this.b=7;
	}
	int f()
	{
		return b;
	}
}
class SubClass1 extends SuperClass1
{
  int b;	
}
public class MainTestExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass1 a= new SubClass1();
		System.out.println(a.f());
	}

}

// As per the actual question Answwr is "Compilation fails"