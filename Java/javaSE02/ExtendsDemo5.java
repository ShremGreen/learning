/*
��̬����顢�������顢���췽��
�����
���ྲ̬�����
���ྲ̬�����
���๹������
���๹�췽��
���๹������
���๹�췽��

������
Son s = new Son();
���ȼ���class����ʱ��̬�����Ҳ�����أ��ȸ�����
Ȼ��new����ʼ���ù��췽������ʱ�����ǹ������飬���췽�����ȸ�����
*/

class Father {
	static {
		System.out.println("���ྲ̬�����");
	}
	
	{
		System.out.println("���๹������");
	}
	
	public Father() {
		System.out.println("���๹�췽��");
	}
}

class Son extends Father {
	static {
		System.out.println("���ྲ̬�����");
	}
	
	{
		System.out.println("���๹������");
	}
	
	public Son() {
		System.out.println("���๹�췽��");
	}
}

class ExtendsDemo5 {
	public static void main(String[] args) {
		new Son();
	}
}