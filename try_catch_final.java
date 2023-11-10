import java.util.Scanner;
public class try_catch_final {
	public static void main(String [] args) {
		division(10,2);
		division(100,0);
	}
	
	static void division(int num1,int num2) {
		int result ;
		String choice;
		Scanner sc=new Scanner(System.in);
		
		do {
			try {
		        result=num1/num2;
				
				}catch(ArithmeticException n) {
					System.out.println("Divisible by zero is not possible");
				}
			    
			    System.out.println("The result is "+ result);
			    System.out.println("Do you want to continue: ");
			    choice=sc.next();
		}while(choice=="y");
		
		
		
		
		
	}
}	
		
		
		
		
		
		
		
		
		