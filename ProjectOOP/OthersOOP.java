import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		
		// Math is class
		// System is also class
		System.out.println(Math.PI);	// PI is variable
		System.out.println(Math.floor(1.8));	// floor is method
		System.out.println(Math.ceil(1.8));		// ceil is method
		
		// �� �ƶ��� �۾������� Ŭ���� ��ü�� ����ϴ� ���� �ƴ϶� �������� ����Ѵ�.
		// f1 is instance
		// FileWriter is class
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("Hello");
		f1.write(" Java");
		f1.close();
		
		// f2 is also instance
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("Hello");
		f2.write(" Java2");
		f2.close();
		
	}

}
