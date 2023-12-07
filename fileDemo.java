import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class fileDemo {
	public static void main(String[] args) {
		String str="I am Inevitable";
		char [] data1=new char[50];
		FileWriter input=null;
		FileWriter output=null;
		FileReader string=null;
		try {
			input=new FileWriter("inputfile.txt");
			output=new FileWriter("outputfile.txt");
			input.write(str);
			input.flush();
			input.close();
			string=new FileReader("inputfile.txt");
			int size=string.read(data1);
			string.close();
			output.write(data1,0,size);
			output.flush();
			output.close();
			
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
	}
}




