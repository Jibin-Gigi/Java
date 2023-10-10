/********************************************************************************************************************************************************
 * File                                                      : matrix_multiplication.java
 * Description                                               : Java program to find product of two matrices
 * Author                                                    : Jibin Gigi
 * Version                                                   : 1.0
 * Date                                                      : 10/10/23
 * *****************************************************************************************************************************************************/


import java.util.Scanner;
public class matrix_multiplication {
	public static void main(String []args) {
		Scanner value=new Scanner(System.in);
		System.out.println("Enter the no. of rows of first matrix");
		int row=value.nextInt();
	    System.out.println("Enter no. of columns of first matrix");
	    int column=value.nextInt();
	    
	    System.out.println("Enter the no. of rows of second matrix");
		int row2=value.nextInt();
	    System.out.println("Enter no. of columns of second matrix");
	    int column2=value.nextInt();
	    
	   if(column!=row2) {
		   System.out.println("The multiplication cannot be happened since row2 not equal to column1");
		   
	   }
	   else{
		   System.out.println("Enter the values of first matrix");
	       int [][]array1= new int[row][column];
	       for(int i=0;i<row;i++) {
		   for(int j=0;j<column;j++) {
			   array1[i][j]=value.nextInt();
			   
		   		}
	       	}
	       System.out.println("Enter the values of second matrix");
	       int [][]array2= new int[row2][column2];
	       for(int i=0;i<row2;i++) {
		   for(int j=0;j<column2;j++) {
			   array2[i][j]=value.nextInt();
	       
		   		}
	       }
	       System.out.println("First matrix is:" );
	       for(int i=0;i<row;i++) {
			   for(int j=0;j<column;j++) {
				  System.out.print("\t"+array1[i][j]);
				   
			   		}
			      System.out.print("\n");
		       	}
	       
	       System.out.println("Second matrix is:" );
	       for(int i=0;i<row2;i++) {
			   for(int j=0;j<column2;j++) {
				  System.out.print("\t"+array2[i][j]);
				   
			   		}
			      System.out.print("\n");
		       	}
	       
	       
	       int [][]result=new int[row][column2];
	       for(int i=0;i<row;i++) {
	    	   for(int j=0;j<column2;j++) {
			    result[i][j]=0;
	    		   for(int k=0;k<column;k++) {
	    			   result[i][j]+=array1[i][k]*array2[k][j];
	    		   }
	    	   }
	       }
	       
	       System.out.println("The result matrix is");
	       for(int i=0;i<row;i++) {
	    	   for(int j=0;j<column2;j++) {
	    		   System.out.print("\t"+result[i][j]);
	    	   }
	    	   System.out.print("\n");
	       }
	   }
	   value.close();
}
}
