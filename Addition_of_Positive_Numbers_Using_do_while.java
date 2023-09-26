/****************************************************************************************************************************************************
 * File				:	Addition_of_positive_numbers.java
 * Description      :   Adding positive numbers and when a negative number is prompted,Programs shows sum of positive numbers using do while
 * Author           :   Jibin Gigi
 * Version          :   1.0
 * Date             :   26/09/23
***************************************************************************************************************************************************/
import java.util.Scanner;

public class Addition_of_Positive_Numbers_Using_do_while {
	public static void main(String[] args) {
		int Positive_number,sum=0;
		Scanner sc= new Scanner(System.in);
		do{
			
			System.out.println("Enter the number");
			Positive_number=sc.nextInt();
			if(Positive_number>0)
	             sum=sum+Positive_number;
		}while(Positive_number>0);
		System.out.println("Sum = "+sum);
		sc.close();
	}
	
}
