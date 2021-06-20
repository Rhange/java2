
public class OutputMethod {

	public static String a() {
		// ...
		return "a";
	}
	
	public static int one() {
		// ...
		return 1;	// return은 method를 종료시킬 때도 사용된다.
	}
	
	public static void main(String[] args) {	// void는 return 값이 없는 method
		
		System.out.println(a());
		System.out.println(one());

	}

}
