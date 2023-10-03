/**********************************************************************************************************************************************************
 * File							:		frequency_of_string.java
 * Description					        : 		To find frequency of string
 * Author 						:		Jibin Gigi
 * Version						:		1.0
 * Date							:		03/10/23
 **************************************************************************************************************************************************************/
package javalab;

import java.util.Scanner;

public class frequency_of_string {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String: ");
			String input=sc.next();
			char letter;
			System.out.println("Enter the letter to check frequency: ");
			letter=sc.next().charAt(0);
			int length=input.length(),count=0,i=0;
			char []charArray=input.toCharArray();
			while(length>0) {
				if(charArray[i]==letter) {
					count++;
				}
				i++;
				length--;
			}
			if(count>0) {
			    System.out.println("Frequency of  the String is:"+count);	
			}
			else {
				System.out.println("Character is not present");
			}
			sc.close();
			}
		
}
