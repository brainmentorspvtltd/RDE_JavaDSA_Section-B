public class TypePromotion {
	
	void show(byte x) {
		System.out.println("Byte x...");
	}
	void show(short x) {
		System.out.println("Short x...");
	}
//	void show(int x) {
//		System.out.println("Int x...");		
//	}
//	void show(long x) {
//		System.out.println("Long x...");
//	}
	void show(String x) {
		System.out.println("String x...");
	}
//	void show(Integer x) {
//		System.out.println("Integer x...");
//	}
//	void show(int ...x) {
//		System.out.println("Int var args x...");
//		for(int i : x) {
//			System.out.println(i);
//		}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypePromotion obj = new TypePromotion();
//		obj.show(10);
//		obj.show(10,2,2,5,7,4);
//		obj.show((byte) 5);
//		obj.show((short) 5);
		
//		Primitive Data Types
		int x = 10;
		
//		Wrapper Classes / Reference Variable
		Integer x1 = 10;	// Boxing
		Integer x2 = x;		// Boxing
//		Boxing - Conversion of primitive into object
//		Unboxing - Conversion of object into primitive
		
//		Unboxing
		int y1 = x1;
		int y2 = x2;
		
//		Byte b1 = 10;
		
		
	}

}
