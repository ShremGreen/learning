/*
�ӿڡ��࣬
ʵ��è���Ӽ�
*/

//�ӿ�
interface Jump {
	public abstract void jump();
}

/*����һ�������࣬
��˽��name��age
���󷽷�eat()
���巽��sleep()
*/
abstract class Animal {
	private String name;
	private int age;
	
	//���췽��
	public Animal() {}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	//���󷽷�eat
	public abstract void eat();
	
	//���巽��sleep
	public void sleep() {
		System.out.println("sleeping...");
	}
}

//è�๷��
class Dog extends Animal {
	public Dog() {}
	public Dog(String name, int age) {
		super(name,age);
	}
	
	//��дeat
	public void eat() {
		System.out.println("���й�ͷ");
	}
}

class Cat extends Animal {
	public Cat() {}
	public Cat(String name, int age) {
		super(name,age);
	}
	
	//��дeat
	public void eat() {
		System.out.println("è����");
	}
}

//���Ӽ���è�๷��(�̳��������è����)
class JumpDog extends Dog implements Jump {
	//���췽��
	public JumpDog() {}
	public JumpDog(String name, int age) {
		super(name,age);
	}
	
	//��дjump����
	public void jump() {
		System.out.println("�ᣡ��3m��");
	}
}

class JumpCat extends Cat implements Jump {
	//���췽��
	public JumpCat() {}
	public JumpCat(String name, int age) {
		super(name,age);
	}
	
	//��дjump����
	public void jump() {
		System.out.println("�ᣡ��3m��");
	}
}

class InterfaceDemo4 {
	public static void main(String[] args) {
		//����
		JumpDog d1 = new JumpDog("С�׹�",2);
		System.out.println("����:" + d1.getName() + "  ����:" + d1.getAge());
		d1.eat();
		d1.sleep();
		d1.jump();
		
		System.out.println();
		
		JumpCat d2 = new JumpCat("С��è",1);
		System.out.println("����:" + d2.getName() + "  ����:" + d2.getAge());
		d2.eat();
		d2.sleep();
		d2.jump();
	}
}