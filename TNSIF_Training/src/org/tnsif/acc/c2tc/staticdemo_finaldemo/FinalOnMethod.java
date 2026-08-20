package org.tnsif.acc.c2tc.staticdemo_finaldemo;

class Bank {
    void security_Rule() {
        System.out.println("Bank security rule");
    }
}

class SBI extends Bank {
    @Override
    void security_Rule() {
        System.out.println("SBI security rule");
    }
}
public class FinalOnMethod {

	public static void main(String[] args) {
		SBI sbi=new SBI ();
		sbi.security_Rule();

	}

}