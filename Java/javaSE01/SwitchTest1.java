/*

*/
import java.util.Scanner;

class SwitchTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����룺");
		String s = sc.nextLine();
		
		switch(s) {
			case "yes":
			     System.out.println("��������yes");
				 break;
			case "no":
			     System.out.println("��������no");
				 break;
			default:
			     System.out.println("��������");
				 //break;
		}
	}
}