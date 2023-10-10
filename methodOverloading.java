/****************************************************************************************************************************************************************************************************************
 * File                                                      : methodOverloading .java
 * Description                                               : Java program to calculate the area of different shapes namely circle, rectangle, and triangle using the concept of method overloading
 * Author                                                    : Jibin Gigi
 * Version                                                   : 1.0
 * Date                                                      : 10/10/23
 * *************************************************************************************************************************************************************************************************************/

import java.util.Scanner;
public class methodOverloading {
		public static void main(String [] args) {
		Scanner value=new Scanner(System.in);
		Shape sc=new Shape();
		System.out.println("Enter the base of Triangle: ");
		float base=value.nextFloat();
		System.out.println("Enter the height of Triangle: ");
		float height=value.nextFloat();
		sc.area(base,height);
		
		System.out.println("Enter the length of Rectangle: ");
		int length=value.nextInt();
		System.out.println("Enter the breadth of Rectangle: ");
		int breadth=value.nextInt();
		sc.area(length,breadth);
		
		System.out.println("Enter the radius of Circle: ");
		float radius=value.nextFloat();
		sc.area(radius);
		
		value.close();
		}
}
class Shape{
	public  void area(float base,float height) {
		System.out.println("Area of Triangle= "+(base*height)/2);
		
	}
	public  void area(int length,int breadth) {
		System.out.println("Area of Rectangle= "+length*breadth);
		
	}
	public void area(float radius) {
		System.out.println("Area of Circle= "+3.14*radius*radius);
		
	}
	
}
		

