/********************************************************************************************************************************************************
 * File				                                         :	 matrixTranspose.java
 * Description                                  		     :   Display transpose of a given matrix
 * Author                                     			     :   Jibin Gigi
 * Version                                   			     :   1.0
 * Date                                       			     :   31/10/23
**********************************************************************************************************************************************************/


import java.util.Scanner;
public class matrixTranspose {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the no. of rows: ");
			int row=sc.nextInt();
			System.out.println("Enter the no. of columns: ");
			int column=sc.nextInt();
			int[][]matrix=new int[row][column];
			System.out.println("Enter the elements of matrix: ");
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
					matrix[i][j]=sc.nextInt();
				}
			}
			System.out.println("The transposed matrix is: ");
			transpose(row,column,matrix);
			sc.close();
		}
		static void transpose(int row,int column,int[][] matrix) {
			int [][]transpose=new int [column][row];
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
					transpose[j][i]=matrix[i][j];
				}
		    }
			for(int[] i: transpose) {
				for(int j:i) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
			
}
}