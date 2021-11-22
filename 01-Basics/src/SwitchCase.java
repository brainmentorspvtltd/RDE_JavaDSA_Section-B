public class SwitchCase {

	public static void main(String[] args) {
		
		int num = 10;
//		switch(num) {
//			case 5 : System.out.println("Case 5...");
//			break;
//			case 10 : System.out.println("Case 10...");
//			break;
//			case 15 : System.out.println("Case 15...");
//			break;
//			case 20 : System.out.println("Case 20...");
//			break;
//		}
		
//		switch(num) {
//		case 5 : System.out.println("Case 5...");
//		case 10 : System.out.println("Case 10...");
//		case 15 : System.out.println("Case 15...");
//		case 20 : System.out.println("Case 20...");
//		default : System.out.println("Default Case...");
//		}
		
		String language = "Java";
		String grade = "";
		switch(language) {
		case "Java" : grade = "A";
		break;
		case "Python" : grade = "B";
		break;
		case "PHP" : grade = "C";
		break;
		}
		
		System.out.println("Grade is :"+grade);

	}

}
