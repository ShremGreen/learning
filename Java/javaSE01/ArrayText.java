/*
���󣺼���¼�����֣���������������ڼ�
*/

import java.util.Scanner;
class ArrayText {
	public static void main(String[] args) {
		String[] strArr = {"����һ","���ڶ�","������","������","������","������","������"};
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		System.out.println(strArr[i - 1]);
	}
}