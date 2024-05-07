package day6;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EvenNumList {

	public static void main(String[] args) {
		
		//Find even number in a list
		 List<Integer> asList = Arrays.asList(18,1,2,3,4,4,5,6,6,7,192,8);
		 List<Integer> collect = asList.stream().filter(e->e%2==0).collect(Collectors.toList());
		 System.out.println(collect);
		 
// forEach(System.out::println)  -->method refernce it will consume but return nothing.
          
		 //Check the element that starts with 1
		 asList.stream().map(e->e+"").filter(e->e.startsWith("1")).forEach(System.out::println);
		 asList.stream().map(e->Integer.toString(e)).filter(e->e.startsWith("1")).forEach(System.out::println);//another way to print ele starts with 1

		 //Find the duplicate element in a List
		 Set<Integer> set = new HashSet();
		 asList.stream().filter(e -> !set.add(e)).forEach(System.out::println);
		 
		 //Find the first element in the List
		 Integer orElse = asList.stream().findFirst().orElse(0);
		 System.out.println(orElse);
		 
		 //Find the first elements present in the list
		 System.out.println(asList.stream().distinct().count());
		 
		 //maximun element in the list
		Integer integer = asList.stream().max((e1,e2) -> e1.compareTo(e2)).get();
		System.out.println(integer);
		
		//Minimum element in the List
		Integer integer1 = asList.stream().min((e1,e2) -> e1.compareTo(e2)).get();
		System.out.println(integer1);
		
		//Find the first non repeated first character in the string
		String input = "java articles are awesome";
	    Character char1 = input.chars().mapToObj(c -> (char) c).filter(e ->input.indexOf(e)==input.lastIndexOf(e)).findFirst().get();
	    System.out.println("non-repeated first character:"+ char1);
	    
	    //Find the first non repeated characters in the string
	    String input1 = "java articles are awesome";
        input1.chars().mapToObj(c -> (char) c).filter(e ->input1.indexOf(e)==input1.lastIndexOf(e)).forEach(System.out::println);
//	    System.out.println(char2);
		 
	    //Find the first repeated character in the string
	    String input2 = "java articles are awesome";
	    Character char3 = input.chars().mapToObj(c -> (char) c).filter(e -> input.indexOf(e)!= input.lastIndexOf(e)).findFirst().get();
	    System.out.println("First repeated char:"+ char3);
	    
	  //Find the repeated character in the string
	    String input3 = "java articles are awesome";
	    System.out.println("Repeated characters are:");
	   input.chars().mapToObj(c -> (char) c).filter(e -> input.indexOf(e)!= input.lastIndexOf(e)).forEach(System.out::println);
	   
	    
	    //Sort the element
	    asList.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);
	    
	    //given an array repeated true if at least twice(after remove duplicate element the size of the array is equal to the original arraylist
	    int size = asList.stream().distinct().collect(Collectors.toList()).size();
	    System.out.println(size != asList.size());
	    
	    
	    //to perform cube on list elements and filter greater than 50 or not
	    asList.stream().map(e -> e*e*e).filter(e -> e > 50).forEach(System.out::println);
	    
	    //Count the number of character is present(Count the frequency of character)
	    String str = "AnjaliKavya";
	    Map<Character, Long> collect1= str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	    System.out.println(collect1);
	    
	    //Find the duplicate element with count 
	    List<String> names = Arrays.asList("AA","BB","AA","CC","AA");
	    names.stream().filter(e-> Collections.frequency(names, e)>1).collect(Collectors.
	    		        groupingBy(Function.identity(),Collectors.counting()))
	                    .forEach((str1,count) -> System.out.println(str1+"=====>"+count));
	    
	}

}
