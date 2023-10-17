/****************************************************************************************************************************************************************************************************************
 * File                                                      : methodOverriding.java
 * Description                                               : Java program which creates a class named 'Employee' having the following members: Name, Age, Phone number, Address, Salary. 
                                                              It also has a method named 'printSalaryegg' which prints the salary of the Employee. Two classes 'Officer' and  
                                                              'Manager' inherits the 'Employee' class. The 'Officer' and 'Manager' classes have data members 'specialization' 
                                                               and 'department' respectively. Now, assign name, age, phone number, address and salary to an officer and 
                                                               a manager by making an object of both of these classes and print the same
 * Author                                                    : Jibin Gigi
 * Version                                                   : 1.0
 * Date                                                      : 17/10/23
 * *************************************************************************************************************************************************************************************************************/


import java.util.Scanner;
public class methodOverriding {
	public static void main(String[] args) {
		Officer officer=new Officer();
		officer.officerDetails();
		officer.printSalary();
		Manager manager=new Manager();
		manager.managerDetails();
		manager.printSalary();
		
	}
}

class Employee{
	String name;
	int age;
	long phoneNo;
	String address;
	double salary;
	Scanner sc=new Scanner(System.in);
	
	void details() {
		System.out.println("Name:");
		this.name=sc.nextLine();
		System.out.println("Age:");
		this.age=sc.nextInt();
		System.out.println("Address: ");
		sc.nextLine();
		this.address=sc.nextLine();
		System.out.println("Phone No: ");
		this.phoneNo=sc.nextLong();
		System.out.println("Salary");
		this.salary=sc.nextDouble();
		
	}
	
	
	void printSalary() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Address: "+address); 
		System.out.println("Phone No: "+phoneNo);
		System.out.println("Salary ="+salary);
		
	}
}

class Officer extends Employee{
	String Specialisation;
	void officerDetails() {
		System.out.println("Enter the details of Officer ");
		details();
		
		System.out.println("Specialisation:");
		Specialisation=sc.next();  
		
		System.out.println("Details of Officer ");
		System.out.println("Specialisation:"+Specialisation);
		
			
	}
	
}

class Manager extends Employee{
	String Department;
	void managerDetails() {
		System.out.println("Enter the details of Manager");
		details();
		
		System.out.println("Department:");
		Department=sc.next();
		
		System.out.println("Details of Manager ");
		System.out.println("Department:"+Department);
		
		
	}
}