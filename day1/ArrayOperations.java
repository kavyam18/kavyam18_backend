package day1;

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
	}
	
	
	//Printing the array
	public void printArr(int arr[]) {
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


//ZigZag array
public void zigZag(int[] arr1, int[] arr2) {
	int [] arr3=new int[arr1.length+arr2.length];
	int res=0;
	int i = 0, j = 0;
	while (i < arr1.length && j < arr2.length) {
		arr3[res++] = arr1[i++];
		arr3[res++] = arr2[j++];
	}
	while (i < arr1.length) {
		arr3[res++] = arr1[i++];
	}
	while (j < arr2.length) {
		arr3[res++] = arr2[j++];
	}
	for(int k=0;k<=arr3.length;k++) {
		System.out.println(arr3[k]);
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
	 int [] arr3=new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		while(i<arr1.length&&j<arr2.length) {
			if(arr1[i]==arr2[j]) {
				arr3[k++]=arr1[i++];
				j++;
			}
			else if(arr1[i]<arr2[j]) {
				arr3[k++]=arr1[i++];
			}
			else {
				arr3[k++]=arr2[j++];
			}
		while(i<arr1.length) {
			arr3[k++]=arr1[i++];
		}
		while(j<arr2.length) {
			arr3[k++]=arr2[j++];
		}
		for(int l=0;l<=arr3.length;l++) 
			System.out.println(arr3[l]);
		}
 }
 
 
 //Intersection of two array
 public void intersectionArray(int[] arr1, int[] arr2) {
	 int [] arr3=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					arr3[j++]=arr1[i];
				}
			}
		}
		for(int i=0;i<=arr3.length;i++) {
			System.out.println(arr3[i]);
		}
	}
	 
 
 //Remove the duplicate elements from the array
 public void removeDuplicates(int arr[]) {
	 int [] arr2=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++) {
			boolean n=true;
			for(int j=0;j<k;j++)
			{
				if(arr[i]==arr2[j]) {
					n=false;
					break;
				}
			}
			if(n)
				arr2[k++]=arr[i];
		}
		int[] n=new int[k];
		for(int i=0;i<n.length;i++) {
			n[i]=arr2[i];
		}
		for(int i=0;i<=n.length;i++) {
			System.out.println(n[i]);
		}
 }
 
 
 //No of occurrence array
 public void occurencyArray(int arr[],int key) {
	 int count=0;
	 for(int i=0;i<arr.length;i++) {

			if(arr[i]==key)
			{
             count++;
			}
		}
		System.out.println(count);	

 }
 
 
//Print the duplicate elements
 public void duplicateArray(int[] arr) {
	 int[] arr2=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr[i+1]) {
				arr2[i]=arr[i];
			}
		}
		for(int i=0;i<=arr2.length;i++) {
		System.out.println(arr2[i]);
	}
 }
 
 
 //Count the prime
 public void countPrime(int[] arr) {
	    int Count = 0;
	    for (int i = 0; i < arr.length; i++) {
	        int num = arr[i];
	        boolean isPrime = true;
	        if (num <= 1) {
	            isPrime = false;
	        } else {
	            for (int j = 2; j <= Math.sqrt(num); j++) {
	                if (num % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        } 
	        if (isPrime) {
	            Count++;
	        }
	    }
	   System.out.println(Count);
	}
 
 
	//main method
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	     System.out.println("Enter the first array size:");
	     int n = scan.nextInt();
	     
	     System.out.println("Enter the first array elements:");
	     int num1[] = new int[n];
	     for(int i=0;i<num1.length;i++) 
	     {
	    	 num1[i]=scan.nextInt();
	     }
	     System.out.println("Enter the key element to be search:");
	     int key = scan.nextInt();
//	     System.out.println("Enter the Second array size:");
//	     int k = scan.nextInt();
//	     System.out.println("Enter the second array elements:");
//	     int num2[] = new int[k];
//	     for(int i=0;i<num2.length;i++) 
//	     {
//	    	 num2[i]=scan.nextInt();
//	     }
		ArrayOperations ap = new ArrayOperations();
//		ap.createArray();
//        ap.printArr(num1);
//        ap.reverseArr(num1);
//        ap.sortArr(num1);
//        ap.mergeArr(num1, num1);
//        ap.zigZag(num1, num1);
//        ap.maxArray(num1);
//        ap.minArray(num1);
//        ap.unionArray(num1, num1);
//        ap.intersectionArray(num1, num1);
//        ap.removeDuplicates(num1);
//        ap.occurencyArray(num1, key);
//        ap.duplicateArray(num1);
        ap.countPrime(num1);
	}

}
