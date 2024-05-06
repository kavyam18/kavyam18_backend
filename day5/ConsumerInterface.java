package day5;

import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String[] args) {
  
		
	Consumer<String> c = s -> System.out.println(s);
    Consumer<String> c1 = s -> System.out.println(s.length());
    c.accept("John");
    c.andThen(c1).accept("Oliver");

	}

}
