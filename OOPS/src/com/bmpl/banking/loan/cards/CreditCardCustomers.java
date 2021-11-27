package com.bmpl.banking.loan.cards;

import com.bmpl.banking.loan.users.Customers;

public class CreditCardCustomers extends Customers {
//public class CreditCardCustomers extends DebitCardCustomers {
	
	void showCustomerDetails() {
		Customers obj = new Customers();
		System.out.println(obj.name); // public...
		System.out.println(age);  // protected...
//		System.out.println(occupation); // default
	}
	
	void showCustomerDebit() {
		System.out.println("Show credit card");
		DebitCardCustomers db = new DebitCardCustomers();
//		String name = d_card_name;
//		String cvv = d_cvv;
//		System.out.println(card_num);
	}

}
