package java_study_03;
/*
 * hash�뽫����ĵ�ֵַתΪ�������
 * */
import java_study_01.AnimalDemo;

public class HashCodeDemo {
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
		System.out.println(ad.hashCode());//1784662007
	}
	
}
