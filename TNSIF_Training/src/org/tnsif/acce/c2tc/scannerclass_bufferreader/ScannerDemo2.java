package org.tnsif.acce.c2tc.scannerclass_bufferreader;
import java.util.Scanner;
class Student
{
	int id;
	String name;
	static String collegename="Cambridge";
	
	
	Student(int i ,String n)
	{
		id=i;
		name=n;
	}
	void display() {
		System.out.println("Id : "+ id +" " +"Name :"+name+" " +"CollegeName : "+collegename);
	}
}
public class ScannerDemo2 {
	public static void main(String[] args) {
		Student student=new Student(12,"Sushma");
		Student student1=new Student(13,"Anil");
		Student.collegename="CITNC";
        student.display();
        student1.display();

	}

}