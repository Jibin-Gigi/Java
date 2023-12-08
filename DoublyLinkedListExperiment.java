/*************************************************************************************************************************
 * File		    :   Doubly LinkedList Experiment
 * Description      :   Java program for the following: 
 			   1) Create a doubly linked list of elements. 
			   2) Delete a given element from the above list. 
			   3) Display the contents of the list after deletion.
 * Author           :   Jibin Gigi
 * Version          :   1.0
 * Date             :   08/12/23
**************************************************************************************************************************/


import java.util.LinkedList;
import java.util.Scanner;
import java.lang.IndexOutOfBoundsException;

public class DoublyLinkedListExperiment {
	public static void main(String[] args) {
		int choice,element,index,flag=0;
		DoublyLinkedList<Integer> list= new DoublyLinkedList<>();
		Scanner sc=new Scanner(System.in);
		boolean condition=true;
		while(condition) {
		System.out.println("Enter the choice\n"+"1.Insert at Beginning\n"+"2.Insert At End\n"+"3.Insert at any Position\n"+"4.Delete at any Position\n"
							+"5.Display\n"+"6.Exit");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the element");
			element=sc.nextInt();
			list.InsertionAtBeginning(element);
			flag++;
			break;
		case 2:
			System.out.println("Enter the element");
			element=sc.nextInt();
			list.InsertionAtEnd(element);
			flag++;
			break;
		case 3:
			try {
			System.out.println("Enter the position at which element is to be added");
			index=sc.nextInt();
			System.out.println("Enter the element");
			element=sc.nextInt();
			list.InsertionAtAnyPosition(index, element);
			flag++;
			}catch (IndexOutOfBoundsException e) {
				System.out.println("The given index is not present");
			}
			
			break;
		case 4:
			try {
			System.out.println("Enter the position at which element is to be deleted");
			index=sc.nextInt();
			list.DeleteAtAnyPosition(index);
			flag--;
			}catch(IndexOutOfBoundsException e) {
				System.out.println("Given index is not present");
			}
			break;
		case 5:
			if(flag>0) {
			list.display();
			}else {
				System.out.println("The LinkedList is empty");
			}
			break;
		case 6:
			condition=false;
			break;
		}
		}
		
		sc.close();
	}
		
}	

class DoublyLinkedList<T>{
	private LinkedList<T> list =new LinkedList<>();
	
	public void InsertionAtBeginning(T element) {
		list.addFirst(element);
	}
	public void InsertionAtEnd(T element) {
		list.addLast(element);
	}
	public void InsertionAtAnyPosition(int index,T element) {
		list.add(index,element);
	}
	public void DeleteAtAnyPosition(int index) {
		list.remove(index);
		display();
	}
	public void display() {
		System.out.println("The elements are: ");
		for(T element : list) {
			System.out.print(element +"  ");
		}
		System.out.println( );
	}
}





