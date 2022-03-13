package reflection.chapter1;/**
 * Created by Administrator on 2021/11/18.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/11/18 16:17
 **/
public class ReflectionClass {

    private static void method1(){
        Class cls = String.class;
        System.out.println(cls);
    }

    private static void method2(){
        String s = "Hello";
        Class cls = s.getClass();
        System.out.println(cls);
    }

    private static void method3() {
        try {
            Class cls = Class.forName("java.lang.String");
            System.out.println(cls);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void classCompare(){
        Class cls1 = String.class;
        String s = "Hello";
        Class cls2 = s.getClass();
        boolean sameClass = cls1 == cls2;
        System.out.println(sameClass);
    }

    private static void instanceCompareClass(){
        Integer n = new Integer(123);

        // true，因为n是Integer类型
        boolean b1 = n instanceof Integer;
        // true，因为n是Number类型的子类
        boolean b2 = n instanceof Number;
        // true，因为n.getClass()返回Integer.class
        boolean b3 = n.getClass() == Integer.class;
        // false，因为Integer.class!=Number.class
//        boolean b4 = n.getClass() == Number.class;
        System.out.println(String.format("b1=%b,b2=%b,b3=%b", b1, b2, b3));
    }

//    private void printClassInfo(Object obj){
//        Class cls = obj.getClass();
//    }

    static void printClassInfo(Class cls) {
        System.out.println("Class name: " + cls.getName());
        System.out.println("Simple name: " + cls.getSimpleName());
        if (cls.getPackage() != null) {
            System.out.println("Package name: " + cls.getPackage().getName());
        }
        System.out.println("is interface: " + cls.isInterface());
        System.out.println("is enum: " + cls.isEnum());
        System.out.println("is array: " + cls.isArray());
        System.out.println("is primitive: " + cls.isPrimitive());
    }

    public static void main(String[] args) {
//        method1();
//        method2();
//        method3();
//        classCompare();
//        instanceCompareClass();
        printClassInfo("".getClass());
        printClassInfo(Runnable.class);
        printClassInfo(java.time.Month.class);
        printClassInfo(String[].class);
        printClassInfo(int.class);
    }
}