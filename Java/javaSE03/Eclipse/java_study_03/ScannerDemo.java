package java_study_03;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		//����1
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.nextLine();
		//����������ַ����޷�¼�룬�����лس�
		System.out.println(".......................");
		
		//�������1��һ�㲻��
		int c =sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		String d = sc1.nextLine();
		//�������2���������ݶ���String¼�룬ʹ��ʱתΪ������ʽ
		
		
		
		
		//����2
		Scanner sc2 = new Scanner(System.in);
		boolean p = sc2.hasNextFloat();//����ֵΪboolean���ж��Ƿ�Ϊ������
		System.out.println(p);
	}
}
