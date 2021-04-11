
public class IfApp {

	public static void main(String[] args) {
		
		System.out.println("a");
		
		int a = 10;
		int b = 20;
		int c = 30;
		
//		if (a > b) {
//			System.out.println(1);
//		} else {
//			if (b > c) {
//				System.out.println(2);
//			} else {
//				System.out.println(3);
//			}
//		}
		
		if (a > b) {
			System.out.println(1);
		} else if (b > c) {
			System.out.println(2);
		} else{
			System.out.println(3);
		}

		System.out.println("b");

	}

}
