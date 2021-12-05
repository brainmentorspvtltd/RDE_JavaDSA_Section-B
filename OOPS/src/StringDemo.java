public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Ravi";
		String name2 = name;
		System.out.println(name == name2); // checks reference
		System.out.println(name.equals(name2)); // checks value
		
		String name3 = new String("Ravi");
		System.out.println(name == name3); // checks reference
		System.out.println(name.equals(name3)); // checks value
		
		String t = "hello";
		String y = t;
		t = t + " there...";	// it will create a new memory
		System.out.println(t);
		
		
		// will create an array of 16 size
//		StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity() + " : " + sb.length());
		sb.append("Hello");
		System.out.println(sb.capacity() + " : " + sb.length());
		sb.append("How are you...???");
		System.out.println(sb.capacity() + " : " + sb.length());
		
//		if default capacity(16) cross :
//			formula = old capacity * 2 + 2
//			+2 for full stop (null character)
//		after a particular length it will make length = capacity
		
		sb.append("I am fine........");
		System.out.println(sb.capacity() + " : " + sb.length());
		
		// we can create fixed buffer size
		StringBuffer sb2 = new StringBuffer(20);
		sb2.append("How are you.......???");
		System.out.println(sb2.capacity() + " : " + sb2.length());
		
	}

}
