/****************************************************************************************************************************************************
 * File				:	Addition_of_positive_numbers.java
 * Description      :   Adding positive numbers and when a negative number is prompted,Programs shows sum of positive numbers
 * Author           :   Jibin Gigi
 * Version          :   1.0
 * Date             :   26/09/23
***************************************************************************************************************************************************/

import java.util.Scanner;
public class Addition_of_positive_numbers {
		public static void main(String[] args) {
			int Positive_number=1,sum=0;
			Scanner sc= new Scanner(System.in);
			while(Positive_number>0) {
				System.out.println("Enter the number");
				Positive_number=sc.nextInt();
				sum=sum+Positive_number;
			}
			System.out.println("Sum = "+sum);
			sc.close();
		}
		
}