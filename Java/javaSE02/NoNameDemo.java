/*
��������
*/

class Student {
	public void show() {
		System.out.println("ѧϰJava");
	}
}

class StudentDemo {
	public void method(Student s) {//s���β�
		s.show();
	}
}

class NoNameDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
		System.out.println("--------------");
		
		//����������Ϊʵ�ʲ�������
		StudentDemo sd = new StudentDemo();
		//Student ss = new Student();
		//sd.method(ss);//ss��ʵ��
		
		//��������
		//sd.method(new Student());//���涨��ss
		//����������÷���
		new StudentDemo().method(new Student());//���涨��sd
		
	}
}