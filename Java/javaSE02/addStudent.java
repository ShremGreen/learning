import java.util.ArrayList;
import java.util.Scanner;

public class addStudent {
    public addStudent(ArrayList<Student> arr) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("������ѧ��������");
            String name = sc.nextLine();
            s.setName(name);

            System.out.println("������ѧ�����䣺");
            int age = sc.nextInt();
            s.setAge(age);

            System.out.println("������ѧ��id��");
            String ID = sc.nextLine();
            s.setId(ID);

            arr.add(s);
            System.out.println("�������ѧ����Ϣ��   ����/��");
            String x = sc.nextLine();
            if(x == "��") {
                break;
            }
        }
        System.out.println("ѧ����Ϣ¼�����");
    }
}
