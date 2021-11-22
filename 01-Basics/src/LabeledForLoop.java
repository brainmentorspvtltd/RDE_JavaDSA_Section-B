public class LabeledForLoop {

	public static void main(String[] args) {
		
		outer:
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == j) {
					continue outer;					
				}
				else {
					System.out.println(i + ", " + j);
				}
			}
		}

	}

}
