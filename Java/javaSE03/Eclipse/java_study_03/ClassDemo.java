package java_study_03;

import java_study_01.AnimalDemo;

public class ClassDemo {
	public static void main(String[] args) {
		AnimalDemo ad = new AnimalDemo() {
			
			@Override
			public void sleep() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				
			}
		};
		
		//getClass()������õ�ǰClass�ļ���ͨ��getName()������ø���·�������
		Class c = ad.getClass();
		String s = c.getName();
		System.out.println(s);//java_study_03.ClassDemo$1
		
		//������ʽ���ʵ��
		System.out.println(ad.getClass().getName());//java_study_03.ClassDemo$1
	}
}
