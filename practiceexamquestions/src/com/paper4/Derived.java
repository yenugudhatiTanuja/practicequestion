package com.paper4;
class Base
{
	Base(int var)
	{
		System.out.println("Base");
	}
}
public class Derived extends Base {
//This constructor is not in actual question
	Derived(int var) {
		super(var);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Derived obj=new Derived(5);//In actual question they do not pass any argument.
	}

}

/*output:-
 * Generates Compile time error*/
