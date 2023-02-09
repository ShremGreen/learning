/**
*�����������Ĳ����Ĺ�����
*@author ���ٴ�
*@version V0.0
*/

public class ArrayDemo {
	//�ѹ��췽��˽�У����Ͳ��ܴ�������ֻ��ͨ���������þ�̬����
	/**
	*����˽�й���
	*/
	private ArrayDemo() {}
	
	/**
	*���Ǳ�������ķ�����������ĸ�ʽ�ǣ�Ԫ��1  Ԫ��2  Ԫ��3...
	*@param arr ����Ҫ������������
	*/
	public static void printArr(int[] arr) { //ע�������þ�̬��������
		for(int i = 0; i < arr.length; i ++) {
			if(i == arr.length - 1) {
				System.out.println(arr[i]);
			} else {
				System.out.print(arr[i] + "  ");
			}
		}
	}
	
	/**
	*���ǻ�ȡ���������ֵ�ķ���
	*@param arr ����Ҫ����������
	*@return ���������е����ֵ
	*/
	public static int getMax(int[] arr) {
		int max = arr[0];
		int i = 0;
		
		while(i < arr.length) {
			if(arr[i] > max) {
				max = arr[i];
			}
			i ++;
		}
		return max;
	}
	/**
	*���ǻ�ȡԪ��λ�õķ���
	*@param arr ����Ҫ����������
	*@param num ����Ҫ�������
	*/
	public static int getIndex(int[] arr, int num) {
		int index = -1;
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] == num) {
				index = i;
			}
		}
		return index;
	}
}