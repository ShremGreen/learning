/*
this��super
this��������Ա�����е�num��
super��������Ա�����е�num��
*/

class Father {
	int num = 1;
}

class Son extends Father {
	int num = 2;
	
	public void show() {
		int num = 3;
		
		System.out.println(num);//��ӡ�ֲ�
		System.out.println(this.num);//��ӡ�����Ա����
		System.out.println(super.num);//��ӡ�����Ա����
	}
}

class ExtendsDemo3 {
	public static void main(String[] args) {
		Son s = new Son();
		
		s.show();
	} 
}