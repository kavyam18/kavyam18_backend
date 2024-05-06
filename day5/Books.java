package day5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Books {

	public Books(String string, int i, int j, int k) {
		
	}

	public static void main(String[] args) {
      List<Books> li = new ArrayList<>();
		Books b1 = new Books("java", 330, 150, 5);
		Books b2 = new Books("react", 150, 100, 2);
		Books b3 = new Books("html", 100, 79, 8);
		Books b4 = new Books("css", 250, 200, 6);
		Books b5 = new Books("javascript", 230, 170, 4);
		li.add(b1);
		li.add(b2);
		li.add(b3);
		li.add(b4);
		li.add(b5);
		
		
		Long count = li.stream().collect(Collectors.counting());
		System.out.println("Books Available:" + count);
		
//		int totalQuantity = li.stream().collect(Collectors.toList());
//		System.out.println("Total quantity" + totalQuantity);
	}

}
