/*
��˾�����۶����
ĳ��˾���ռ��Ⱥ��·�ͳ�Ƶ���������:��λ(��Ԫ)
��һ����: 22,66,44
�ڶ�����: 77,33,88
��������: 25,45,65 
���ļ���: 11,66,99
*/

class Array2Test2 {
	public static void main(String[] args) {
		int[][] arr = {{22,66,44},{77,33,88},{25,45,56},{11,45,37}};
		int sum = 0;
		for(int i = 0; i < arr.length; i ++) {
			for(int j = 0; j < arr[i].length; j ++) {
				sum += arr[i][j];
			}
		}
		System.out.println("�������ǣ�" + sum);
	}
}