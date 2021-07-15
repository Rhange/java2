import java.io.FileWriter;
import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) throws IOException {
		// 1. try catch를 사용해도 되고
		// 2. throws 써서 다른 친구에게 예외 처리를 위임해도 좋다
		FileWriter f = new FileWriter("./data.txt");
		f.write("You Complete Exception Part! Congratulation!");
		f.close();
	}

}
