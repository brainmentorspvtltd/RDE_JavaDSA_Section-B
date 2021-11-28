class NormalUsers {
	int deliveryCharges = 100;
	int deliveryTime = 4;
	boolean giftFeatures = false;
}

class PrimeUsers extends NormalUsers {
	int primeDeliveryCharges = 10;
	int primeDeliveryTime = 1;
	boolean primeGiftFeature = true;
}

class AmazonUser {
	
	String disp() {
		System.out.println("Diplay Function...");
		return "hello";
	}
	
	NormalUsers show() {
		System.out.println("This is normal user account...");
		NormalUsers obj = new NormalUsers();
		return obj;
	}
}

class AmazonPrimeUser extends AmazonUser {
	@Override
	PrimeUsers show() {
		System.out.println("This is prime user account...");
		PrimeUsers obj = new PrimeUsers();
		return obj;
	}
	
//	@Override
//	int disp() {
//		System.out.println("Diplay Function...");
//		return 10;
//	}
}

public class CovariantReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmazonPrimeUser obj = new AmazonPrimeUser();
		PrimeUsers prime = obj.show();
	}

}
