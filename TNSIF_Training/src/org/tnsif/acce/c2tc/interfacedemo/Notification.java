package org.tnsif.acce.c2tc.interfacedemo;

@FunctionalInterface
interface Notification
{
	void notifyUser(String message);
	
}
class EmailNotification implements Notification

{

	@Override
	public void notifyUser(String message) {
		System.out.println("Sending Email "+message);
		
	}
	
}
class SMSNotification implements Notification
{

	@Override
	public void notifyUser(String message) {
		System.out.println("Sending SMS "+message);
		
	}
	
}



