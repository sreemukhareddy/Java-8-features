package com.nisum.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Item{
	
	public Item(String string, int i) {
		this.name=string;this.price=i;
	}
	int price;
	String name;
	
	public String toString(){
		return name + " " + price;
	}
}

public class MapTest {
	
	public static void main(String[] args) {
		
		List<Item> items = new ArrayList<Item>();
		
		items.add(new Item("Laptop",10000));
		items.add(new Item("Bag",1000));
		items.add(new Item("phone",10000));
		items.add(new Item("wire",150));
		items.add(new Item("bottle",100));
		items.add(new Item("cup",10));
		
		
		List<Item> items1=new ArrayList<>();	
		items1=items.stream().map(i->
		{
			i.name=i.name.toUpperCase();
			return i;
		}
				
				).collect(Collectors.toList());
		
		/*items.forEach(i->System.out.println(i));
		items1.forEach(i->System.out.println(i));*/
		
		/*List<Item> items2=new ArrayList<>();
		items.stream().forEach(i->{
			if(i.price==1000) {
			i.price=1500;
			i.name=i.name.toUpperCase();
		}
			});
		
		items.forEach(i->System.out.println(i));*/
		
		List<Item> items3=new ArrayList<Item>();
		items3 = items.stream().filter(
				i->( i.name.equalsIgnoreCase("b") || i.name.toLowerCase().startsWith("b") )
				).map(i->{
					i.name=i.name.toLowerCase();
					return i;
				}	
						).collect(Collectors.toList());
		
		
		
		
	      /* int l = (int) items.stream().filter(i->i.name.startsWith("B")).count();
	        System.out.println("Number of Matching Element:"+l);*/
	        items3.forEach(i->System.out.println(i));
	        
	        
	        
		
	}

}
