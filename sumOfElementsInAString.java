import java.util.StringTokenizer;
import java.util.Scanner;

public class sumOfElementsInAString {
	
	public static void main(String [] args) {
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number string ");
		StringTokenizer  object=new StringTokenizer(sc.nextLine());
		while(object.hasMoreElements()) {
			int data=Integer.parseInt(object.nextToken());
			System.out.println(data+"  ");
			sum=sum+data;
		}
		System.out.println("The sum of numbers in string="+sum);
		
		sc.close();
		
		}
	}


 
