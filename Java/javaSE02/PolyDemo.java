/*
��̬�г�Ա�����ص�

��Ա����	���뿴��ߣ�ִ�п���ߣ���Ϊ�������Ǹ��࣬���ø��������
���췽��	������������ʱ�򣬷��ʸ��๹�췽���Ը�����г�ʼ��
��Ա����	���뿴��ߣ�ִ�п��ұߣ���Ա�������ڷ�����д�����౻���า�ǣ���ʾ���ࣩ
��̬����	���뿴��ߣ�ִ�п���ߣ���ֻ̬������أ����㷽����д�����Ǹ��ࣩ
*/

class Father {
	int num = 2;
	
	public void show() {
		System.out.println("����show����");
	}
	
	public static void method() {
		System.out.println("���ྲ̬����");
	}
}

class Son extends Father {
	int num = 3;
	int num1 = 4;
	
	public void show() {
		System.out.println("����show����");
	}
	
	public static void method() {
		System.out.println("���ྲ̬����");
	}
}

class PolyDemo {
	public static void main(String[] args) {
		//��ʽ������ f = new ����();
		Father f = new Son();
		
		System.out.println(f.num);
		//System.out.println(f.num1);//��ʱ��ʾ�Ҳ�������
		//��Ϊ���ڸ�����Ѱ��num1����������û��
		
		f.show();
		f.method();
	}
}