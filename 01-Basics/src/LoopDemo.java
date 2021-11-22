public class LoopDemo {

	public static void main(String[] args) {
		
//		for(init; condition; inc/dec) {
//			Logic
//		}
		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.println(i + ", " +j);
//			}
//		}
		
//		1
//		12
//		123
//		1234
//		12345
		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		54321
//		5432
//		543
//		54
//		5
		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 5; j >= i; j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		12345
//		 1234
//		  123
//		   12
//		    1
		
//		for(int i = 5; i >= 1; i--) {
//			for(int j = 4; j >= i; j--) {
//				System.out.print(" ");
//			}
//			for(int k = 1; k <= i; k++) {
//				System.out.print(k);
//			}
//			System.out.println();
//		}
		
		
//		10101
//		10101
//		10101
//		10101
//		10101
		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= 5; j++) {
//				if(j % 2 == 0) {
//					System.out.print(0);
//				}
//				else {
//					System.out.print(1);
//				}
//			}
//			System.out.println();
//		}
		
		
//		       *
//		     * *
//		   * * *
//       * * * *
//     * * * * *
//   * * * * * *
//		int n = 1;
//		for(int i = 6; i >= 1; i--) {
//			for(int j = 1; j <= 2*i-2; j++) {
//				System.out.print(" ");
//			}
//			for(int k = 1; k <= n; k++) {
//				System.out.print("* ");
//			}
//		System.out.println();
//		n++;
//		}
		
//		
//		*
//	   * *
//	  *   *
//	 *     *
//	*********
		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = i; j < 5; j++) {
//				System.out.print(' ');
//			}
//			for(int k = 1; k <= 2 * i - 1; k++) {
//				if(i == 5 || k == 1 || k == 2*i - 1) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//		}
//			System.out.println();
//		}
		
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 9; j++) {
				if(i < 5) {
					if(j == 6 - i || j == 4 + i) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}	
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
		
	}

}
