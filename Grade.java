/******************************************************************************************
 * File				:	Grade.java
 * Description      :   Find grade according to marks scored
 * Author           :   Jibin Gigi
 * Version          :   1.0
 * Date             :   26/09/23
***********************************************************************************************/
import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
		float mark;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the mark out of 100: ");
		mark=sc.nextInt();
		if(mark>90)
			System.out.println("Grade: S");
		else if(mark>85)
			System.out.println("Grade: A+");
		else if(mark>80)
			System.out.println("Grade: A");
		else if(mark>75)
			System.out.println("Grade: B+");
		else if(mark>70)
			System.out.println("Grade: B");
		else if(mark>65)
			System.out.println("Grade: C+");
		else if(mark>50)
			System.out.println("Grade: C");
		else if(mark>45)
			System.out.println("Grade: D+");
		else if(mark>40)
			System.out.println("Grade: D");
		else 
			System.out.println("Failed");
		sc.close();
	}
}
