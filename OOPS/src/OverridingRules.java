class ParentClass {
	void show() {
		System.out.println("Parent Show Called...");
	}
}

class ChildClass extends ParentClass {
//	@Override
//	protected void show() {
//		System.out.println("Child Show Called...");
//	}
	@Override
	public void show() {
		System.out.println("Child Show Called...");
	}
}

public class OverridingRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
