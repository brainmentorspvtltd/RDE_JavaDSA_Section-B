/*
 * SOLID
 * S - SRP
 * D - DRY
 * O - Open Close Principle
 * class is open for extension but close for modification
 */

//final class Parent {
//	
//}
//
//class Child extends Parent {
//	
//}

class Parent {
	private int x;
//	final void show() {
//		System.out.println("Show function...");
//	}
	private final void show() {
		System.out.println("Show Function...");
	}
}

class Child extends Parent {
	void show() {
		System.out.println("Show Overrided...");
	}
}

public class FinalUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.show();
		final double pi = 3.14;
//		pi = 4.5;
	}

}
