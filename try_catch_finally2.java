import java.util.Scanner;
public class try_catch_final {
	public static void main(String [] args) {
		division();
		
	}
	
	static void division() {
		int num1,num2;
		String choice;
		Scanner sc=new Scanner(System.in);
		
		
		do {
			System.out.println("Enter the number 1");
			num1=sc.nextInt();
			System.out.println("Enter the number 2");
			num2=sc.nextInt();
			try {
				System.out.println("The result is "+ (num1/num2));
				
				}catch(ArithmeticException n) {
					System.out.println("Divisible by zero is not possible");
				}
			    
			    
			    System.out.println("Do you want to continue: ");
			    choice=sc.next();
		}while(choice!="n");
		
		
		
		sc.close();
		
	}
}	
		
		
		
		
		
		
		
		
		
