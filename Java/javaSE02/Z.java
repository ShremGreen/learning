/*
�����yxyz


*/
class X {
	Y y = new Y();
	X() {
		System.out.println("x");
	}
}

class Y {
	Y() {
		System.out.println("y");
	}
}

class Z extends X {
	Y y = new Y();//����y���췽��
	
	Z() {
		super();//���๹�캯���ڿ�ͷ�൱����super();
		System.out.println("z");
	}
	
	{
		System.out.println("123");
	}
	
	public static void main(String[] args) {
		new Z();//�����������z���췽��
		
		//û��new Z();ʱ�������н��������
	}
}