/*
����¼��һ�����֣��������в��ң��ҵ���������
*/
import java.util.Scanner;
class ArrayText1 {
	public static void main(String[] args) {
		int[] arr = {5,6,9,2,4};
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int add = getIndex(arr,x);
		System.out.println("����ֵ��" + add);
		
		int add1 = getIndex(arr,x);
		System.out.println("����ֵ��" + add1);
	}
	
	public static int getIndex(int[] arr, int value) {
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] == value) {
				return i;
	}	
   }
        return -1;//�������ֵû������ʱ��һ�㷵��һ����-1��
  }
  
    //����2��
	public static int getIndex1(int[] arr, int value) {
		int index = -1;
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] == value) {
				index = i;
				break;
			}
		}
		return index;
	}		
}