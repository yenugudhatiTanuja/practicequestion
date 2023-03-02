package com.paper4;
//An abstract class may or may not contain abstract methods.
abstract class Shape//class Shape(actual question)
{
	Shape()
	{
		
	}
	//declare abstract method within the abstract class only.
	abstract double calArea();//not given in actual question
}
public class Triangle extends Shape {
	int base,height;
	public Triangle(int base,int height)
	{
		this.base=base;
		this.height=height;
	}
	public double calArea()
	{
		return 0.5*base*height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape ref=new Triangle(3,4);
		System.out.println(ref.calArea());

	}

}
/* output is---->we have declare abstract double calArea() in shape class and aslo class should be abstract type*/