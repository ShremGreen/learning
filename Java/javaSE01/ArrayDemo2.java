/*
1.ʹ��length��ȡ���鳤�ȣ���ʹ�����������ʽ���֡�
2.�������arr1�����ֵ��
3.�������arr1��
*/

class ArrayDemo2 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int[] arr1 = {2,5,3,4,1};
		
		printArr(arr);
		System.out.println("---------------");
		printArr1(arr1);
	    System.out.println("---------------");
		//������ֵ
		System.out.println(compare(arr1));
		System.out.println("---------------");
		//�ȵ��������ٵ������
		reverse(arr1);
		printArr(arr1);
	}
	//����һ����ӡ���鷽��
	public static void printArr(int[] arr) {
		for(int i = 0; i < arr.length; i ++) {
			System.out.println(arr[i]);
		}
	}
	//�ڶ��ִ�ӡ����
	public static void printArr1(int[] arr) {
		System.out.print("[");
		
		for(int i = 0; i < arr.length; i ++) {
			if(i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
	}
	//����һ��������ֵ����
	public static int compare(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i ++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;//һ����Ҫ���˷���ֵ������
	}
	//����һ�������������
	public static void reverse(int[] arr) {
		for(int i = 0; i < arr.length/2; i ++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
	}
}
}