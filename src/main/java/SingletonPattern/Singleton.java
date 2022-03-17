package SingletonPattern;

/**
 * @Author: zcc
 * @Created_on: 2022/3/16/18:22
 * ./SingletonC.java
 */
public sealed class Singleton  {
    public static final class SingletonC extends  Singleton{

    }
    private static final Singleton instance = new Singleton();
    private Singleton(){
    }
    public static Singleton getInstance(){
        return instance;
    }
}
