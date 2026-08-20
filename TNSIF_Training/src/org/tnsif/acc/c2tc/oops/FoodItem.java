package org.tnsif.acc.c2tc.oops;

public class FoodItem {
	String name;
	double price;
	String category;
	void displayDetails() {
		System.out.println("Food Name:"+name);
		System.out.println("price:"+price);
		System.out.println("category:"+category);
		System.out.println("--------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodItem FoodItem1=new FoodItem ();
		FoodItem1.name="dosa";
		FoodItem1.price=70;
		FoodItem1.category="breakfast";
		FoodItem1.displayDetails();
		
		FoodItem FoodItem2=new FoodItem ();
		FoodItem2.name="set dosa";
		FoodItem2.price=70;
		FoodItem2.category="breakfast";
		FoodItem2.displayDetails();

	}

}
