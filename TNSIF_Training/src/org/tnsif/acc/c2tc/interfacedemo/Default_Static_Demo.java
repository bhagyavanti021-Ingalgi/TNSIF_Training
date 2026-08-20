package org.tnsif.acc.c2tc.interfacedemo;

public class Default_Static_Demo {
	public static void main(String[] args) {
		Vehicle car=new Car("KIA");
		Vehicle bike=new Bike("RX 100");
		
		car.start();
		car.stop();
		
		bike.start();
		bike.stop();
		
	    car.repair();
	    bike.repair();
	    
	    Vehicle.checkMaintaince();
	   
	    System.out.println("MaxSpeed "+Vehicle.Max_speed);

	}
}
