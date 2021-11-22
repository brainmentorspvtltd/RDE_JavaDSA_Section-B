public class InputFromCommandLine {

	public static void main(String ...args) {
//		String x = args[0];
//		String y = args[1];
		
//		if(args.length == 2) {
//			int x = Integer.parseInt(args[0]);
//			int y = Integer.parseInt(args[1]);
//			System.out.println(x + y);	
//		}
//		else {
//			System.out.println("Invalid Input");
//		}
		int sum = 0;
//		for(int i = 0; i < args.length; i++) {
//			sum += Integer.parseInt(args[i]);
//		}
		
//		Enhanced For Loop
		for(String i : args) {
			sum += Integer.parseInt(i);
		}
		
		System.out.println("Sum is " + sum);
		
//		Invalid
//		for(int i : 10) {
//			sum += i;
//		}
		
	}

}
