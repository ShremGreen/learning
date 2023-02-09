package ClassLoading;
/*
寻找类加载器
 */
public class ClassLoaderTest01 {
    public static void main(String[] args) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println(loader);//sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(loader.getParent());//sun.misc.Launcher$ExtClassLoader@424c0bc4
        System.out.println(loader.getParent().getParent());//null
    }
}
