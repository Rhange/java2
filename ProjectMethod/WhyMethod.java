
public class WhyMethod {
	
	public static void main(String[] args) {
		
		//	100000000
					// ��ü���� ��, ����, argument
		printToTimes("a", "-");
		//	100000000
		printToTimes("a", "*");
		//	100000000
		printToTimes("a", "&");
		printToTimes("b", "!");

	}
									// �������� �ܾ�, �Ϲ�ȭ, �Ű�����, parameter
	public static void printToTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}

}
