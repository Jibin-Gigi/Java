import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class QuickSort_usingFiles {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no. of strings: ");
    int limit=sc.nextInt();
    System.out.println("Enter the strings to be sorted: ");
    String [] names=new String[limit];
    for(int i=0;i<limit;i++){
            names[i]=sc.next();
    }
    FileWriter input=null;
    FileReader inputfile=null;
    FileWriter output=null;
    char[] data=new char[50];
    try {
        input =new FileWriter("input.txt");
      for(int i=0;i<limit;i++){
            input.write(names[i]+"  ");
    }  
    input.flush();
    input.close();
    inputfile=new FileReader("input.txt");
    for(int i=0;i<limit;i++){
            inputfile.read(data);
    }  
    
    output=new FileWriter("output.txt");
    sort(names,0,limit-1);
    for(int i=0;i<limit;i++){
         output.write(names[i]+"  ");
    }
    output.flush();
    output.flush();

    } catch (IOException e) {
        e.printStackTrace();
    } 
    sc.close();
}

static void sort(String[] string,int low,int high){
    if(low<high){
        int pivot=partition(string,low,high);
        sort(string, low, pivot);
        sort(string, pivot+1, high);
    }
}


static int partition(String[] string,int low,int high){
    String pivotString=string[low];
    int i=low;
    for(int j=low+1;j<=high;j++){
        if(string[j].compareTo(pivotString) <0){
            i++;
            swap(string,i,j);
        }
    }
    swap(string, low, i);
    return i;

}

static void swap(String [] string,int i,int j){
    String temp=string[i];
    string[i]=string[j];
    string[j]=temp;
}
}
