
/*
 * Write a Java program to create an interface Sortable with a method sort (int[] array) that sorts an array of integers in descending order.
 * Create two classes QuickSort and MergeSort that implement the Sortable interface and provide their own implementations of the sort() method.
 * 
 */



package interface1;

public class Main {

	public static void main(String[] args) {
		int[] array = {
				9,8,0,6,8,3,9
		};
		
		Sortable quickSort = new QuickSort();
		quickSort.sort(array);
		
		System.out.println("Quicksort: ");
        printArray(array);
        System.out.println();
        
        
        
        Sortable mergeSort = new MargeSort();
        mergeSort.sort(array);
        
         
        System.out.println("MargeSort: ");
        printArray(array);
        System.out.println();
        
      
	}

	  private static void printArray(int[] array) {
      	for(int num: array) {
      		System.out.print(num + "  ");
      	}
      	
      }


}
