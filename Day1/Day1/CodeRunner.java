package Day1;

import java.util.Scanner;

public class CodeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub                                  
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = scan.nextInt();
      System.out.println("Enter the array value");
      int[] array = new int[size];
      for(int i=0;i<array.length;i++) 
      {
    	  array[i]=scan.nextInt();
      }
      for(int i=0;i<array.length;i++) 
      {
    	  for(int j=i;j<array.length-1;j++)
    	  {
    		  if(array[i]<array[j]) 
    		  {
    			  int temp = array[j];
                  array[j] = array[i];
                  array[i] = temp;
    		  }
    	  }
    	  
      }
      System.out.println("Sorted array:");
      for(int i = 0; i < array.length; i++) {
          System.out.print(array[i] + " ");
      
      }
}
}