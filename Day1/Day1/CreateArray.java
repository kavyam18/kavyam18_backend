package Day1;

import java.util.Scanner;

public class CreateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the size of an array:");
     int size = scan.nextInt();
     int arr[] = new int[size];
     System.out.println("Enter the array elements:");
     for(int i=0;i<arr.length;i++)
     {
    	 arr[i]=scan.nextInt();
     }
     System.out.println("Display the array elements:");
     for(int i=0;i<arr.length;i++) {
    	 System.out.println(arr[i]);
     }
	}

}
