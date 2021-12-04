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
	}

}
