package day5;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
       Function<String, Integer> f = s -> s.length();
       Function<String, String> f1 = s -> s.toUpperCase();
       System.out.println(f.apply("Kavya"));
       System.out.println(f1.apply("kavya"));
       System.out.println(f1.andThen(f).apply("anjali"));
	}

}
