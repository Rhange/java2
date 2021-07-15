
public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println(1);
		int[] scores = { 10, 20, 30 };
		// try, catch => handling exceptions
		try {
			System.out.println(2);
			// System.out.println(scores[3]);

			// below codes are not going to execute
			System.out.println(3);
			System.out.println(2 / 0);
			System.out.println(4);
		} catch (ArithmeticException e) {
			System.out.println("계산이 잘못된 것 같습니다. 이유 : " + e.getMessage());
			e.printStackTrace(); // console에 error를 보여주도록 함. 프로그램이 멈추지는 않음
								 // 일반 사용자에게 보여지면 보완이슈가 발생할 수 있는데, logging 시스템 API를 활용하면 좋다.
		} catch (Exception e) {
			System.out.println("뭔가가 이상합니다. 오류가 발생했거든요");
		}
		System.out.println(5);

	}

}
