interface IPlayer {
//	public abstract void walk();
	void walk();
	void run();
	void jump();
	void punch();
	void kick();
	
	void entry();
	void dead();
	
//	public static final int DEFAULT_JUMP = 10;
	int DEFAULT_JUMP = 10;
	
}

interface IExtraPower {
	void hide();
	void show();
}

abstract class CommonFeatures implements IPlayer {
	public void entry() {
		System.out.println("Entry...");
	}
	
	public void dead() {
		System.out.println("Dead...");
	}
}

class King extends CommonFeatures implements IPlayer, IExtraPower {

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}

class Eddy extends CommonFeatures implements IPlayer {

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}
	
}


public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
