/*
�ӿ��г�Ա�ص㣺
������
		�ӿ��еı���Ĭ���ǳ����������Ǿ�̬��
		Ĭ�����η���public static final
���췽��:
		û�й��췽��
		���еĽӿ����඼�̳���Object
��Ա������
		ֻ���ǳ��󷽷�
		Ĭ�����η���public abstract
*/

interface Inter {
	public int num = 10;
	public final int num1 = 20;
	
	//����: ��Ҫ<��ʶ��>
	//public Inter() {}//˵���ӿ���û�й��췽��
	
	//public void show() {}//����: �ӿڷ������ܴ�������,˵���ӿڷ������ǳ����
	
	//abstract void show();//�������ڳ��Է�����͵ķ���Ȩ��; ��ǰΪpublic
	//˵��Ĭ�����η���public abstract
}

class InterImpl extends Object implements Inter {
	public InterImpl() {
		super();
	}
	
	void show() {}
}

class InterfaceDemo1 {
	public static void main(String[] args) {
		Inter i = new InterImpl();
		System.out.println(i.num);
		System.out.println(i.num1);
		
		//i.num = 1;//����: �޷�Ϊ���ձ���num����ֵ
		//i.num1 = 2;//����: �޷�Ϊ���ձ���num1����ֵ
		//˵���ӿ��б������������¸�ֵ��ȫ�ǳ���
		
		//���ھ�̬����ʹ���������ã��������
		System.out.println(Inter.num);//���������˵�����Ǿ�̬��
		
		//Inter it = new Inter();
		
	}
}
