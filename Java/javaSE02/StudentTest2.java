/*
�ӿ�����ʽ����
*/

interface Hobby {
	public abstract void love();
}

class LoveDemo {
	public void method(Hobby h) {
		h.love();
	}
}

class Student implements Hobby {
	public void love() {
		System.out.println("ѧ��������");
	}
}

class StudentTest2 {
	public static void main(String[] args) {
		LoveDemo l = new LoveDemo();
		Hobby h = new Student();//��̬��ͨ����ʵ�ֽӿ�
		l.method(h);
	}
}