package org.tnsif.acce.c2tc.interfacedemo;

public class SmartLight  implements SmartDevice {
	public void turnOn() {
		System.out.println("SmartLight is on");
		
	}

	public void turnoff() {
		System.out.println("SmartLight is off");
	}

	public void getStatus() {
		System.out.println("SmartLight has some status");
	}

	public static void main(String[] args) {
		SmartDevice light=new SmartLight();
		light.turnOn();
		light.turnoff();
		light.getStatus();

	}

	

}
