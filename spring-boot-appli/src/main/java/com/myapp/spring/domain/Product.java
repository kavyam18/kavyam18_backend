package com.myapp.spring.domain;
// record is immutable instead of using final class we use record 
public record Product(Integer productId, String productName, Double price) implements Comparable<Product> {

	@Override
	public int compareTo(Product o) {
		
		return o.price().compareTo(this.price);
	}

	
}
