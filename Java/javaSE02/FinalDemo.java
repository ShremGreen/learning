/*
final�ؼ���

������		����: �޷�������X���м̳�
���η���	����: Y�е�show()�޷�����X�е�show()
���α���	����: �޷�Ϊ���ձ���a����ֵ
*/

/*final class X {
	
}*/

class X {
	final int a = 10;
	public void show() {
		System.out.println("���Ǳ�final���εĸ��෽��");
	}
}

class Y extends X {
	public void show() {
		System.out.println("�������෽��");
	}
	
	public void method() {
		//int a = 20;
		System.out.println(a);
	}
}

class FinalDemo {
	public static void main(String[] args) {
		Y y = new Y();
		y.show();
		y.method();
	}
}