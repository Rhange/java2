
class Print {
	// delimiter, A, B are 'member' of class
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