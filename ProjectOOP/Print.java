
class Print {
	// remove 'static' for instance
	public String delimiter = "";

	// Print 클래스와 이름이 같은 method
	// construct method
	// Print class가 호출되었을 때, 실행되는 method
	// 초기화
	// 생성자
	public Print(String delimiter) {
		// this는 instance를 가리킨다.
		this.delimiter = delimiter;
	}

	// remove 'static' for instance
	public void A() {
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	}

	// remove 'static' for instance
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}

}