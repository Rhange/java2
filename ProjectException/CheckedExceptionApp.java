import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {

	public static void main(String[] args) {
		FileWriter f = null;	// try 내부에 선언을 해버리면 finally에서 f instance를 가져다 못 씀
		try {
			f = new FileWriter("data.txt");
			f.write("Hello");
			// close를 하기 전에 예외가 발생할 수 있기 때문에 `finally`로 처리해야 한다.
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 만약에 f가 null이 아니라면
			if (f != null) {
				try {
					f.close();
				} catch (IOException e) {	// f.close(); 자체가 IO 이므로 checkedException인 IOException을 예외처리 해주어야 한다.
					e.printStackTrace();
				}
			}
		}
	}

}
