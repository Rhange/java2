
public class AuthApp {

	public static void main(String[] args) {
		// User Id
		String id = "Rhange";
		String inputId = args[0];
		
		// User Password
		String pass = "1111";
		String inputPass = args[1];
		
		System.out.println("Hi!");
		
		// if (inputId == id) {
//		if (inputId.equals(id)) {
//			if (inputPass.equals(pass)) {
//				System.out.println("Master!");
//			} else {
//				System.out.println("Wrong password!");
//			}
//		} else {
//			System.out.println("Who are you?");
//		}
		
		// Use logic operator
		if (inputId.equals(id) && inputPass.equals(pass)) {
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}

	}

}
