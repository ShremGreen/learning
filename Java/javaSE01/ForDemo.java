/*
forѭ������:������е�ˮ�ɻ���
ˮ�ɻ����Ǹ���λ������λ���������͵����䱾��
153 = 1^3 + 5^3 + 3^3
*/

class ForDemo {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 100; i <= 999; i++) {
			int a = i%10;
			int b = i/10%10;
			int c = i/10/10%10;
			
			if((a*a*a + b*b*b + c*c*c) == i) {
				System.out.println(i);
				sum += 1; //sum ++;
			}
		}
		System.out.println("һ����" + sum + "��ˮ�ɻ���");
	}
}