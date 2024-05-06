package day5;

import java.util.function.Supplier;

public class SupplierInterface {

	public static void main(String[] args) {
          Supplier<String> otp = () ->{
        	  String s=" ";
        	  for(int i=0;i<6;i++) {
        		  s=s+(int)(Math.random()*10);
        	  }
        	  return s;
          };
          System.out.println(otp.get());

	}

}
