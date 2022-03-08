package DependenceInversionPrinciple;

/**
 * @Author: zcc
 * @Created_on: 2022/3/8/15:30
 * ./Book.java
 */
public class Book implements IRead{
    @Override
    public String getContent()
    {
        return "书上的故事";
    }
}
