import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileExceptionHandling {
		public static void main(String []args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the text you want to add ");
			String string=new String(sc.nextLine());
			char [] data=new char[50];
			FileWriter input=null;
			FileWriter output=null;
			FileReader file=null;
			try {
			
			input=new FileWriter("input.txt");
			input.write(string);
			input.flush();
			input.close();
			output=new FileWriter("output.txt");
			file=new FileReader("input.txt");
			file.read(data);
			output.write(data);
			output.flush();
			output.close();
			
			
			
			}catch(IOException e) {
				e.printStackTrace();
			}
			sc.close();
		}
}
