
public class WhyMethod {
	
	public static void main(String[] args) {
		
		//	100000000
					// 구체적인 값, 인자, argument
		printToTimes("a", "-");
		//	100000000
		printToTimes("a", "*");
		//	100000000
		printToTimes("a", "&");
		printToTimes("b", "!");

	}
									// 보편적인 단어, 일반화, 매개변수, parameter
	public static void printToTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}

}
