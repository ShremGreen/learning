
//ʵ���������Ľ���

class OperatorTest {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		//1.��һ������
		//2.λ���
		/*a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		//3.�Ӽ���
		a = a + b;
		b = a - b;
		a = a - b;*/
		//4.һ�仰
		b = (a + b) - (a = b);
		
		System.out.println("a:" + a + "b:" + b);
	}
}