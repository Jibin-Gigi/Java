import java.util.Scanner;
public class second_smallest_element_inArray {
        public static void main(String [] args) {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter the number of elements: ");
        	int n=sc.nextInt();
        	int []array=new int[n];
        	System.out.println("Enter the numbers");
        	for(int i=0;i<n;i++) {
        		array[i]=sc.nextInt();
        	}
        	int secondElement=secondElement(n,array);
        	System.out.println("The second smallest element is "+secondElement);
        	sc.close();
        }
        static int secondElement(int n,int []array) {
        	int []min_term=new int[2];
        	int k;
        	for(int i=0;i<2;i++) {
        		for(int j=0;j<n;j++) {
        			if(array[j]>array[j+1]) {
        				 k=array[j];
        			}
        			if(array[j]==k)
        				continue;
        			
        			
        	}	
        		min_term[i]=k;
        		
        	}
       
        	
        
        return min_term[1];
        
}
}