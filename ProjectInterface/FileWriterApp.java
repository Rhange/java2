import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterApp {

	public static void main(String[] args) throws IOException {
		Writer fileWriter = new FileWriter("filewriter.txt");
		
		fileWriter.write("data 1");
		fileWriter.write("data 2");
		fileWriter.write("data 3");
		
		// 쓰기 작업이 되는 동안 close를 안해주면 컴퓨터는 다른 모듈에서 시작하려는 write를 못하도록 막고 있음
		// close를 사용해서 놓아줘야 한다.
		fileWriter.close();
	}

}
