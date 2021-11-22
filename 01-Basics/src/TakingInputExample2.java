import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TakingInputExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your ID : ");
		int id = scanner.nextInt();
		System.out.println("Id is "+id);
		
		scanner.nextLine();
		
		System.out.println("Enter your name : ");
		
		String name = scanner.nextLine();
		char e = name.charAt(0);
		String firstChar = String.valueOf(e);
		firstChar = firstChar.toUpperCase();
		name = firstChar + name.substring(1).toLowerCase();
		
//		System.out.println("Value of firstChar "+firstChar);
		System.out.println("Name is "+name);
		
		System.out.println("Enter your age : ");
		int age = scanner.nextInt();
		System.out.println("Age is "+age);
		
		
		System.out.println("Enter your salary : ");
		double salary = scanner.nextDouble();

		
//		Internationalization - I18N
		Locale locale = new Locale("en", "IN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		String formatSalary = nf.format(salary);
		
		System.out.println("Salary is : " + formatSalary);
		
		Date date = new Date();
//		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, locale);
		String dateFormat = df.format(date);
		System.out.println("Salary Slip Generated On : "+dateFormat);
		
		scanner.close();

	}

}
