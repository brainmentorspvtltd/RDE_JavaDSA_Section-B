import static java.lang.System.out;

import java.util.Scanner;

interface MathOperations {
	static void fact(int num) {
		
	}
	static void sqrt(int num) {
		
	}
}

public class StaticKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner scanner = new Scanner(System.in);
		
		out.println("Hello...");
		MathOperations.fact(10);
		MathOperations.sqrt(13);
		
		System.out.println(Math.PI);
	}

}
