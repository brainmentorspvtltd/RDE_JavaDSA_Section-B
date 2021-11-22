import java.io.IOException;
import java.util.Scanner;

public class TakingInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Enter your name :");
//		char name = System.in.read();
//		reads data byte by byte 
//		System.out.println(name);
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println(name);
	}

}
