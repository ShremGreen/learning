/*
�������ص㣺
1.abstract�����η������࣬���󷽷�û������
2.�������޷�ʵ�廯��Animal a2 = new Animal();��
3.�̳г����������Ҫô�ǳ����࣬Ҫô�����˸������еĳ��󷽷�
*/
abstract class Animal {
//Animal���ǳ����, ����δ����Animal�еĳ��󷽷�eat()
//class Animal {
	
	//������û�����壬�շ�����Ҳ����
	//public abstract void eat() {}
	public abstract void eat();
}

//�̳г�����������ǳ�����
abstract class Dog extends Animal {}

//�̳г������������д�������г��󷽷�
class Cat extends Animal {
	public void eat() {
		System.out.println("����Cat�า��Animal���eat����");
	}
}

class AbstractDemo {
	public static void main(String[] args) {
		
		//Animal a2 = new Animal();
		//����: Animal�ǳ����; �޷�ʵ����
		
		//ͨ����̬�ķ�ʽʵ����
		Animal a1 = new Cat();
		a1.eat();
	}
}