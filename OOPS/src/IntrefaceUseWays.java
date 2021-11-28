//the interfaces in which we have only 1 method
@FunctionalInterface
interface Calc {
	int compute(int x, int y);
}

class MyCalc implements Calc {
	@Override
	public int compute(int x, int y) {
		return x + y;
	}
}

public class IntrefaceUseWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Class Way
//		MyCalc obj = new MyCalc();
//		int res = obj.compute(12, 10);
//		System.out.println("Result is : " + res);
		
//		Object Way - when we will create object, class will 
//		be loaded - anonymous class
//		class ___ implements Calc {	}
//		Calc obj = new Calc() {
//			public int compute(int x, int y) {
//				int z = this.multiply(x, y);
//				return z;
//			}
//			int multiply(int x, int y) {
//				return x * y;
//			}
//		};
		
//		System.out.println(obj.compute(12, 11));
//		System.out.println(obj.multiply(10,20));
		
//		Lambda Expression
//		these are for sam (single abstract method) interface
		Calc c = (a,b) -> a * b;
		System.out.println(c.compute(10, 20));
		
		Calc c1 = (a,b) -> {
			int d = a + b;
			System.out.println("result is : "+d);
			return d;
		};
		System.out.println(c1.compute(12, 10));

	}

}
