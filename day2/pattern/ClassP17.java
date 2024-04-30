 package day2.pattern;

//		      1 
//	        0 1 0 
//	      1 0 1 0 1 
//	    0 1 0 1 0 1 0 
//	  1 0 1 0 1 0 1 0 1 

public class ClassP17{
     public static void main(String[] args) {
		int n=5
		int i,j,k;
		int x=1;
		for( i=1;i<=n;i++) {
			for( j=n-i;j>=0;j--) {
				System.out.print("  ");
			}
			for( k=1;k<=i*2-1;k++) {
				System.out.print(x%2+" ");
				x++;
			}

			System.out.println();
        }
}
}