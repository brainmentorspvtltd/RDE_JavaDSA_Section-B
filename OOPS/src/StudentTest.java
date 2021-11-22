public class StudentTest {

	public static void main(String[] args) {
		
//		StudentReport obj = new StudentReport();
		
		StudentReport ram = new StudentReport(12, "Ram", "BCA", "CS", 3400.00);
//		ram.takeInput(12, "Ram", "BCA", "CS", 3400.00);
//		ram.takeInput();
		ram.showDetails();
		
		StudentReport shyam = new StudentReport(15, "Shyam", "MCA", "CS", 3800.00);
//		shyam.takeInput(15, "Shyam", "MCA", "CS", 3800.00);
//		shyam.takeInput();
		shyam.showDetails();

	}

}
