/*
������д
*/

class Phone {
	public void call(String name) {
		System.out.println("call" + name);
	}
}

class NewPhone extends Phone {
	public void call(String name) {
		super.call(name);
		
		//System.out.println("call" + name);//��绰Ӧ����һ��������ļ̳з�������������дһ��
		System.out.println("send massage to" + name);
	}
}

class ExtendsDemo6 {
	public static void main(String[] args) {
		NewPhone np = new NewPhone();
		
		np.call("���ٴ�");
	}
}