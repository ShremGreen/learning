/*
��һ��java�ļ���д�����ࣺ������Ͳ�����
ע�⣺�ļ����Ͳ�������һ��
*/

//�����һ����
class Student {
	String name;//null
	int age;//0
	String address;//null
	//����ѧ�����µķ���
	public void study() {
		System.out.println("ѧϰ�С���");
	}
	
	public void relax(String name) {
		System.out.println("��" +name+ "�����С���");
	}
	
	public void rest() {
		System.out.println("��Ϣ�С���");
	}
}

class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		
		s.name = "���ٴ�";
		s.age = 22;
		s. address = "ɽ��";
		
		System.out.println(s.name + "     " + s.age + "     " + s.address);
		
		s.study();
		s.relax("lala");
		s.rest();
}
}