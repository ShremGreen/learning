/*

*/

class Father {
	/*public Father() {
		System.out.println("�����޲�");
	}
	*/
	//��ʱ��ʾ���޷����� Father�еĹ����� FatherӦ�õ���������;
	//��Ϊ����û���޲�
	
	public Father(String name) {
		System.out.println("�����в�");
	}
}

class Son extends Father {
	public Son() {
		super("123");
		System.out.println("�����޲�");
	}
	
	public Son(String name) {
		//super("123");
		this();
		System.out.println("�����в�");
	}
}

class ExtendsDemo4 {
	public static void main(String[] args) {
		Son s = new Son();//�����޲ι��췽���������޲ν��г�ʼ��
		Son s1 = new Son("123");//�����вι��췽���������޲ν��г�ʼ��
	}
}