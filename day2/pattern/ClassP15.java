        package day2.pattern;
        
        //              1 
		//		      1 0 1 
		//		    1 0 1 0 1 
		//		  1 0 1 0 1 0 1 
		//		1 0 1 0 1 0 1 0 1 

		public class ClassP15{
		 public static void main(String[] args){
		int n=5
		for(int i=1;i<=n;i++) {
			for(int j=n-i-1;j>=0;j--) {
				System.out.print("  ");
			}
			for(int j=1;j<=i*2-1;j++) {

				System.out.print(j%2+" ");
			}
			System.out.println();
        }
        }
        }