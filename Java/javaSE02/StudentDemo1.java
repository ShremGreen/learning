/*
��װ����:
private
ע�⣺��private���εĳ�Աֻ���ڱ����з���
*/
class Student {
	private String name;
	private int age;
	
	public void setAge(int a) {
		if(a < 0 || age > 120) {
			System.out.println("����");
	}else {
		age = a;
	}
}

    public void setName(String n) {
		name = n;
	}
	
	public void show() {
		System.out.println("������" + name);
		System.out.println("���䣺" + age);
	}
}


class StudentDemo1 {
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
		System.out.println("--------------");
		
		//s.name = "���ٴ�";
		//s.age = 22;
		s.setAge(23);
		s.setName("���ٴ�");
		s.show();
	}
}