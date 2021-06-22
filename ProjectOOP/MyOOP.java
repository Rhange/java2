
public class MyOOP {
	
	public static void main(String[] args) {
		
		Print.delimiter = "====";
		Print.printAll();
		
		Print.delimiter = "****";
		Print.printAll();
		
		Print.delimiter = "----";
		Print.printAll();
		
		Print.delimiter = "****";
		Print.printAll();
		
		Print.delimiter = "====";
		Print.printAll();
		
		// ...
		// 이 상황에서 벗어나게 해줄 Instance의 힘이 필요하다.
	}
	
}
