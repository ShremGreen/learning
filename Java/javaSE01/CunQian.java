/*
Aÿ���Ǯ2.5Ԫ.
������Ϊ5�ı���ʱ��A����6Ԫ.
�ʣ�
   �������A�г���100Ԫ.
*/

class CunQian {
	public static void main(String[] args) {
		int day = 1;
		double dailyMoney = 2.5;
		double moneySum = 0;
		
		while(true) {
			moneySum += dailyMoney;
			System.out.println("��" + day + "����" + moneySum + "Ԫ");
			
			if(moneySum >= 100) {
				break;
			}
			if(day%5 == 0) {
				moneySum -= 6;
			}
			
			day ++;
		}
		System.out.println("��" + day + "�쳬��100Ԫ");
	}
}
