package day5;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamConcat {

	public static void main(String[] args) {
          List<Integer> l1 = Arrays.asList(1,2,3,4,5);
          List<Integer> l2 = Arrays.asList(2,3,4,5);
          
//         l1.stream().distinct().forEach(System.out::println);
     
//         Optional<Integer> first = l1.stream().filter(ele -> ele%2==0).findFirst();
//         first.isPresent();
         
         
//         if(first.isPresent())
//        	 System.out.println(first.get());
//        	 System.out.println(first.orElseGet(()->0));
//         first.orElseThrow(()->{throw new IllegalArgumentException("no even numbers");});
        
         
//          Long count = l1.stream().count();//-->it will count the number of elements in the first array
//          System.out.println(count);
          
         Stream<Integer> s1 = l1.stream();
         Stream<Integer> s2 = l2.stream();
          
         List<Integer> result = Stream.concat(s1, s2).distinct().collect(Collectors.toList());//--->concate the two array and remove duplicate elements use distinct()
         System.out.println(result);
	}



}
