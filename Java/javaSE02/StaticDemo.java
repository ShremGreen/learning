/*
static��̬ע�����
 �ص㣺 1.������ļ��ض�����
		2.�������γ�Ա�����ͳ�Ա����
		3.��Ա������������ж���������Ϊ��̬������
		4.����ͨ������ / ����������
		5.��̬����û��this�ؼ��ֵģ���Ϊstatic���ഴ��ʱ�ͱ�������this���Ŷ������������̬����ʱ��û��this��
*/

class Teacher {
	public int a = 10;
	public static int b = 20;
	
	public void show() {
		System.out.println(a);
		System.out.println(this.a);
	}
	
	public static void method() {
		//System.out.println(this.b);
		System.out.println(b);
	}
}

class StaticDemo {
	public static void main(String[] args) {
		
		//ͨ������������
		/*
		Teacher t = new Teacher();
		
		t.show();
		t.method();
		*/
		
		//ͨ����������
		//Teacher.show();//����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� show()
		Teacher.method();
	}
}