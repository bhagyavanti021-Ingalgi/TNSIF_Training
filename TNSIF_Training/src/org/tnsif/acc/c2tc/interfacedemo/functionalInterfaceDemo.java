package org.tnsif.acc.c2tc.interfacedemo;

public class functionalInterfaceDemo {

	public static void main(String[] args) {
		Notification email=new EmailNotification();
		email.notifyUser("Meeting at 10am");
		
		Notification sms=new SMSNotification();
		sms.notifyUser("Assignment uploaded");
		
	}

}