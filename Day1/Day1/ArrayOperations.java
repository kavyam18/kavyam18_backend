package Day1;

import java.util.Scanner;

public class ArrayOperations {

	//Creating and printing the array
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

	//Reverse the array
public void reverseArr(int[] arr) 
{
	System.out.println("Enter the reverse array elements:");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
}
//descending array or asscending array
public void sortArr(int[] arr) 
{
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i;j<arr.length;j++)
		{
		if(arr[i]<arr[j]) 
		{
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
	  }
		System.out.println(arr[i]);
	}
}

//merge the two array
public void mergeArr(int arr1[], int arr2[] )
{
	int arr3[] = new int[arr1.length+arr2.length];
	int j=0;
	for(int i=0;i<arr1.length;i++) {
		arr3[j]=arr1[i]; 
		j++;
	}
	for(int i=0;i<arr2.length;i++) {
		arr3[j]=arr2[i];
		j++;
	}
	for(int i=0;i<arr3.length;i++)
	{
		System.out.println(arr3[i]);
	}
	
}

//find the maximum element  of array
 public void maxArray(int[] arr) {
	 int max = arr[0];
	 for(int i=1;i<arr.length;i++) {
		 if(arr[i] > max)
		 {
			 max = arr[i];
		 }
	 }
	 System.out.println(max);
 }
 
 //find the minimum element of array
 public void minArray(int[] arr) {
	 int min = arr[0];
	 for(int i=1;i<arr.length;i++) {
		 if(arr[i]<min) 
		 {
			 min = arr[i];
		 }
	 }
	 System.out.println(min);
 }
 
 //Union of two array
 public void unionArray(int[] arr1, int arr2[]) 
 { 
	 int arr3[] = new int[arr1.length+arr2.length];
	 for(int i=0;i<arr1.length;i++) {
		 for(int j=0;j<arr2.length;j++) {
			 if(arr1[i]>arr2[j]) {
				 int temp = arr2[j];
				 arr2[j] = arr1[i];
				 arr1[i] = temp;
				 temp = arr3[i];
			 }
		 }
		 System.out.println(arr3[i]);
	 }
 }
 
 //Rmove the duplicate elements from the array
 public void removeDuplicates() {
	 
 }

	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	     System.out.println("Enter the first array size:");
	     int n = scan.nextInt();
	     System.out.println("Enter the first array elements:");
	     int num1[] = new int[n];
	     for(int i=0;i<num1.length;i++) 
	     {
	    	 num1[i]=scan.nextInt();
	     }
	     System.out.println("Enter the Second array size:");
	     int k = scan.nextInt();
	     System.out.println("Enter the second array elements:");
	     int num2[] = new int[k];
	     for(int i=0;i<num2.length;i++) 
	     {
	    	 num2[i]=scan.nextInt();
	     }
		ArrayOperations ap = new ArrayOperations();
//		ap.createArray();
//		ap.reverseArr(num1);
//		ap.sortArr(num1);
//		ap.maxArray(num1);
//		ap.minArray(num1);
//		ap.mergeArr(num1, num2);
		ap.unionArray(num1, num2);
	}

}
