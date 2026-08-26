package org.tnsif.acc.c2tc.generics;

import java.util.ArrayList;
import java.util.List;

public class AfterGenerics {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		list1.add("apple");
		list1.add("23.2");// if we the values in not in the string it will show Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	//	The method add(String) in the type List<String> is not applicable for the arguments (double)

		//at org.tnsif.acc.c2tc.generics.AfterGenerics.main(AfterGenerics.java:11)
 
	}

}