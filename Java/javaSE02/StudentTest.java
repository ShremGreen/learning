/*
��׼ѧ�������հ�
����
��Ա����  name��age
���췽��  �޲� �в�
��Ա����  getXxx();setXxx();show()
*/

class Student {
	private String name;
	private int age;
	
	//���췽���޲�
	public Student() {
	}
	
	//���췽���в�
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//����set����
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//����get����
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	//show����
	public void show() {
		System.out.println("name:" + name + "   age:" + age);
	}
}

class StudentTest {
	public static void main(String[] args) {
		//���÷���1
		Student s1 = new Student();
		s1.setName("���ٴ�");
		s1.setAge(22);
		System.out.println("name:" + s1.getName() + "   age:" + s1.getAge());
		s1.show();
		
		//���÷���2
		Student s2 = new Student("�",28);
		System.out.println("name:" + s2.getName() + "   age:" + s2.getAge());
		s2.show();
	}
}