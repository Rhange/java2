interface Calculable {
	// interface���� ������ ������ ���� value�� ���´�.
	double PI = 3.14;
	int sum(int v1, int v2);
}

// interface�� �̸��� �빮�ڷ� �����ϰ� ������ ����ϴ°� ������
interface Printable {
	void print();
}

class RealCal implements Calculable, Printable {
	public int sum(int v1, int v2) {
		return v1 + v2;
	}

	public void print() {
		System.out.println("This is RealCal!!");
	}
}

public class InterfaceApp {
	public static void main(String[] args) {
		// ���ϱ� ����� �ִ� Ŭ������ ������ּ���.
		RealCal c = new RealCal();
		System.out.println(c.sum(2, 1));
		c.print();
		System.out.println("c.PI : " + c.PI);
	}
}
