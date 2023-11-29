
public class MultiplicationMultiThreading {
	public static void main(String[] args) {
		multiplicationTable table=new multiplicationTable();
		MyThread1 thread1=new MyThread1(table);
		thread1.start();
		MyThread2 thread2=new MyThread2(table);
		thread2.start();
		
	}
}

class MyThread1 extends Thread{
	multiplicationTable table;
	MyThread1(multiplicationTable table){
		this.table=table;
	}
	public void run() {
		table.getThreadDetails();
		table.printTable(5);
	
}
}
class MyThread2 extends Thread{
	multiplicationTable table;
	MyThread2(multiplicationTable table){
		this.table=table;
	}
	public void run() {
		table.getThreadDetails();
		table.printTable(7);
	}
}

class multiplicationTable{
	synchronized void printTable(int number) {
	/*	synchronized(this) {   */
		for(int i=1;i<=10;i++) {
			if(i<10) {
				System.out.print(" ");
			}
			System.out.println(i+" x " +number+" = "+i*number);
		}
	/*	}  */
		
	}
	
		void getThreadDetails() {
			synchronized(this){
			System.out.println(Thread.currentThread().getName());
			System.out.println("The priority of Thread is " +Thread.currentThread().getPriority());
			if(Thread.currentThread().isAlive()) {
				System.out.println("The thread is running");
			}
			else {
				System.out.println("The thread is not running");
			}
			}
			
		}
	}

	