
public class MyOOP {
	public static void main(String[] args) {
		// * method 안에 있는 variable은 해당 method 안에서만 쓸 수 있다. (유효 범위)
		delimiter = "====";
		
		// ... 1억줄의 코드
		printA();		
		printA();
		printB();		
		printB();
		
		// ... 1억줄의 코드
		delimiter = "****";
		printA();		
		printA();
		printB();		
		printB();
		
	}
	
	public static String delimiter = "";

	public static void printA() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}

	public static void printB() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
	
	// ...
}
