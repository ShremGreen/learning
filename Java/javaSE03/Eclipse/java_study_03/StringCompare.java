package java_study_03;
/*
 * 1.==��equals����	equalsֻ�Ƚϵ�ֵַ�Ƿ���ͬ����Ҫ��д����String������д��equals()�������Ƚϵ��������Ƿ���ͬ
 * 2.String s2 = "hello";��String s1 = new String("hello");������
 * ǰ�����ַ��������أ����������п��ٵ�ַ���ڴ棬���߻����ڶ��ڴ��п���
 * */
public class StringCompare {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		//������д���
		String s3 = "hello";
		String s4 = "world";
		String s5 = "helloworld";
		
		System.out.println(s5 == s3 + s4);//false
		System.out.println(s5.equals(s3 + s4));//true
		
		//�������ǰ�Ƚ���ƴ���ٱȽϣ�Ҳ����˵����ʱ�൱����һ���ж�
		System.out.println(s5 == "hello" + "world");//true
		
		System.out.println(s5 == "helloworld");//true
		}
}
