package DependenceInversionPrinciple;

/**
 * @Author: zcc
 * @Created_on: 2022/3/8/15:35
 * ./NewPaper.java
 */
public class Newspaper implements IRead{
    public String getContent(){
        return "报纸上的信息";
    }
}
