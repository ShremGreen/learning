/*
��������ϰ
è������

è���̳��Զ�����
�������붨�����name��age��eat()��

*/

abstract class Animal {
	private String name;
	private int age;
	
	public Animal() {}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
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
	
	//���󷽷�
	public abstract void eat();
}

//���幷��
//����ȫ���̳�
//���췽���в�
//��Ա��������
class Dog extends Animal {
	public Dog() {}
	public Dog(String name, int age) {
		super(name, age);//���ʸ����вξ�̬���������������Ӹ�����ϵ����
	}
	
	public void eat() {
		System.out.println("���й�ͷ");
	}
}

class AbstractDemo1 {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.setName("С��");
		d.setAge(2);
		System.out.println("���֣�" + d.getName() + "����" + d.getAge());
		
		d = new Dog("С��", 1);//ֱ�Ӹ�ֵ����̬
		d.eat();
		System.out.println("���֣�" + d.getName() + "����" + d.getAge());
	}
}