
public class AuthApp3 {

	public static void main(String[] args) {

		String[] users = { "rhange", "tazo", "sang" };
		String inputId = args[0];

		boolean isLogined = false;
		for (String name : users) {
			String currentId = name;

			if (currentId.equals(inputId)) {
				isLogined = true;
				break;
			}
		}
		
		System.out.println("Hi,");
		if(isLogined) {
			System.out.println("Master!!");
		} else {
			System.out.println("Who are you?");
		}
	}
}
