package com.nisum.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

class Product{
	String name;
	int price;
	
	
	public Product(String name, int price) {
		//super();
		this.name = name;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
}

public class JavaStremExample {
	
	public static void main(String[] args) {
		
		/*List<Product> products = new ArrayList<Product>();
		
		products.add(new Product("mango",100 ));
		products.add(new Product("apple",200 ));
		products.add(new Product("banana",300 ));
		products.add(new Product("citrus",400 ));
		products.add(new Product("faluda",500 ));
		
		System.out.println(" Without using the streams");
		for(Product p:products) {
			if(p.price>300) {
				System.out.println(p);
			}
		}
		
		
		System.out.println(" with using the java streams");
		List<Integer> productList = products.stream()
								    .filter(p->p.price>300)
								    .map(p->p.price)
								    .collect(Collectors.toList());
		System.out.println(productList);
		
		
		Callable<String> run = ()->{
			return "hey thomas";
		};
		Thread t = new Thread(()->{
			System.out.println("hey thomas");
		});
		t.start();
		
		Thread trr = new Thread();
		trr.start();
		*/
		List<Integer> list=new ArrayList<Integer>();
		list.add(0);
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		System.out.println(list);
		int count = 0;
		for(Integer i: list) {
			list.add(count, i*i);
		}
		System.out.println(list);
	}

}
