/*
�����
*/

class DemoMass {
	static {//��̬������ڵ��ù��췽��ǰִ�У����ȼ����ڹ�������
		System.out.println("��̬�����");
	}
	
	{//���������ڵ��ù��췽��ǰִ�У��ھ�̬������ִ��
		System.out.println("��������");
	}
	
	public DemoMass() {//�������췽��
		System.out.println("���췽��");
	}
}

class Mass {
	static {//����������ľ�̬�����
		System.out.println("������ľ�̬�����");
	}
	
	public static void main(String[] args) {
		System.out.println("main����");
		
		DemoMass d1 = new DemoMass();//���ù��췽��
	    DemoMass d2 = new DemoMass();//���ù��췽��+1
	}
}

/*�����
main����
��̬�����
��������
���췽��
��������
���췽��
*/