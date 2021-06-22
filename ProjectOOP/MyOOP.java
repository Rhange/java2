
public class MyOOP {
	
	public static void main(String[] args) {
		// [type] [variable] = new [class]();
		
		// p1 is Instance
		Print p1 = new Print();
		p1.delimiter = "----";
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		// p2 is Instance
		Print p2 = new Print();
		p2.delimiter = "****";
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		p1.A();
		p2.A();
		p1.A();
		p2.A();
		
		// ...
		// 이 상황에서 벗어나게 해줄 Instance의 힘이 필요하다.
	}
	
}
