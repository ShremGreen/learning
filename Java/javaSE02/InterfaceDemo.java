/*
�ӿڣ�
1.interface �ӿ��� {}
2.��ʵ�ֽӿ���implements��ʾ
class ���� implements �ӿ��� {}
3.�ӿڲ���ʵ���������ǿ�ͨ����̬�ķ�ʽ����ʵ����
4.�ӿڵ�����һ���Ǿ����ࣨҲ�����ǳ����࣬�������岻�󣩣�Ҫ��д�ӿ������г��󷽷�
*/

interface AnimalTrain {
	public abstract void jump();
}

class Dog implements AnimalTrain {
	public void jump() {
		System.out.println("ʵ������");
	}
}

class InterfaceDemo {
	public static void main(String[] args) {
		//AnimalTrain a = new AnimalTrain();
		//a.jump();
		
		AnimalTrain at = new Dog();
		at.jump();
	}
}