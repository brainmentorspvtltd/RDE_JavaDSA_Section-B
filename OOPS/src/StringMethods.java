public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "    Ram Sharma";
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.substring(1,3));
		System.out.println(name.trim());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.concat("..."));
		System.out.println(name.contains("ma"));
		System.out.println(name.indexOf("a"));
		System.out.println(name.startsWith("A"));
		System.out.println(name.endsWith("a"));
		System.out.println(name.split(" "));
	}

}
