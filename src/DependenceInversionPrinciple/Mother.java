package DependenceInversionPrinciple;

/**
 * @Author: zcc
 * @Created_on: 2022/3/8/15:37
 * ./Mother.java
 */
public class Mother {
    public void narrate(IRead reader){
        System.out.println("妈妈讲的是:");
        System.out.println(reader.getContent());
    }
}
