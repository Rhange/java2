
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
		} catch (ArithmeticException e) {
			System.out.println("����� �߸��� �� �����ϴ�.");
		} catch (Exception e) {
			System.out.println("������ �̻��մϴ�. ������ �߻��߰ŵ��");
		}
		System.out.println(5);

	}

}
