/*
�̳�
���಻�ܼ̳и���˽�з����ͱ���
*/

class Father {
	private int a = 12;
	public int b = 21;
	
	private void method() {
		System.out.println("����˽�з���");
		System.out.println(a);
		System.out.println(b);
	}
	
	public void show() {
		System.out.println("���๫������");
		System.out.println(a);
		System.out.println(b);
	}
	
	
}

class Son extends Father {
	public void function() {
		
		//System.out.println(a);//a������Father�з���private
		System.out.println(b);
	}
}

class ExtendsDemo2 {
	public static void main(String[] args) {
		Son s = new Son();
		
		s.show();
		//s.method();
		s.function();
	}
}