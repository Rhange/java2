interface Calculable {
	// interface에서 변수를 정의할 때는 value도 적는다.
	double PI = 3.14;
	int sum(int v1, int v2);
}

// interface의 이름은 대문자로 시작하고 형용사로 사용하는게 보편적
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
		// 객체 타입으로 'RealCal'이 아닌 interface인 'Calculable'이 올 수 있다.
		// 그러나 이 경우에 인스턴스 'c'는 Printable interface의 기능들은 사용할 수 없다.
		Calculable c = new RealCal();
		System.out.println(c.sum(2, 1));
		c.print();	// compile Error
		System.out.println("c.PI : " + c.PI);
	}
}
