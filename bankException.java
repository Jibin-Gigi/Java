import java.util.Scanner;
public class bankException {
		public static void main(String[] args) {
			
			/*obect array*/
			//Class [] class =new Class [value]();
			
		}
}



class Customer{
	double acc_no;
	String acc_type;
	float balance;
	String name;
	Scanner sc=new Scanner(System.in);
	
	
	void customerDetails() {
		System.out.println("Enter the name: ");
		name=sc.next();
		System.out.println("Enter the account number:");
		acc_no=sc.nextDouble();
		System.out.println("Enter the account type: ");
		acc_type=sc.next();
		System.out.println("Enter the balance: ");
		balance=sc.nextFloat();
		
	}
	void printDetails() {
		System.out.println("Name of account holder : "+name);
		System.out.println("Account number : "+acc_no);
		System.out.println("Account type : "+acc_type);
		System.out.println("Balance : "+balance);
	}
	
}
class Bank extends Customer{
	int choice;
	double search;
	void functions(String name,double acc_no,String acc_type,float balance) {
	do {
		double value=0;
		System.out.println("Enter your choice: ");
		choice=sc.nextInt();		
		System.out.print("1.Display all account Details \n2.Search by Account number \n3.Deposit money \n4.Withdraw money \n5.Exit");
		
		switch(choice) {
				case 1 :{
					printDetails();
				}
				case 2 :{
					System.out.println("Enter the Account No. to be selected: ");
					value=sc.nextDouble();	
					System.out.println();
					if(value==acc_no) {
						printDetails();	
					}
					
				}
				case 3 :{
					
					System.out.println("Enter the amount to be deposited: ");
					value=sc.nextDouble();
					balance=balance+(float)value;
					System.out.println("The total balance : "+balance);
				}
				case 4 :{
					System.out.println("Enter the amount to withdraw: ");
					value=sc.nextDouble();
					balance=balance-(float)value;
					System.out.println("The remaining balance : "+balance);
					
				}
				case 5 :{
					break;
				}
				
		}
	}while(choice<=5 && choice >=1);
	
	}
}
