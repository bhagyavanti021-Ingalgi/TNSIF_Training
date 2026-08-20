package org.tnsif.acc.c2tc.scannerclass_bufferreader;
import java.util.Scanner;
public class ScannerCharDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name:");
		char ch=sc.next().charAt(0);
		System.out.println("the character in the name:"+ch);
		sc.close();
	}

}
