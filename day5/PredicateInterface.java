package day5;

import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {
       Predicate<Integer>  p =  a -> (a>18);
       System.out.println( p.test(20)); 

	}

}
