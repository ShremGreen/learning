/*
����
ͨ�����÷��������ݿ���̨������������������ӡ��*������
*/
import java.util.Scanner;
class FunctionDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		printStar(i,j);
	}
	
	public static void printStar(int a, int b) {
		for(int i = 1; i <= a; i ++) {
			for(int j = 1; j<=b; j ++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}




