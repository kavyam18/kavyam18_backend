package day2.pattern;

//101010
//101010
//101010
//101010
//101010

public class ClassP30 {

	public static void main(String[] args) {
         int n=5;
         for(int i=1;i<=n;i++) {
        	 if(i%2==0) {
        		 int num=0;
        		 for(int j=1;j<=5;j++) {
        			 System.out.print(num);
        			 num = (num==0)?1:0;
        		 }
        	 }else {
        		 int num = 1;
        		 for(int j=1;j<=n;j++) {
        			 System.out.print(num);
        		 }
        
        	 }
        	 System.out.println();
         }

	}

}
