
class Private {
	//˽�л�һ������
	private int a = 10;
	//˽�л�һ������
	private void method() {
		System.out.println("method" + "   a=" + a);
	}
	//���ڲ�����˽�л���һ������
	public void function() {
		method();
	}
}

class PrivateTest {
	public static void main(String[] args) {
		Private p = new Private();
		//p.method();//��ʾ���ܵ���˽�л�����
		p.function();
	}
}