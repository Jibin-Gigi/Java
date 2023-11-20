
import java.io.FileWriter;
import java.io.IOException;

public class fileDemo {
		public static void main(String [] args) {
				String data="Welcome to the world of Files";
				FileWriter output = null;
				try {
						output= new FileWriter("D:/outputfile.txt");
						output.write(data);
				}
				catch(IOException e) {
						e.printStackTrace();
						
				}finally {
					try {
					output.flush();
					output.close();
				}catch(IOException e) {
					e.printStackTrace();
					
				}
				}
		}
}
