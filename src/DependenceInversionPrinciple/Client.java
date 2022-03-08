package DependenceInversionPrinciple;

/**
 * @Author: zcc
 * @Created_on: 2022/3/8/15:39
 * ./Client.java
 */
public class Client {
    public static void main(String[] args) {
        Mother mother = new Mother();
        mother.narrate(new Book());
        mother.narrate(new Newspaper());
    }
}
