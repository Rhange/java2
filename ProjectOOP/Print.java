
class Print {
	// remove 'static' for instance
	public String delimiter = "";

	// Print Ŭ������ �̸��� ���� method
	// construct method
	// Print class�� ȣ��Ǿ��� ��, ����Ǵ� method
	// �ʱ�ȭ
	// ������
	public Print(String delimiter) {
		// this�� instance�� ����Ų��.
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