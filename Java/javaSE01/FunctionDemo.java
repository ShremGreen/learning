/*
ͨ���������ã�ʵ�ֱȽ��������Ƿ����
*/

import java.util.Scanner;
class FunctionDemo {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����һ����");
		int a = sc.nextInt();
		System.out.println("����ڶ�����");
		int b = sc.nextInt();
		
		boolean c = compare(a,b);
		System.out.println(c);
	}
	
	public static boolean compare(int x,int y) {
		/*if(x == y) {
			return true;
		}else {
			return false;
	  }*/
	  
	    //boolean z = ((x == y) ? true : false);
		//return z;
		
		return (x == y);
		
	}
}