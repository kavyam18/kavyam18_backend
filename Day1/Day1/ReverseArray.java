package Day1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayOperations {

public void createArray() 
	{
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the array size:");
     int n = scan.nextInt();
     int arr[] = new int[n];
     System.out.println("Enter the array elements:");
     for(int i=0;i<arr.length;i++) 
     {
    	 arr[i]=scan.nextInt();
     }
     System.out.println("Array elements are:");
     for(int i=0;i<arr.length;i++)
     {
    	 System.out.println(arr[i]);
     }
     
	}

public void reverseArr() {
	
}



public static void main(String[] args) {
	ArrayOperations ap = new ArrayOperations();
}
}