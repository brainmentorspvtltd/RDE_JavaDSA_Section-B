class Customer {
	static int id = 100;
	String name;
	double balance;
	
	Customer(String name, double balance) {
		this.id++;
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
