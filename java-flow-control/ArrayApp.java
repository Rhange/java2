import java.util.Arrays;

public class ArrayApp {

	public static void main(String[] args) {
		
		// rhange, tazo, sang
//		String users = "rhange, tazo, sang";
		String[] users = new String[3];
		users[0] = "rhange";
		users[1] = "tazo";
		users[2] = "sang";
		
		System.out.println(users[1]);
		System.out.println(users.length);
		
//		int[] scores = new int[3];
		int[] scores = {95, 93, 94};
		System.out.println(scores);	// [I@372f7a8d
		System.out.println(scores.getClass()); // class [I
		System.out.println(scores.getClass().getSimpleName()); // int[]
		System.out.println(Arrays.toString(scores));	// [95, 93, 94]
	}
}
