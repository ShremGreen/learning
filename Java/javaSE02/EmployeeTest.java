/*
���󣺶���һ��Ա���ࣻ
*/

class Employee {
	private String Id;
	private String name;
	private int age;
	
	//���幹�췽��
	public Employee() {}
	
	//set����
	public void setId(String Id) {
		this.Id = Id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//get����
	public String getId() {
		return Id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	//show����
	public void show() {
		System.out.println("Ա��ID��" + Id + "\n" + "Ա��������" + name + "\n" + "Ա�����䣺" + age);
	}
}

class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId("xidian17040410032");
		e.setName("���ٴ�");
	    e.setAge(22);
		
		e.show();
	}
}