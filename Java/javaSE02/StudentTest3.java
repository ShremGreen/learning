/*
����ֵ���ͣ�
�������ͣ�
��		
������	
�ӿ�	
*/

class Student {
	public void study() {
		System.out.println("ѧϰ...");
	}
}

class StudentDemo {
	public Student getStudy() {
		Student s = new Student();
		return s;
		
		//�򻯰�
		//return new Student();
	}
}

class StudentTest3 {
	public static void main(String[] args) {
		 //���study()
		 StudentDemo sd = new StudentDemo();
		 Student s = sd.getStudy();
		 s.study();
	}
}

