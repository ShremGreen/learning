/*
���̳�
*/

class Grandfather {
	public void show() {
	System.out.println("үү");
	}
}

class Father extends Grandfather {
	public void method() {
	System.out.println("����");
	}
}

class Son extends Father {}

class ExtendsDemo1 {
	public static void main(String[] args) {
		Son s = new Son();
		s.show();
		s.method();
	}
}