/*

*/

class People {
	private String name;
	private int age;
	
	public People() {}
	
	public People(String name, int age) {
		
		this.age = age;
		this.name = name;
		show();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void show() {
		System.out.println("name:" + name + "age:" + age);
	}
}

class Student extends People {
	//������Ϊ�գ���ʾ��
	//����: �޷����� Student�еĹ����� StudentӦ�õ���������;
	//��Ϊ����û�ж�����ι��췽��
	
	//�޲�
	public Student() {}
	//����
	public Student(String name, int age) {
		//��ʱӦע�⣺������ͷ���͡�62����Ȼû�к͸��ཨ����ϵ
		//���ң����������й��췽��Ĭ�Ϸ��ʸ����޲ι��췽��
		//�����Ҫ�ر�ͨ��super���ø�����ι��췽��
		
		super(name,age);
	}
}

class ExtendsTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("���ٴ�");
		s1.setAge(22);
		s1.show();
		
		Student s2 = new Student("����ͷ", 62);
	}
}