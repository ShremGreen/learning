/*
private��get��set
Java��Ҫ��������֪�⣬���ǻ����age = age ����������ݾͽ�ԭ�����ս��Ϊ�ա�
��ʱ��Ҫ�õ�this�ؼ��֣���������ǰ���һ������
*/

class Student {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}

class PrivateTest1 {
	public static void main(String[] args) {
		Student s = new Student();
		
		s.setName("���ٴ�");
		s.setAge(22);
		
		System.out.println("name:" + s.getName() + "   age:" + s.getAge());
	}	
}