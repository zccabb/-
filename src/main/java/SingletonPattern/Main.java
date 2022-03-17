package SingletonPattern;

/**
 * @Author: zcc
 * @Created_on: 2022/3/16/17:49
 * ./Main.java
 */
public class Main {
    public static void main(String[] args) {
        SingletonA singleton1 = SingletonA.getInstance();
        SingletonA singleton2 = SingletonA.getInstance();

        if(singleton1==singleton2){
            System.out.println("两个对象是相同的实例");
        }

        Singleton singleton3 = Singleton.SingletonC.getInstance();
        Singleton singleton4 = Singleton.SingletonC.getInstance();
        if(singleton3==singleton4){
            System.out.println("两个对象是相同的实例");
        }
    }
}
