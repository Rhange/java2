class Print {
	public String delimiter;

	// method가 instance의 소속이면 'static'을 제거해야 한다.
	public void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}

	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}

	public static void c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("c");
		System.out.println("c");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
//		Print.a("-");
//		Print.b("-");

		// Instance
		Print t1 = new Print();
		t1.delimiter = "-";
		t1.a();
		t1.b();
		// a라는 method는 class에 속하는게 아니라 instance에 속하는 method이기 때문에
		// 아래의 코드는 실행되지 않는다.
		// Print.a();
		Print.c("$"); // c는 static method이기 때문에 이 코드는 정상 작동

//		Print.a("*");
//		Print.b("*");

		// Instance
		Print t2 = new Print();
		t2.delimiter = "*";
		t2.a();
		t2.b();
	}

}
