class Cal {
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	
	// Overloading
	public int sum(int v1, int v2, int v3) {
		return v1 + v2 + v3;
	}
}

class Cal3 extends Cal {
	public int minus(int v1, int v2) {
		return v1 - v2;
	}
	
	// Overriding
	// subclass(Cal3) overrides superclass(Cal)'s 'sum' method 
	// by adding 'System.out.println("Cal3!!!");'
	public int sum(int v1, int v2) {
		System.out.println("Cal3!!!");
		return v1 + v2;
	}
}

public class InheritanceApp {

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(2, 1)); // 3
		System.out.println(c.sum(2, 1, 3)); // 6

		// Dose Cal2 class have sum method?
		Cal2 c2 = new Cal2();
		System.out.println(c2.sum(2, 2)); // 4
		System.out.println(c2.minus(2, 2)); // 0

		// Dose Cal3 class have sum method?
		Cal3 c3 = new Cal3();
		System.out.println(c3.sum(2, 3)); // Cal3!!!
										  // 5
		System.out.println(c3.minus(2, 3)); // -1
	}

}

//make new class Cal2 which has minus method
class Cal2 {
	public int sum(int v1, int v2) {
		return v1 + v2;
	}

	public int minus(int v1, int v2) {
		return v1 - v2;
	}
}
