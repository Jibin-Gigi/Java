package javalab;

/*import java.util.Scanner;

public class Frequency_with_functions {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input=sc.next();
		char letter;
		System.out.println("Enter the letter to check frequency: ");
		letter=sc.next().charAt(0);
		int count=count(count);
		if(count>0) {
		    System.out.println("Frequency of  the String is:"+count);	
		}
		else {
			System.out.println("Character is not present");
		}
		
	}
    static int count(int count) {
    	int length=input.length(),counter=0,i=0;
		char []charArray=input.toCharArray();
		while(length>0) {
			if(charArray[i]==letter) {
				counter++;
			}
			i++;
			length--;
		}
		
   }
}   
*/

import java.util.Scanner;
public class Frequency {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String word = new String();
		word = scan.nextLine();
		word = word.toLowerCase();
		char [] wordTwo = word.toCharArray();
		System.out.println("Enter the letter to check frequency: ");
		String letter = scan.next();
		letter = letter.toLowerCase();
		char [] letterTwo = letter.toCharArray();
		int len = word.length();
		int value = frequency(letterTwo, wordTwo,len);
		System.out.println("The frequency count is "+value);
	}
	
static int frequency(char [] letterTwo, char [] word, int len) {
	int count = 0;
	for (int i = 0; i < len;i ++) {
		if (word[i] == letterTwo[0]) {
			count ++;
		}
	}
	return count;
}
}