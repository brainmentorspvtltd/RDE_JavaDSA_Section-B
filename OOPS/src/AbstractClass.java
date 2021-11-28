abstract class Loan {
	void applyForLoan() {
		System.out.println("Apply for loan...");
	}
//	this method will be implemented by child class
	abstract void emi();
}

class HomeLoan extends Loan {
	@Override
	void applyForLoan() {
		System.out.println("Apply for Home Loan...");
	}
	
	@Override
	void emi() {
		System.out.println("EMI for Home Loan...");
	}
}

class CarLoan extends Loan {

	@Override
	void emi() {
		System.out.println("Car Loan EMI Function...");	
	}	
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Loan obj = new Loan();
	}

}
