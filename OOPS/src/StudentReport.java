import java.util.Scanner;

//Encapsulation - Wrapping of variable and methods in single unit
//- that is known as class
//Data hiding - make member variables private
//Good Encapsulation - Data Hiding + Encapsulation

public class StudentReport {
	private int rollno;
	private String name;
	private String course;
	private String branch;
	private double fees;
	private String collegeName;
	
	public StudentReport() {
		this.collegeName = "RDEC";
		System.out.println("Object Created inside Default...");
	}
	
	public StudentReport(int rollno, String name, String course, String branch, double fees) {
		this();
		System.out.println("Object Created");
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		this.branch = branch;
		this.fees = fees;
	}
	
//	public void takeInput(int rollno, String name, String course, String branch, double fees) {
	public void takeInput() {
		System.out.println("Welcome to : " + this.collegeName);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Roll No : ");
		this.rollno = scanner.nextInt();
		System.out.println();
		
		System.out.print("Enter Name : ");
		scanner.nextLine();
		this.name = scanner.nextLine();
		System.out.println();
		
		System.out.print("Enter Course : ");
		this.course = scanner.nextLine();
		System.out.println();
		
		System.out.print("Enter Branch : ");
		this.branch = scanner.nextLine();
		System.out.println();
		
		System.out.print("Enter Fees : ");
		this.fees = scanner.nextDouble();
		System.out.println();
		
//		scanner.close();
	}
	
	public void showDetails() {
		System.out.println("Welcome to : " + this.collegeName);
		System.out.println("Roll No : " + this.rollno);
		System.out.println("Name : " + this.name);
		System.out.println("Course : " + this.course);
		System.out.println("Branch : " + this.branch);
		System.out.println("Fees : " + this.fees);
	}
	
}
