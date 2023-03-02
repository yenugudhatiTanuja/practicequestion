package com.paper4;

import java.text.DecimalFormat;

 public class Test {
     /*static void methodA(short s)
     {
    	 System.out.println("methodA of short called");
     }
     static void methodA(int i)
     {
    	 System.out.println("methodA of int called");
     }
     static void methodB(float s)
     {
    	 System.out.println("methodB of float called");
     }
     static void methodB(double s)
     {
    	 System.out.println("methodB of double called");
     }*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // methodA(5);
     //methodB(5.2);
		 double a = 0;
	DecimalFormat moneyFormat = new DecimalFormat("###,##0.00");
	System.out.println(moneyFormat.format(a));	}

}
/* output----->
methodA of int called
MethodB of double called*/
