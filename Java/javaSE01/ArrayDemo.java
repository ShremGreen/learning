/*
����Ķ�̬��ʼ��
��ʽ��
int[] arr = new int[];
*/

class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		System.out.println("��ֵַ�ǣ� " + arr);
		for(int i = 0; i <= 2; i ++) {
			System.out.println(arr[i]);
		}
		
		int[] arr1 = arr;//����arr1����ʱ��ַΪarr
		
		arr1[0] = 5;//ͨ������arr1�޸�����arr��Ԫ��
		arr1[1] = 6;
		
		System.out.println("��ֵַ�ǣ� " + arr1);
		for(int i = 0; i <= 2; i ++) {
			System.out.println(arr1[i]);
		}
	}
}