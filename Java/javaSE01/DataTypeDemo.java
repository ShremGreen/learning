/*����������ע�⣺����Ĭ��int��������Ĭ��double��
    float����ʱ��ĩβ��F��long����ʱ��ĩβ��L��              

*/


class DataTypeDemo {
	public static void main(String[] args) {
		byte a = 10;
		System.out.println(a);
		short b = 100;
		System.out.println(b);
		long c = 100000000000L;
		System.out.println(c);
		float f = 34.56789F;
		System.out.println(f);
		double d = 12.345;
		System.out.println(d);
		char ch = 'a';
		System.out.println(ch);
		boolean flag = true;
		System.out.println(flag);
		int x = 3;
		byte y = 4;
		//byte z = x + y;��ʾ��ʧ����
        int z = x + y;
        System.out.println(z);		
	}
}