/*
��̬���úͷǾ�̬����

����
1.��������
2.�����ֵ
*/

class ArrayTest {
	public static void main(String[] args) {
		int[] arr = new int[]{2,6,4,5,9};
		
		//�ڲ��������½�һ���࣬���÷Ǿ�̬����
		/*
		ArrayDemo ad = new ArrayDemo();
	    ad.printArr(arr);
		*/
	    
		//ͨ���������þ�̬����
	    ArrayDemo.printArr(arr);
		
		int max = ArrayDemo.getMax(arr);
		System.out.println("Max:" + max);
		
		int num = 5;
		int index = ArrayDemo.getIndex(arr, num);
		System.out.println("Index:" + index);
	}
	
	//��ò�Ҫ�ڲ������д����޹���
	/*
	
	public static void printArr(int[] arr) { //ע�������þ�̬��������
		for(int i = 0; i < arr.length; i ++) {
			if(i == arr.length - 1) {
				System.out.println(arr[i]);
			} else {
				System.out.print(arr[i] + "  ");
			}
		}
	}
	*/
}

