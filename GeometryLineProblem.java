package com.geometrylineproblem;

import java.util.Scanner;

public class GeometryLineProblem {
	public static void main(String[] args) {
		
	Scanner n=new Scanner(System.in);
	
	System.out.println("Enter values of point X1");
	int X1= n.nextInt();
	System.out.println("Enter values of point Y1");
	int Y1=n.nextInt();
	System.out.println("Enter values of point X2");
	int X2=n.nextInt();
	System.out.println("Enter values of point Y2");
	int Y2=n.nextInt();
	System.out.println("Points of line1 are X="+"("+X1+","+X2+")"+" Y="+"("+Y1+","+Y2+")");

	double length= Math.sqrt((X2-X1)^2+(Y2-Y1)^2);
	 System.out.println("Length of is "+ length);
	 
}
}

