package com.geometrylineproblem;

import java.util.Scanner;

public class GeometryLineProblem {
	public static void main(String[] args) {
		
	Scanner n=new Scanner(System.in);
	
	System.out.println("Enter values of point X1");
	int line1X1= n.nextInt();
	System.out.println("Enter values of point Y1");
	int line1Y1=n.nextInt();
	System.out.println("Enter values of point X2");
	int line1X2=n.nextInt();
	System.out.println("Enter values of point Y2");
	int line1Y2=n.nextInt();
	System.out.println("Points of line1 are X="+"("+line1X1+","+line1X2+")"+" Y="+"("+line1Y1+","+line1Y2+")");

	double lengthline1= Math.sqrt((line1X2-line1X1)^2+(line1Y2-line1Y1)^2);
	 System.out.println("length of line1 is "+ lengthline1);
	 
	 System.out.println("Enter values of point X1");
	 int line2X1=n.nextInt();
	 System.out.println("Enter values of point Y1");
	 int line2Y1=n.nextInt();
	 System.out.println("Enter values of point X2");
	 int line2X2=n.nextInt();
	 System.out.println("Enter values of point Y2");
	 int line2Y2=n.nextInt();
	 System.out.println("Points of line2 are X="+"("+line2X1+","+line2X2+")"+" Y="+"("+line2Y1+","+line2Y2+")");

	 double lengthline2=Math.sqrt((line2X2-line2X1)^2+(line2Y2-line2Y1)^2);
	 System.out.println("length of line2 is "+lengthline2);
	 
	 if(lengthline1==lengthline2) {
		 System.out.println("Both lines are Equal");
	 }
	 else {
		 System.out.println("lines are Not Equal");
	 }
	 
	 Integer length1= (int) lengthline1;
	 Integer length2= (int) lengthline2;
	 	int result= length1.compareTo(length2);
	 	System.out.println("result");
	 if (result==0) {
	 	System.out.println("Equals");
	 }	
	 else if (result>0)	{
		 System.out.println("line1 is Greater");
	 }
	 else {
		 System.out.println("line2 is Greater");
	 }
  }
}



