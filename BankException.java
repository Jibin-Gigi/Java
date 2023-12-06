import java.util.Scanner;


public class BankException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InvalidAmountException amountException = new InvalidAmountException("Invalid Amount");
        InsufficientFundsException fundsException = new InsufficientFundsException("Insufficient Funds");
        int choice;

        System.out.println("Enter the No of Customers");
        int noOfCustomers = sc.nextInt();
        Customers[] customer = new Customers[noOfCustomers];

        
        for (int i = 0; i < noOfCustomers; i++) {
            customer[i] = new Customers();
            customer[i].setCustomerDetails(sc);
            System.out.println("___________________________________________");
        }

        do {
            System.out.println("1. Display Account Details");
            System.out.println("2. Search by account number");
            System.out.println("3. Deposit the amount");
            System.out.println("4. Withdraw the amount");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");

            
                choice = sc.nextInt();
             

            switch (choice) {
                case 1:
                    System.out.println();
                    for (int i = 0; i < noOfCustomers; i++) {
                        System.out.println("Customer "+(i+1));
                        customer[i].getCustomerDetails();
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Enter the account number");
                    int searchAccount = sc.nextInt();
                    boolean accountFound = false;
                    for (int i = 0; i < noOfCustomers; i++) {
                        if (customer[i].accountNumber == searchAccount) {
                            customer[i].getCustomerDetails();
                            accountFound = true;
                            break; 
                        }
                    }
                    if (!accountFound) {
                        System.out.println("Account not found.");
                    }
                    System.out.println();
                    break;
                case 3: 
                    System.out.println();
                    System.out.println("Enter the account number");
                    int depositAccount = sc.nextInt();
                    boolean depositAccountFound = false;
                    for (int i = 0; i < noOfCustomers; i++) {
                    	 try {
                        if (customer[i].accountNumber == depositAccount) {
                                depositAccountFound = true;
                                 System.out.println("Enter the amount to deposit");
                                 int depositAmount = sc.nextInt();
                                 if (depositAmount < 0) {
                                     throw amountException;
                                 	} 
                                 else {
                                	 customer[i].accountBalance += depositAmount;
                                     customer[i].getCustomerDetails();
                                     
                                     
                                 }
                        	 }
                            
                       
                    	 } catch (InvalidAmountException e) {
                             System.out.println(e.getMessage());
                             }
                    }
                    if(depositAccountFound == false)
                        System.out.println("Account not found");
                    System.out.println();
                    break;
                        
                    
       
                    
                case 4:  
                    System.out.println();
                	System.out.println("Enter the account number");
                	searchAccount = sc.nextInt();
                    boolean withdrawAccountFound = false;
                	for (int i = 0; i < noOfCustomers; i++) {
                		try {
                        if (customer[i].accountNumber == searchAccount) {
                            withdrawAccountFound = true;
                        	System.out.println("Enter the amount to withdraw");
                            int withdrawAmount = sc.nextInt();
                            	if (withdrawAmount <= 0) {
                                throw amountException;
                            	} 
                            	if (withdrawAmount > customer[i].accountBalance) {
                                    throw fundsException;
                                } else {
                                    customer[i].accountBalance = customer[i].accountBalance - withdrawAmount;
                                    customer[i].getCustomerDetails();
                                    
                                }
                            	
                        }
                	}catch (InvalidAmountException e) {
                        System.out.println(e.getMessage());
                    } catch (InsufficientFundsException e) {
                        System.out.println(e.getMessage());
                    }
                	}
                    if(withdrawAccountFound == false)
                        System.out.println("Account not found");
                   	System.out.println();
                    break; 
                case 5:
                    System.out.println();
                    System.out.println("Program ends");
                    break;
                    
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice < =5);
        sc.close();
    }
}



class InvalidAmountException extends Exception {
    InvalidAmountException(String str) {
        super(str);
    }
}

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String str) {
        super(str);
    }
}

class Customers {
    int accountNumber;
    String accountType;
    String customerName;
    double accountBalance;

    public void setCustomerDetails(Scanner sc) {
        System.out.println("Enter the Account Number");
        accountNumber = sc.nextInt();
        System.out.println("Enter the account type");
        accountType = sc.next();
        System.out.println("Enter the Customer Name");
        customerName = sc.next();
        System.out.println("Enter the  Balance");
        accountBalance = sc.nextDouble();
    }

    public void getCustomerDetails() {
        System.out.println("---------------------------------");
        System.out.println("The Customer Details are:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Balance: " + accountBalance);
        System.out.println("---------------------------------");
       
    }
}
