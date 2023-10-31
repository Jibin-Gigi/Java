/********************************************************************************************************************************************************
 * File				                                         :	 stringReverse.java
 * Description                                  		     :   Reversing a String
 * Author                                     			     :   Jibin Gigi
 * Version                                   			     :   1.0
 * Date                                       			     :   31/10/23
**********************************************************************************************************************************************************/

import java.util.Scanner;
public class stringReverse {
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		String string;
		System.out.println("Enter the String: ");
		string=scan.next();
		char []array=string.toCharArray();
		int length=string.length();
		String reverse=reverse(length,array);
		System.out.println("The reversed string is: ");
			System.out.println(reverse);
		scan.close();
		
	}
	 static String reverse(int length,char[]array) {
		char []reverse=new char[length];
		int a=0;
		for(int i=length;i>0;i--) {
			reverse[a]=array[i-1];
			a++;
		}
		String reversed_string=String.valueOf(reverse);
		return reversed_string;
	}
	
}
