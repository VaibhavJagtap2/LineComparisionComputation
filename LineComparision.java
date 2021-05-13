package com.linecomparision;
import java.util.Scanner;

public class LineComparision {
  public static void main(String[] args) {
    values();
    System.out.println("calculation="+calculation());
 }  
	static double x1,x2,y1,y2;
	static double length;
	static double length1, length2;
	static public void values() {
		
		System.out.println("Enter values of points");
		
		Scanner point = new Scanner(System.in);
		x1=point.nextDouble();
		x2=point.nextDouble();
		y1=point.nextDouble();
		y2=point.nextDouble();
		System.out.println("Points are: ("+x1+","+x2+")"+"("+y1+","+y2+")");
	}

	static public double calculation(){
		
		length=Math.sqrt(Math.pow(x2 - x1, 2)+Math.pow(y2 - y1, 2)*1.0 );
		return length;
	}
 }
