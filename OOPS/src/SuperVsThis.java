class X {
	X() {
		System.out.println("Default const. of X");
	}
	X(int a) {
		this();
		System.out.println("Param. const of X...");
	}
}

class Y extends X {
	Y() {
		super(10);
		System.out.println("Default const. of Y");
	}
	Y(int x) {
//		super(); // it is written internally
		this();
		System.out.println("Y Param. Called...");
	}
}

public class SuperVsThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Y obj = new Y();
		Y obj = new Y(10);
	}

}
