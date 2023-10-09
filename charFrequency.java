/****************************************************************************************************************************************************
 * File                                                         : charFrequency
 * Description                                                  : Java program to find frequency of a character in a string
 * Author                                                       : Jibin Gigi
 * Version                                                      : 1.0
 * Date                                                         : 9/10/23
 *************************************************************************************************************************************************/
import java.util.Scanner;
public class charFrequency {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string");
        String sentence=new String();
        sentence=scan.nextLine();
        System.out.println("Enter the character to be searched");
        char checkMe=scan.next().charAt(0);
        int charCount=checkFrequency(sentence,checkMe);
        System.out.println("No. of character occurence in String = "+charCount);
    
    }
    
    static int checkFrequency(String sentence,char checkMe){
        char [] array=sentence.toCharArray();
        int length=sentence.length(),charCount=0;
        for(int i=0;i<length;i++){
            if(array[i]==checkMe){
                charCount++;
            }
        }
      return charCount;  
    }
}
