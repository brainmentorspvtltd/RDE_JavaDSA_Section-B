public class Student {
	
	int rollno;
	String name;
	String course;
	String branch;
	double fees;
	
	public void takeInput(int rollno, String name, String course, String branch, double fees) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		this.branch = branch;
		this.fees = fees;
	}
	
//	DRY - Donot Repeat Yourself
	public void showDetails() {
		System.out.println("Roll No is : " + this.rollno);
		System.out.println("Name is : " + this.name);
		System.out.println("Course is : " + this.course);
		System.out.println("Branch No is : " + this.branch);
		System.out.println("Fees No is : " + this.fees);
		System.out.println("=========================");
	}

	public static void main(String[] args) {
		
//		1. Default Constructor will be called
//		2. Student class object is created
//		3. reference of object will be stored in ram variable
		Student ram = new Student();
		
//		System.out.println("Roll No is : " + ram.rollno);
//		System.out.println("Name is : " + ram.name);
//		System.out.println("Course is : " + ram.course);
//		System.out.println("Branch No is : " + ram.branch);
//		System.out.println("Fees No is : " + ram.fees);
		
		System.out.println("==============================");
		
//		ram.rollno = 12;
//		ram.name = "Ram";
//		ram.course = "MCA";
//		ram.branch = "IT";
//		ram.fees = 1200.00;
		
		ram.takeInput(12, "Ram", "MCA", "IT", 1200.00);
		
		ram.showDetails();
		
//		System.out.println("Roll No is : " + ram.rollno);
//		System.out.println("Name is : " + ram.name);
//		System.out.println("Course is : " + ram.course);
//		System.out.println("Branch No is : " + ram.branch);
//		System.out.println("Fees No is : " + ram.fees);
//		
//		System.out.println("==============================");
		
		Student raman = new Student();
//		raman.rollno = 13;
//		raman.name = "Raman";
//		raman.course = "MCA";
//		raman.branch = "CS";
//		raman.fees = 1300.00;
		
		raman.takeInput(13, "Raman", "MCA", "CS", 1220.00);
		
		raman.showDetails();
		
//		System.out.println("Roll No is : " + raman.rollno);
//		System.out.println("Name is : " + raman.name);
//		System.out.println("Course is : " + raman.course);
//		System.out.println("Branch No is : " + raman.branch);
//		System.out.println("Fees No is : " + raman.fees);
		
	}

}
