class Print {
	public String delimiter;

	// method�� instance�� �Ҽ��̸� 'static'�� �����ؾ� �Ѵ�.
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
		// a��� method�� class�� ���ϴ°� �ƴ϶� instance�� ���ϴ� method�̱� ������
		// �Ʒ��� �ڵ�� ������� �ʴ´�.
		// Print.a();
		Print.c("$"); // c�� static method�̱� ������ �� �ڵ�� ���� �۵�

//		Print.a("*");
//		Print.b("*");

		// Instance
		Print t2 = new Print();
		t2.delimiter = "*";
		t2.a();
		t2.b();
	}

}
