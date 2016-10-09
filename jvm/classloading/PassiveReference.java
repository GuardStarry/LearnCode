package jvm.classloading;

/**
 * Created by Misaka on 16/8/22.
 */
public class PassiveReference {
    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}
class SuperClass{
    static {
        System.out.println("SuperClass init");
    }
    public static int value = 123;
}
class SubClass extends SuperClass{
    static {
        System.out.println("SubClass init");
    }
}