/*

*/

interface Father {
	public abstract void show1();
}

interface Mother {
	public abstract void show2();
}

interface Sister extends Father,Mother {//�ӿڼ���Զ�̳�
	//�ӿ�֮��̳в���Ҫ������д
}

//��ʵ�ֽӿ���ʵĬ���м̳й�ϵ���̳���Object
//class Son extends Object implements Father,Mother {

class Son implements Father,Mother {//��ʵ�ֽӿڿ��Զ�ʵ��
	public void show1() {
		System.out.println("����ʵ�ָ��ӿ�");
	}
	
	public void show2() {
		System.out.println("����ʵ��ĸ�ӿ�");
	}
}

class InterfaceDemo3 {
	public static void main(String[] args) {
		Father f = new Son();
		f.show1();
		
		Mother m = new Son();
		m.show2();
		
	}
}