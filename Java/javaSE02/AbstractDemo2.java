/*
�����ࣺ��ͨԱ���;���

������
���ԣ����ǹ�˾Ա����private String name;
					private String id;
					private int salary;
					public void work() {}
					���Եķ���ʹ��abstract,���󷽷�
���ԣ�
����		�н���
*/


//������ע�⣡����
abstract class Employee {
	//���ԣ�˽��
	private String name;
	private String id;
	private int salary;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	
	//һ�������˹��췽��������������
	public Employee() {}
	public Employee(String name, String id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public abstract void work();
}

class Worker extends Employee {
	public Worker() {}
	public Worker(String name, String id, int salary) {
		super(name, id, salary);
	}
	
	public void work() {
		System.out.println("�����ڹ���...");
	}
}

class Manager extends Employee {
	private int bonus;
	
	public Manager() {}
	public Manager(String name, String id, int salary, int bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}
	
	public void work() {
		System.out.println("����������...");
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getBonus() {
		return bonus;
	}
}

class AbstractDemo2 {
	public static void main(String[] args) {
		//ʹ�ö�̬����worker
		Employee e = new Worker("���ٴ�", "17040410032", 2000);
		System.out.println(e.getName() + e.getId() + e.getSalary());
		
		//ʹ�ö�̬����manager,������Ϊ������Ǹ��ࣨ��Ƥ��������û�н��𷽷�
		/*
		e = new manager("����ͷ", "17040410033", 5000, 2000);
		System.out.println(e.getName() + e.getId() + e.getSalary());
		*/
		
		//��������������
		Manager m = new Manager("����ͷ", "17040410033", 5000, 2000);
		System.out.println(m.getName() + m.getId() + m.getSalary());
	}
}