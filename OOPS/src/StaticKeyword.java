class Customer {
//	static variables are class variables
	static int auto_inc;
//	static int id;
	int id;
	String name;
	double balance;
	
	static {
		auto_inc = 1000;
		System.out.println("Static block executed...");
	}
	
	Customer(String name, double balance) {
		auto_inc++;
//		this.id++
		this.id = auto_inc;
		this.name = name;
		this.balance = balance;
		System.out.println("Object Created...");
	}
}

public class StaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer ram = new Customer("Ram", 45000.00);
		System.out.println("Customer ID : "+ram.id);
		System.out.println("Customer Name : "+ram.name);
		
		Customer shyam = new Customer("Shyam", 45000.00);
		System.out.println("Customer ID : "+shyam.id);
		System.out.println("Customer Name : "+shyam.name);
		
		System.out.println("Customer ID : "+ram.id);
		System.out.println("Customer Name : "+ram.name);

	}

}
