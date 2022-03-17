package SingletonPattern;

/**
 * @Author: zcc
 * @Created_on: 2022/3/16/17:45
 * ./Singleton.java
 */
public class SingletonA {
    private static SingletonA instance;

    private SingletonA(){
    }
    public static SingletonA getInstance(){
        if(instance==null){
            instance = new SingletonA();
        }
        return  instance;
    }
}
