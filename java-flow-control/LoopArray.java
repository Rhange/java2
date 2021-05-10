
public class LoopArray {
	public static void main(String[] args) {
		String[] users = new String[3];
		users[0] = "rhange";
		users[1] = "tazo";
		users[2] = "sang";
		
		for (int i = 0; i < users.length; i++) {
			System.out.println(users[i] + ",");
		}
		
		System.out.println("==========");
		for (String name : users) {
			System.out.println(name);
		}
	}
}
