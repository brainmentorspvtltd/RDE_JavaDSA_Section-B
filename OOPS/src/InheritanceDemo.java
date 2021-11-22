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
}

class CurrentAccount extends Account {
	double odLimit;
	void computeOD() {
		System.out.println("Over Draft limit is 1 Lakh");
	}
}


public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa = new SavingAccount();
		sa.withdraw();
		sa.deposit();
		sa.calculateROI();
		
		CurrentAccount ca = new CurrentAccount();
		ca.withdraw();
		ca.deposit();
		ca.computeOD();
	}

}
