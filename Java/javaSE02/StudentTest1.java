/*
������ʽ����
*/

abstract class Person {
	public abstract void study();
}

class PersonDemo {
		public void method(Person p) {
			p.study();
		}
}

class Student extends Person {
	public void study() {
		System.out.println("studying...");
	}
}

class StudentTest1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.study();
		new Student().study();//��������
		
		PersonDemo pd = new PersonDemo();
		Person p = new Student();//��̬�����ϴ���
		pd.method(p);
	}
}