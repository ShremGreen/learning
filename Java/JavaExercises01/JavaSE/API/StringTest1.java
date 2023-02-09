package JavaSE;

import java.util.Scanner;

/*
* 需求：
* 将字符串转为首字母大写其余小写，再输出
*
* 思路：
* 1.挑出首字母并大写    substring(a,b)      toUpperCase()
* 2.剩下部分小写       substring(b)        toLowerCase()
* 3.拼接1、2          s1.concat(s2)
* */
public class StringTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input:");
        String s = sc.nextLine();

        String s1 = s.substring(0,1);
        String s2 = s.substring(1);

        String s3 = s1.toUpperCase().concat(s2.toLowerCase());
        System.out.println("output:\n" + s3);
    }
}
