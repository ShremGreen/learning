/*
ʹ�ð����ĵ�������math��
�ɼ���math������java.lang���У�����Ҫ����
*/

class MathDemo {
	public static void main(String[] args) {
		//��ȡһ�������
		double d = Math.random();
		
		for(int i = 0; i < 100; i ++) {
		//Ĭ������������double�ͣ�ǿ��ת��Ϊint��
			int x = (int) (Math.random() * 100 + 1);
			System.out.println(x);
		}
	}
}