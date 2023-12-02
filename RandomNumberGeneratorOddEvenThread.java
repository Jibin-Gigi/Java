import java.util.Random;
import java.util.Scanner;

public class RandomNumberGeneratorOddEvenThread {
		public static void main(String [] args) {
			System.out.println("Enter the limit");
			Scanner sc=new Scanner(System.in);
			int limit=sc.nextInt();
			numberManager object=new numberManager();
			NumberGenerator number=new NumberGenerator(object,limit);
			number.start();
			EvenPrint number2=new EvenPrint(object);
			number2.start();
			OddPrint number3=new OddPrint(object);
			number3.start();
			
			sc.close();
		}
}

class numberManager{
	private int generatedNumber;
	private boolean numberGeneration=false;
	
	synchronized public void generateNumber() {
		
		generatedNumber= new Random().nextInt(99)+1;   //Random number generates from 1
		System.out.println("The generated random number is: "+generatedNumber);
		numberGeneration=true; 
		notifyAll();
	}
	
	public synchronized void printEvenNumbers() throws InterruptedException {
		while(!numberGeneration || generatedNumber!=0) {
			wait();
		}
		for(int i=2;i<generatedNumber;i+=2) {
			System.out.print(i+" ");
			numberGeneration=false;
		}
		System.out.println();
	}
	
	public synchronized void printOddNumbers() throws InterruptedException {
		while(!numberGeneration || generatedNumber==0) {
			wait();
		}
		for(int i=1;i<generatedNumber;i+=2) {
			System.out.print(i+" ");
			numberGeneration=false;
		}
		System.out.println();
	}
	
}

class NumberGenerator extends Thread{
	numberManager number=new numberManager();
	int limit,count=1;
	public NumberGenerator(numberManager number,int limit) {
		this.number=number;
		this.limit=limit;
	}
	
	public void run() {
		while(true && count<=limit) {
		number.generateNumber();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		count++;
		}
		
	}
}

class EvenPrint extends Thread{
	numberManager number=new numberManager();
	public EvenPrint(numberManager number) {
		this.number=number;
	}
	
	public void run() {
		while(true) {
		try {
			number.printEvenNumbers();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}

class OddPrint extends Thread{
	numberManager number=new numberManager();
	public OddPrint(numberManager number) {
		this.number=number;
	}
	
	public void run() {
		while(true) {
		try {
			number.printOddNumbers();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
