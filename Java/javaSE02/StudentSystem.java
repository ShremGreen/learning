import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public StudentSystem(ArrayList<Student> arr) {
        while (true) {
            System.out.println("........ѧ��ϵͳ........");
            System.out.println("1.���ѧ��");
            System.out.println("2.ɾ��ѧ��");
            System.out.println("3.�޸�ѧ��");
            System.out.println("4.�鿴����ѧ��");
            System.out.println("5.�˳�");

            System.out.println("������:");
            //����¼��2
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            switch (s) {
                case "1":
                    System.out.println("���ѧ��");
                    new addStudent(arr);
                    break;
                case "2":
                    System.out.println("ɾ��ѧ��");
                    break;
                case "3":
                    System.out.println("�޸�ѧ��");
                    break;
                case "4":
                    System.out.println("�鿴����ѧ��");
                    break;
                case "5":
                    System.out.println("ллʹ��");
                    //break;
                    System.exit(0);//JVM�˳�//�����ñ�־λ�������ѭ��
                default:
                    System.out.println("�������󣡣���");
                    break;
            }
        }
    }
}