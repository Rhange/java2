
public class MyOOP {
	
	public static void main(String[] args) {
		// [type] [variable] = new [class]();
		
		// p1 is Instance
		Print p1 = new Print("----");
		// ������� ������(delimiter) ������ ����� �� �ִ�.
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		// p2 is Instance
		Print p2 = new Print("****");
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		p1.A();
		p2.A();
		p1.A();
		p2.A();
		
		// ...
		// �� ��Ȳ���� ����� ���� Instance�� ���� �ʿ��ϴ�.
	}
	
}
