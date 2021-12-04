interface K1 {
	void show();
	default void print() {
		System.out.println("this is print method of K1...");
	}
}

interface K2 {
	void show();
	default void print() {
		System.out.println("this is print method of K2...");
	}
}

interface K3 extends K1, K2 {

	@Override
	default void print() {
		// TODO Auto-generated method stub
		K1.super.print();
		K2.super.print();
		System.out.println("K3 Print Call...");
	}
	
}

class Caller implements K3 {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}

public class DefaultKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caller obj = new Caller();
		obj.show();
		obj.print();
	}

}
