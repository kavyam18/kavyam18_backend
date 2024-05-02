package day3;

public class ExceptionP2 {

	public static void main(String[] args) {
		try {
			
			int a=10;
			int b=10;
			int c=a+b/0;
			System.out.println(c);
			}
		catch(ArithmeticException e) {
			System.out.println(e);
			
		}
		 finally {  
			 System.out.println("finally block is always executed");  
			 }    
		System.out.println();
	}

}
