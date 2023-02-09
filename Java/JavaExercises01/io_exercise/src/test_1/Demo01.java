package test_1;

public class Demo01 {
    public static void main(String[] args) {
        // "a" "b" 被放入串池中，str 则存在于堆内存之中
        String str = new String("a") + new String("b");
        // 调用 str 的 intern 方法，这时串池中没有 "ab" ，则会将该字符串对象放入到串池中，此时堆内存与串池中的 "ab" 是同一个对象
        String st2 = str.intern();
        // 给 str3 赋值，因为此时串池中已有 "ab" ，则直接将串池中的内容返回
        String str3 = "ab";
        // 因为堆内存与串池中的 "ab" 是同一个对象，所以以下两条语句打印的都为 true
        System.out.println(str == st2);
        System.out.println(str == str3);
    }
}
