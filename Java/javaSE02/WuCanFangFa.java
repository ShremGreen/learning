/*
���췽����
��������г�ʼ��
��ʽ��
������������һ�£�����Ҫ���巵��ֵ����
*/

class Student {
		private String name;
		private int age;
		
		public Student() {
			System.out.println("�����޲ι��췽��");
	    }
		public Student(String name) {
			System.out.println("�����вι��췽��1");
			this.name = name;
		}
		public Student(int age) {
			System.out.println("�����вι��췽��2");
			this.age = age;
		}
		public void show() {
			System.out.println(name + "   " + age);
		}
}

class WuCanFangFa {
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
		
		Student s1 = new Student("���ٴ�");
		s1.show();
		
		Student s2 = new Student(22);
		s2.show();
	}
}

