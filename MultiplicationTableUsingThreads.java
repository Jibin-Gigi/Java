import java.util.Scanner;

public class MultiplicationMultiThreading {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the table you want to run by thread 1");
		int number1=sc.nextInt();
		System.out.println("Enter the table you want to run by thread 2");
		int number2=sc.nextInt();
		System.out.println("Enter the table you want to run by thread 3");
		int number3=sc.nextInt();
		multiplicationTable table=new multiplicationTable();
		MyThread1 thread1=new MyThread1(table,number1);
		thread1.start();
		MyThread2 thread2=new MyThread2(table,number2);
		thread2.start();
		MyThread3 thread3=new MyThread3(table,number3);
		thread3.start();
		sc.close();
	}
}

class MyThread1 extends Thread{
	multiplicationTable table;
	int number1;
	MyThread1(multiplicationTable table,int number1){
		this.table=table;
		this.number1=number1;
	}
	public void run() {
		table.printTable(number1);
	
}
}
class MyThread2 extends Thread{
	multiplicationTable table;
	int number2;
	MyThread2(multiplicationTable table,int number2){
		this.table=table;
		this.number2=number2;
	}
	public void run() {
		table.printTable(number2);
	}
}
class MyThread3 extends Thread{
	multiplicationTable table;
	int number3;
	MyThread3(multiplicationTable table,int number3){
		this.table=table;
		this.number3=number3;
	}
	public void run() {
		table.printTable(number3);
	
}
}
class multiplicationTable{
	synchronized void printTable(int number) {
		for(int i=1;i<=10;i++) {
			if(i<10) {
				System.out.print(" ");
			}
			System.out.println(i+" x " +number+" = "+i*number);
		}
		
	}
	}

	
