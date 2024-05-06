package day5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMethod {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2);
		List<Integer> list2 = Arrays.asList(3,4);
		List<Integer> list3 = Arrays.asList(4,5);
		
      List<List<Integer>> finalList = Arrays.asList(list1, list2, list3);
       
      
      List<Integer> flatMap = finalList.stream().flatMap(x-> x.stream()).collect(Collectors.toList());
      List<Integer> flatMap1 = finalList.stream().flatMap(x-> x.stream()).distinct().collect(Collectors.toList());
      List<Integer> result = finalList.stream().flatMap(x-> x.stream()).map(n->n+1).collect(Collectors.toList());
      
      System.out.println(flatMap);
      System.out.println(flatMap1);
      System.out.println(result);
	}

}
