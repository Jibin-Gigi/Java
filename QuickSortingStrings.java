/*************************************************************************************************************************
 * File		    :   QuickSortingStrings.java
 * Description      :   Java program that implements Quick sort algorithm for sorting a list of names in ascending order.
 * Author           :   Jibin Gigi
 * Version          :   1.0
 * Date             :   08/12/23
**************************************************************************************************************************/

import java.util.Scanner;

public class QuickSortingStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of strings to be sorted
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        sc.nextLine(); 

        // Array to store input strings
        String[] strings = new String[limit];

        // Input: Strings to be sorted
        System.out.println("Enter the strings to be sorted:");
        for (int i = 0; i < limit; i++) {
            strings[i] = sc.nextLine();
        }

        // Sorting using QuickSort algorithm
        quickSort(strings, 0, limit - 1);

        // Output: Sorted strings
        System.out.println("Sorted strings:");
        for (int i = 0; i < limit; i++) {
            System.out.println(strings[i]);
        }

        sc.close(); // Close the Scanner
    }

    // Recursive method to perform QuickSort on an array of strings
    public static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pi = partition(arr, low, high);

            // Recursively sort the sub-arrays
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Helper method to partition the array and return the pivot index
    public static int partition(String[] arr, int low, int high) {
        // Select the first element as the pivot
        String pivot = arr[low];
        int i = low;

        // Iterate through the array to rearrange elements around the pivot
        for (int j = low + 1; j <= high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                // Swap elements if the current element is less than the pivot
                swap(arr, i, j);
            }
        }

        // Swap the pivot with the element at index i
        swap(arr, low, i);
        return i; // Return the pivot index
    }

    // Helper method to swap elements in an array
    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}




  
