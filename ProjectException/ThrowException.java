import java.io.FileWriter;
import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) throws IOException {
		// 1. try catch�� ����ص� �ǰ�
		// 2. throws �Ἥ �ٸ� ģ������ ���� ó���� �����ص� ����
		FileWriter f = new FileWriter("./data.txt");
		f.write("You Complete Exception Part! Congratulation!");
		f.close();
	}

}
