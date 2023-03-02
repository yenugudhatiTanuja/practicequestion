package com.paper4;
class Employee
{
	String name;
	int id;
	public Employee(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
}
public class Manager extends Employee {
	//constructor is not given in actual question so output of this question is compile time error
	Manager()
	{
		super("tanuja",10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Manager mgr=new Manager();
	}

}
