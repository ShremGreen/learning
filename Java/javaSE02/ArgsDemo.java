/*
1.��֮����Ի������
��ʽ��������
*/

class Add {
	public int sum(int a, int b) {
		return a + b;
	}
}

class Chenshu {
	public void hua() {
		System.out.println("�ӷ�����ǣ�");
	}
}

class Diaoyong {
	//����һ����ʽ�����������ͣ��������������ͣ��ĵķ�������ʽ�ǣ��������� ������
	public void chuan(Chenshu c) {
		c.hua();
	}
}

class ArgsDemo {
	public static void main(String[] args) {
		
		Diaoyong d = new Diaoyong();//��������ʱ��Ҫ�ӣ���
		Chenshu c = new Chenshu();//����֮ǰ�����ȴ�������
		d.chuan(c);//��Diaoyong�����ҵ�chuan������ͨ�������ҵ�Chenshu���ٴ�ӡ
		
		Add a = new Add();
		int b = a.sum(3,4);
		System.out.println(b);

		
	}
}