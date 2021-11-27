class X1 {
	int z;
	X1() {
		z = 100;
		System.out.println("Default Const. of X1");
	}
	X1(int x) {
		this(); // will call default const. of X1
		System.out.println("Param. Const. of X1");
	}
}

class Y1 extends X1 {
	int t;
	int z;
	Y1() {
		super(10);	// param const of X1
		z = 50;
	}
	Y1(int z) {
		this();  // default const of Y1
		int n = super.z + this.z + z;
		System.out.println("Output is : "+n);
	}
}

public class SuperVsThisEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y1 obj = new Y1(10);
	}

}
