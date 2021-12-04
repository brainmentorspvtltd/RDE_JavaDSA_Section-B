interface I1 {
	int x = 10;
	void show();
}

interface I2 {
	int x = 20;
	void show();
}

interface I3 extends I1, I2 {
	int x = 30;
	void show();
}

class C1 implements I3, I1, I2 {
	@Override
	public void show() {
		System.out.println("Show method called...");
		System.out.println(I1.x + I2.x + I3.x);
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
