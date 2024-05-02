package day3;

public class ExceptionP1 {

	public static void main(String[] args) {
		try{  
		      int n = 100/0;  
		   }catch(ArithmeticException e)
		{
			   System.out.println(e);
		}  
		   System.out.println();  
		  }  

}
