package java_study_03;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		String username = "admin";
		String password = "123456";
		
		for(int x = 0; x < 3; x ++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�������û�����");
			String n = sc.nextLine();
			System.out.println("���������룺");
			String p = sc.nextLine();
			
			if(n.equals(username) && p.equals(password)) {
				System.out.println("��¼�ɹ�");
				break;
			} else {
				System.out.println("����" + (2-x) + "�λ���");
			}
		}
	}
}
