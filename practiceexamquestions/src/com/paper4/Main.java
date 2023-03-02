package com.paper4;
class A
{
	final void m1()
	{
		System.out.println("m1 called");
	}
}
class B extends A
{
	public void m2()
	{
		m1();
		System.out.println("m2 called");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      B b=new B();
      b.m1();
      b.m2();
	}

}

/*output:-
m1 called
m1 called
m2 called*/

/*------------------------------------------
the concept of multiple inheritance is implemented in java by:
1.extending two or more classes
2.extending one class and implementing one or more interfaces.
3.implementing two or more inrterfaces

 Output:-
option 2 and 3. 
------------------------------------------*/