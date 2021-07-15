import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {

	public static void main(String[] args) {
		FileWriter f = null;	// try ���ο� ������ �ع����� finally���� f instance�� ������ �� ��
		try {
			f = new FileWriter("data.txt");
			f.write("Hello");
			// close�� �ϱ� ���� ���ܰ� �߻��� �� �ֱ� ������ `finally`�� ó���ؾ� �Ѵ�.
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// ���࿡ f�� null�� �ƴ϶��
			if (f != null) {
				try {
					f.close();
				} catch (IOException e) {	// f.close(); ��ü�� IO �̹Ƿ� checkedException�� IOException�� ����ó�� ���־�� �Ѵ�.
					e.printStackTrace();
				}
			}
		}
	}

}
