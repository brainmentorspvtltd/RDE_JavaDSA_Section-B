import java.util.Scanner;

public class TakingMoreInputs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your ID : ");
		int id = scanner.nextInt();
		System.out.println("Id is "+id);
		
		scanner.nextLine();
		System.out.println("Enter your name : ");
		String name = scanner.nextLine();
		System.out.println("Name is "+name);
		
		System.out.println("Enter your age : ");
		int age = scanner.nextInt();
		System.out.println("Age is "+age);
		
		System.out.println("Enter your salary : ");
		double salary = scanner.nextDouble();
		System.out.println("Salary is : " + salary);
		
		scanner.close();
		
	}

}
