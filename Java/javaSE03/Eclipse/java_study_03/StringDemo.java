package java_study_03;

public class StringDemo {
	public static void main(String[] args) {
		//�ֽ�����ת��Ϊ�ַ���
		byte[] b = {97,77,90,85,106};
		String s1 = new String(b);
		System.out.println(s1);
		
		//�ַ�����ת��Ϊ�ַ���
		char[] c = {'a','c','l','��'};
		String s2 = new String(c);
		System.out.println(s2);
	}
}
