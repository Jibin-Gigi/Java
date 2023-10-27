****************************************************************************************************************************************************************************************************************
 * File                                                      : abstractClass.java
 * Description                                               : Java program to create an abstract class named Shape that contains an empty method named numberOfSides( ).
	 						       Provide three classes named Rectangle, Triangle and Hexagon such that each one of the classes extends
	                                                       the class Shape. Each one of the classes contains only the method numberOfSides( ) 
	                                                       that shows the number of sides in the given geometrical structures. 

 * Author                                                    : Jibin Gigi
 * Version                                                   : 1.0
 * Date                                                      : 27/10/23
 * *************************************************************************************************************************************************************************************************************/

public class abstractClass {
	public static void main(String [] args) {
	Rectangle rectangle=new Rectangle();
	rectangle.numberOfSides();
	Triangle triangle=new Triangle();
	triangle.numberOfSides();
	Hexagon hexagon=new Hexagon();
	hexagon.numberOfSides();
	
	
	}
}
abstract class Shapes{
	int sides;	
	abstract void numberOfSides() ;
		
	
}

class Rectangle extends Shapes{
	void numberOfSides(){
		System.out.println("No. of sides of Rectangle:4");
		
	}
}

class Triangle extends Shapes {
	void numberOfSides(){
	  System.out.println("Enter the no. of sides of Triangle:3 ");
}
}	
	

class Hexagon extends Shapes{
	void numberOfSides(){
		   System.out.println("Enter the no. of sides of Hexagon: 6");

}
}
