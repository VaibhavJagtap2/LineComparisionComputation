package com.linecomparision;
import java.util.Scanner;

public class LineComparision {

	double x1,x2,y1,y2;
	double length;
	double length1, length2;
	public void values() {
		System.out.println("Enter values of points");
		
		Scanner point = new Scanner(System.in);
		x1=point.nextDouble();
		x2=point.nextDouble();
		y1=point.nextDouble();
		y2=point.nextDouble();
		System.out.println("Points are: ("+x1+","+x2+")"+"("+y1+","+y2+")");
	}
	
	public double calculation(){
		Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );
		return length;
	}
}
