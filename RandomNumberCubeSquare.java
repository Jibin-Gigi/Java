import java.util.Random;
import java.util.Scanner;

public class RandomNumberCubeSquare {

	public static void main(String[] args) {
		System.out.println("Enter the limit");
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		NumberManager number=new NumberManager();
		NumberGenerator generatedNumber=new NumberGenerator(number,limit);
		generatedNumber.start();
		SquareThread even=new SquareThread(number); 
		even.start();
		OddThread odd=new OddThread(number);
		odd.start();
		
		
		sc.close();
	}

}

class NumberManager{
	private int numberGenerated;
	private boolean generationStatus=false;
	
	synchronized public void RandomNumberGeneration() {
		numberGenerated=new Random().nextInt(100)+1;   //Upto 99 from 1
		System.out.println("The number generated is : "+numberGenerated);
		generationStatus=true;
	}
	
	synchronized public void EvenNumberSquare() throws InterruptedException {
		if(!generationStatus || numberGenerated%2!=0) {
			wait();
		}
		else {
			System.out.println("The square of the "+numberGenerated+ " : "+numberGenerated*numberGenerated);
			generationStatus=false;
			notifyAll();
			
		}
	}
	
	synchronized public void OddNumberCube() throws InterruptedException {
		if(!generationStatus || numberGenerated%2==0) {
			wait();
		}
		else {
			System.out.println("The cube of the "+numberGenerated+ " : "+numberGenerated*numberGenerated*numberGenerated);
			generationStatus=false;
		}
	}
}


class SquareThread extends Thread{
	NumberManager square=new NumberManager();
	
	SquareThread(NumberManager square) {
		this.square=square;
		
	}
	public void run() {
		while(true) {
		try {
			square.EvenNumberSquare();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
class OddThread extends Thread{
	NumberManager cube=new NumberManager();
     
	
	OddThread(NumberManager cube) {
		this.cube=cube;
		
	}
	public void run() {
		while(true) {
		try {
			cube.OddNumberCube();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}

class NumberGenerator extends Thread{
	NumberManager number=new NumberManager();
	int count=0,limit;
	public NumberGenerator(NumberManager number,int limit) {
		this.limit=limit;
		this.number=number;
	}
	public void run() {
		while(true && count<limit) {
			number.RandomNumberGeneration();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count++;
		}
	}
}