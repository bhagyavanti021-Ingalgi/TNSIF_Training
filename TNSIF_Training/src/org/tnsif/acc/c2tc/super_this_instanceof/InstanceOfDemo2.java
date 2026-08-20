package org.tnsif.acc.c2tc.super_this_instanceof;

class PaymentMethod{
	void makePayment() {
		System.out.println("Processing Payment");
	}
}
class CreditCard extends PaymentMethod{
	void swipeCard() {
		System.out.println("swiping credit card");
	}
}
class Paypal extends PaymentMethod{
	void loginToPaypal() {
		System.out.println("logging inTo Paypal");
	}
}
public class InstanceOfDemo2 {

	public static void main(String[] args) {
		PaymentMethod payment =new PaymentMethod();
		payment=new CreditCard();
		if(payment instanceof CreditCard) {
			CreditCard cc=(CreditCard)payment;
			cc.swipeCard();
		}
		else{
			Paypal pp=(Paypal)payment;
			pp.loginToPaypal();
		}
		// TODO Auto-generated method stub

	}

}
