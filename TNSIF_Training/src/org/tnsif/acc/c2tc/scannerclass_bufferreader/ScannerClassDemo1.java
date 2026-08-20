package org.tnsif.acc.c2tc.scannerclass_bufferreader;
import java.util.Scanner;

public class ScannerClassDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name:");
		String name=sc.nextLine();
		System.out.println("enter the age of the person:");
		int age=sc.nextInt();
		System.out.println("name of the person:"+name);
		System.out.println("Age of the person:"+age);
	}

}
