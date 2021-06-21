class Print {
	public static String delimiter = "";
	
	public static void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}

	public static void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
	
	public static void printAll() {
		A();		
		A();
		B();		
		B();
	}
}


public class MyOOP {
	
	public static void main(String[] args) {
		
		Print.delimiter = "====";
		Print.printAll();
		
		Print.delimiter = "****";
		Print.printAll();
		
	}
	
}
