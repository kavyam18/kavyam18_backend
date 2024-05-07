package day6;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Program {

	public static void main(String[] args) {
     
		//Separate odd and even numbers
		List<Integer> asList = Arrays.asList(18,1,2,3,4,4,5,6,6,7,192,8);
		List<Integer> asList1 = Arrays.asList(3,4,5,6,7,192,8);
		
	    Map<Boolean, List<Integer>> input =	asList.stream().collect(Collectors.partitioningBy(i->i%2!=0));
         System.out.println(input);
         
        //sort the list in reverse order
         System.out.println("Sorted reverse order:");
         asList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
         System.out.println();
         
        //print the multiples of 5 from the list
         List<Integer> asList2 = Arrays.asList(1,5,20,4,25,30,15,16,18,40);
         System.out.println("multiples of 5 are:");
          asList2.stream().filter(i->i%5==0).forEach(System.out::println);
       
       //merge two unsorted array into single sorted array
          System.out.println();
          int[] a = {1,5,2,4,3,8};
          int[] b = {6,8,7,9};
          System.out.println("Sorted array:"); 
          IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().forEach(System.out::print);
          
       //merge two unsorted array into single sorted array without duplicates
          System.out.println();
          System.out.println("Sorted array without duplicates:");
          IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().forEach(System.out::print);
          
      //Three maximum and minimum numbers in the list
          System.out.println();
          System.out.println("first 3 minimum:");
          asList.stream().sorted().limit(3).forEach(System.out::println);
          System.out.println();
          System.out.println("first 3 maximum:");
          asList.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
          
      //sort list of strings in the increasing order of their length
          System.out.println();
          List<String> str = Arrays.asList("WWWW","A","BB","1XXXXX","CCC");
          System.out.println("Sorted StringList in their length ");
          str.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
          
      //Sum and average of all elements of an array
          int[] Array = {1,2,3,4,5,6,7};
          System.out.println();
          System.out.println("Sum of all the elements:");
          int c=Arrays.stream(Array).sum();
          System.out.println(c);
          System.out.println("Average of all the elements:");
          double avg = Arrays.stream(Array).average().getAsDouble();
          System.out.println(avg);
     
     
      //Reverse an integer Array
          System.out.println("Reverse an integer array");
          IntStream.rangeClosed(1, Array.length).map(i->Array[Array.length-i]).forEach(System.out::print);
          
     //Palindrome program
          String str1 = "malayalam";
          System.out.println("Palindrome are:");
          boolean str2 = IntStream.range(0, str1.length()/2).noneMatch(i->str1.charAt(i)!=str1.charAt(str1.length()-i-1));
          System.out.println(str2);
          
     //Last element of an array
      
          System.out.println("Last element of an array:");
          Integer s =  asList.stream().skip(asList.size()-1).findFirst().get();
          System.out.println(s);
          
     //Age of person in years
          System.out.println("Age of person in years:");
       LocalDate birthday = LocalDate.of(2000, 4, 18);
       LocalDate today = LocalDate.now();
       System.out.println(ChronoUnit.YEARS.between(birthday, today));
          
     //Remove duplicate elemenets from list
          
          System.out.println("Remove duplicate elements from list:");
          asList.stream().distinct().collect(Collectors.toList()).forEach(System.out::print);
     
     //Frequency of each element in an array
          System.out.println();
          System.out.println("Frequency of each element of an array:");
          Map<Integer, Long> i =  asList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
          System.out.println(i);
       
     //join the list of strings with prefix,suffix and delimiter
          System.out.println("Sring with delimitor,suffix,prefix:");
          String str3 = "hii good morning";
          String sp = str.stream().collect(Collectors.joining("zz","uu","vv"));
          System.out.println(sp);
          
     //maximun and minimum in alist
         System.out.println("Maximum in a list:");
         int l= asList.stream().max(Comparator.naturalOrder()).get();
//         asList.stream().sorted().findFirst().get();--->another method to find min
         asList.stream().sorted(Comparator.reverseOrder()).findFirst().get();
         System.out.println(l);
         System.out.println("Minimum in a list:");
         int f = asList.stream().min(Comparator.naturalOrder()).get();
         System.out.println(f);
         
     //Anagram in java 8
        String str7 ="Race";
        String str8="care";
        str7 = Stream.of(str7.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String str9 = Stream.of(str8.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        System.out.println("Anagarm :");
        Boolean sa = Optional.ofNullable(str7).map(e->e.equals(str9)).get();
        System.out.println(sa);
        
     //sum of all digits of a number
       System.out.println("sum of all digits :");
       int num =76544762;
       Integer total = Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
       System.out.println(total);
        
    //Second Largest element in an integer array
       System.out.println("Second largest element in an array:");
      Integer in = asList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
      System.out.println(in);
      
    //Common elements between the two array
   
      System.out.println("Common elements in the array:");
      asList.stream().filter(asList2::contains).forEach(System.out::println);
      
   // Reverse each word of a string
      String s8 = "AnjaliMouna";
      System.out.println("Reverse each word of a string:");
      String string =  Arrays.stream(s8.split(" ")).map(word->new StringBuffer(word).reverse()).collect(Collectors.joining());
      System.out.println(string);
      
   //Sum of First 10 natural numbers
      System.out.println("Sum of First 10 natural numbers:");
      int number = IntStream.range(1, 15).sum();
      System.out.println(number);
      
   //Find the String starts with number
      System.out.println("String starts numbers:");
      str.stream().filter(strings -> Character.isDigit(strings.charAt(0))).forEach(System.out::println);
      
   //Find the duplicate elements from an array
      System.out.println("duplicate elements from an array:");
     HashSet<Integer> set = new HashSet();
     Set<Integer> dup =  asList.stream().filter(e->! set.add(e)).collect(Collectors.toSet());
     System.out.println(dup);
      	
   //  Fibonacci series
     System.out.println("Fibonacci series:");
     Stream.iterate(new int[] {0,1} ,fib -> new int[] {fib[1],fib[0]+fib[1]}).limit(10).map(fib -> fib[0]).forEach(j -> System.out.print(j+ " "));
     
    
	}

}