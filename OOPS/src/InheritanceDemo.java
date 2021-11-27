import java.util.Date;

class Account {
	int accNo;
	double balance;
	String name;
	Date opening;
	boolean status;
	void openAcc() {
		Date date = new Date();
		System.out.println("Open account on : " + date);
	}
	void deposit() {
		System.out.println("Deposit Call...");
	}
	void withdraw() {
		System.out.println("Withdraw Call...");
	}
}

class SavingAccount extends Account {
	double minBalance;
	void calculateROI() {
		System.out.println("Saving Account ROI is : 5%");
	}
	@Override
	void withdraw() {
		System.out.println("Withdraw Limit for SA is 50000");
	}
}

class CurrentAccount extends Account {
	double odLimit;
	void computeOD() {
		System.out.println("Over Draft limit is 1 Lakh");
	}
	@Override
	void deposit() {
		System.out.println("Deposit Limit for CA is 100000");
	}
}


public class InheritanceDemo {
	
//	Polymorphic call
//	Upcasting and Downcasting
	void caller(Account acc) {
		acc.withdraw();
		acc.deposit();
		
		if(acc instanceof SavingAccount) {
//			Downcasting
			SavingAccount sa = (SavingAccount) acc;
			sa.calculateROI();
		}
		else if(acc instanceof CurrentAccount) {
			CurrentAccount ca = (CurrentAccount) acc;
			ca.computeOD();
		}
		
		System.out.println("===============");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SavingAccount sa = new SavingAccount();
//		sa.withdraw();
//		sa.deposit();
//		sa.calculateROI();
//		
//		CurrentAccount ca = new CurrentAccount();
//		ca.withdraw();
//		ca.deposit();
//		ca.computeOD();
		
//		SavingAccount object is larger, because
//		it has its own features as well as features
//		coming from parent class
//		Account account = new SavingAccount();
//		account.withdraw();
		
//		account = new CurrentAccount();
//		account.withdraw();
//		account.deposit();
		
		InheritanceDemo obj = new InheritanceDemo();
		obj.caller(new SavingAccount());
		obj.caller(new CurrentAccount());
		
	}

}
