import java.util.Scanner;
public class bankException {
		public static void main(String[] args) {
			int i=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no. of customers: ");
			int numberOfCustomers=sc.nextInt();
			Customer [] customer=new Customer[numberOfCustomers];
			for(i=0;i<numberOfCustomers;i++) {
				customer[i]= new Customer();
				customer[i].customerDetails();
			}
			for(i=0;i<numberOfCustomers;i++) {
				customer[i].printDetails();
			}
			Bank bank = new Bank(); 
			bank.functions(customer,numberOfCustomers);
			/*object array*/
			//Class [] class =new Class [value]();
			
			sc.close();
		}
		
}
class InvalidAmountException extends Exception{
	public InvalidAmountException(String s) {
		 super(s);
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
		System.out.println("________________________________");
		
	}
	void printDetails() {
		System.out.println("________________________________");
		System.out.println("________________________________");
		System.out.println("Name of account holder : "+name);
		System.out.println("Account number : "+acc_no);
		System.out.println("Account type : "+acc_type);
		System.out.println("Balance : "+balance);
	}
	
	
}
class Bank  extends Customer{
	int choice;
	double search;
	InvalidAmountException invalid=new InvalidAmountException ("Invalid Amount");
	void functions(Customer [] customer,int numberOfCustomers) {
	do {
		double value=0;
				
		System.out.print("1.Display all account Details \n2.Search by Account number \n3.Deposit money \n4.Withdraw money \n5.Exit\n");
		System.out.println("Enter your choice: ");
		choice=sc.nextInt();
		switch(choice) {
				case 1 :{
					for(int i=0;i<numberOfCustomers;i++) {
					customer[i].printDetails();
					}
					break;
				}
				case 2 :{
					System.out.println("Enter the Account No. to be selected: ");
					value=sc.nextDouble();	
					System.out.println();
					for(int i=0;i<numberOfCustomers;i++) {
					if(value==customer[i].acc_no) {
						printDetails();	
					}
					}
					break;
				}
				case 3 :{
					System.out.println("Enter the Account No. to be selected: ");
					value=sc.nextDouble();
					try {
						
					for(int i=0;i<numberOfCustomers;i++) {
						if(value==customer[i].acc_no) {
							System.out.println("Enter the amount to be deposited: ");
							value=sc.nextDouble();
							if(value<0) {
								throw invalid ;
							}
							else {
							balance=balance+(float)value;
							System.out.println("The total balance : "+balance);
							}
						}
						}
					} catch(InvalidAmountException e){
						System.out.println("Invalid Amount");
					}
					break;
				}
				case 4 :{
					System.out.println("Enter the Account No. to be selected: ");
					value=sc.nextDouble();	
					System.out.println();
					for(int i=0;i<numberOfCustomers;i++) {
					if(value==customer[i].acc_no) {
						System.out.println("Enter the amount to withdraw: ");
						value=sc.nextDouble();
						balance=balance-(float)value;
						System.out.println("The remaining balance : "+balance);
					}
					}
					break;
					
				}
				case 5 :{
					break;
				}
				
		}
	}while(choice<=5 && choice >=1);
	
	}
}
