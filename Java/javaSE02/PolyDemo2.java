/*
����
�ڲ�������ʹ���������й���method()

����1	new Son();
		���У�����new�������ڴ棬�����߼��ϲ�����2�����ӣ�
����2	Son s = (Son) f;
		�Ѹ��������ǿ��ת��Ϊ��������ã�����ת�ͣ�
		���������ڴ棨��Ϊû��new��
*/

class Father {
	public void show() {
		System.out.println("����show����");
	}
}

class Son extends Father {
	public void show() {
		System.out.println("����show����");
	}
	
	public void method() {
		System.out.println("����method����");
	}
}

class PolyDemo2 {
	public static void main(String[] args) {
		Father f = new Son();
		
		f.show();
		//f.method();
		
		/*
		Son s = new Son();
		s.method();
		*/
		
		Son s = (Son) f;
		s.method();
	}
}