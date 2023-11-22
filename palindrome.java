/**********************************************************************************************************************************************************
 * File							:		Palindrome.java
 * Description					      : 		To check whether a string is palindrome or not
 * Author 						      :		Jibin Gigi
 * Version						      :		1.0
 * Date							:		03/10/23
 **************************************************************************************************************************************************************/

import java.util.Scanner;

public class palindrome {
      public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Enter the String");
    	  String input = sc.next();
    	  boolean isPal = isPalindrome(input);
    	  if(isPal) {
    		  System.out.println("The Given String is Palidrome");
    	  }
    	  else {
    		  System.out.println("The Given String is Not Palidrome");
    	  }
    	 
    	  sc.close();
    	  
    	  
      }
      static boolean isPalindrome(String input) {
    	  int length = input.length();
    	  char [] charArray=input.toCharArray();
    	  for(int i=0;i<=length/2;i++) {
    		  if(charArray[i]!=charArray[length-i-1]) {
    			  return false;
    		  }
    	  }
    	  return true;
    	  
      }

}
