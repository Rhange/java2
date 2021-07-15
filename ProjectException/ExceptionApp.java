
public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println(1);
		int[] scores = { 10, 20, 30 };
		// try, catch => handling exceptions
		try {
			System.out.println(2);
			System.out.println(scores[3]);
			// below codes are not going to execute 
			System.out.println(3);
			System.out.println(2 / 0);
			System.out.println(4);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("없는 값을 찾고 있군요!");
		} catch (ArithmeticException e) {
			System.out.println("잘못된 계산입니다.");
		}
		System.out.println(5);

	}

}
