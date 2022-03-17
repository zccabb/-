package SingletonPattern;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: zcc
 * @Created_on: 2022/3/16/18:09
 * ./SingletonB.java
 */
public class SingletonB {
    private static SingletonB instance;
    private static final Object syncRoot= new Object();
    private SingletonB(){

    }
    public static SingletonB getInstance(){
        if(instance==null){
            Lock lock = new ReentrantLock();
            lock.lock();
            try {
                if(instance==null)
                    instance=new SingletonB();
            }finally {
                lock.unlock();
            }
        }
        return instance;
    }
}
