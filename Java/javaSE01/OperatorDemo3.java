/*
��������������Ҫ�ȵ���
import java.util.Scanner;  ����class�ϣ�
��������¼�����
Scanner sc = new Scanner(System.in);
ͨ�������ȡ����
int x = sc.nextInt();
*/
import java.util.Scanner;
class OperatorDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������a��");
		int a = sc.nextInt();
		System.out.println("������b��");
		int b = sc.nextInt();
		System.out.println("������c��");
		int c = sc.nextInt();
		
		int temp = ((a > b) ? a : b);
		int max = ((temp > c) ? temp : c);
		System.out.println("max=" + max);
		}
}