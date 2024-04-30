package day1;

public class PatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Output:
		//1 1 1 1 1
		//1 1 1 1 1
		//1 1 1 1 1
		//1 1 1 1 1
		//1 1 1 1 1
		
//      int n=5;
//      for(int i=1;i<=n;i++) {
//    	  for(int j=1;j<=n;j++) {
//    		  System.out.print(i+ " ");//inside for loop is row which print the row values
//    	  }
//    	  System.out.println();
//      }
//	}
		//output:
		//1 2 3 4 5 
		//1 2 3 4 5
		//1 2 3 4 5
		//1 2 3 4 5
		//1 2 3 4 5
//		int n=5;
//	      for(int i=1;i<=n;i++) {
//	    	  for(int j=1;j<=n;j++) {
//	    		  System.out.print(j+ " ");//inside for loop is row which print the row values
//	    	  }
//	    	  System.out.println();
//	      }
//		}
		//Output:
		//1
		//2 3
		//3 4 5
		//4 5 6 7
		//5 6 7 8 9
		
		int n=5;
	      for(int i=1;i<=n;i++) {
	    	  int k=i;
	    	  for(int j=1;j<=i;j++) {
	    		  System.out.print(k+ " ");//inside for loop is row which print the row values
	    	  }
	    	  System.out.println();
	      }
		}
	
	

}

