/*
������
*/

import java.util.Scanner;
class Game1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = (int) (Math.random() * 100 + 1);
		
		while(true) {
			System.out.println("���������֣�");
			int b = sc.nextInt();
			if(a > b) {
				System.out.println("С��");
			} else if(a < b) {
				System.out.println("����");
			} else {
				System.out.println("�����ˣ�����");
				break;//ע����������һ��ѭ������if����ѭ��
			}
		}
	}
}