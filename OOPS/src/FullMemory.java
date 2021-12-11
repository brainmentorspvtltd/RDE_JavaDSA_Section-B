import java.util.LinkedList;

class G {
	String t;
	int e;
	G(String t, int e) {
		this.t = t;
		this.e = e;
	}
}

public class FullMemory {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		System.out.println("Execution Started...");
		while(true) {
			G obj = new G("Hello",10);
			l.add(obj);
			Thread.sleep(30);
		}
	}

}
