class BB {
	int x,y;
	BB(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Object Born...");
	}
	@Override
	protected void finalize() {
		System.out.println("Object Deleted...");
	}
}

public class GCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB obj = new BB(3,5);
		obj = null;	// way one to remove reference
		System.gc();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		/*
		 * BB obj2 = new BB(5,7); 
		 * BB obj3 = new BB(51,71); 
		 * obj3 = obj2; // way two to
		 * remove reference
		 * 
		 * // way three 
		 * if(5 > 2) {
		 *  BB obj4 = new BB(4,2); 
		 *  }
		 */
	}

}
