/*
è��������̬��ϰ
*/

class Animal {
	public Animal() {}
	
	public void eat() {
		System.out.println("��...");
	}
}

class Dog extends Animal {
	public Dog() {}
	
	public void eat() {
		System.out.println("���й�ͷ");
	}
	
	public void show1() {
		System.out.println("������");
	}
}

class Cat extends Animal {
	public Cat() {}
	
	public void eat() {
		System.out.println("è����");
	}
	
	public void show2() {
		System.out.println("è׽����");
	}
}

class PolyTest {
	public static void main(String[] args) {
		//����ת��
		Animal a = new Dog();
		a.eat();
		
		//����ת��
		Dog d = (Dog) a;
		d.show1();
		
		a = new Cat();
		a.eat();
		
		Cat c = (Cat) a;
		c.show2();
		
		//�����Ǵ������ݣ�
		//�����ң������ǹ���è�ǹ���������
		//Dog d2 = new Animal();//����: �����ݵ�����
		//Dog d3 = new Cat();//����: �����ݵ�����
		//Dog d3 = (Dog) a;//ClassCastException: Cat cannot be cast to Dog
	}
}