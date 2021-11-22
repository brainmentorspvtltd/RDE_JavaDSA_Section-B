public class StringMethods {

	public static void main(String[] args) {
		String name = "Ravi";
//		String name2 = "Ravi";
		String name2 = name;
		String name3 = new String("Ravi");
//		compares reference
		System.out.println(name == name3);
//		compares value
		System.out.println(name.equals(name3));
		System.out.println(name.equalsIgnoreCase(name3));

	}

}
