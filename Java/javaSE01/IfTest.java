/*
if���С��:�����·ݣ��жϼ��ں����°���
*/



import java.util.Scanner;
class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int x = sc.nextInt();
		
		if(x >=3 && x <=5) {
			System.out.println("��");
		}
		else if(x >=6 && x <=8) {
			System.out.println("��");
		}
		else if(x >=9 && x <=11) {
			System.out.println("��");
		}else System.out.println("��");
	}
}