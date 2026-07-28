package org.tnsif.acce.c2tc.oops;
public class Abstraction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BhagyaDemo obj=new Ramesh();
		obj.calling();
		obj.aiIntegration();
		obj.satelliteComm();
		obj.healthMonitoring();
	}

}
abstract class BhagyaDemo{
	void calling() {
		System.out.println("Phone is having calling funcationallity");
	}
	abstract void aiIntegration();
	abstract void satelliteComm();
	abstract void healthMonitoring();
}
abstract class Pooja extends BhagyaDemo
 {
	@Override//anotation 
	void aiIntegration() {
		System.out.println("Phone is Intergated with AIIntegration");
		
	}
	@Override
	abstract void satelliteComm();

	@Override
	abstract void healthMonitoring();
	 
 }
class Ramesh extends Pooja{

	@Override
	void satelliteComm() {
		System.out.println("Phone is Intergated with satelliteComm ");
		
	}

	@Override
	void healthMonitoring() {
		System.out.println("Phone is Intergated with healthMonitoring ");
		
	}
	
}