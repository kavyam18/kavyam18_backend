package com.myapp.spring.service;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.myapp.spring.domain.Product;

//@Service
public class ProductServiceImpl implements ProductService {

	private List<Product> products;
	
	public ProductServiceImpl(List<Product> products) {
		this.products = products;
	}
	
	@Override
	public List<Product> searchByPrice(Double price) {
		
//	return products.stream().filter(product -> product.getPrice() >= price)
//				.sorted(Comparator.comparing(Product::getPrice).thenComparing(Product::getProductName)).collect(Collectors.toList());
	
		//reuseable using predicate
		
		Predicate<Product> predicate = product -> product.price() >= price;
		return products.stream().filter(predicate)
				.sorted(Comparator.comparing(Product::price).thenComparing(Product::productName)).collect(Collectors.toList());
	}

	

}
