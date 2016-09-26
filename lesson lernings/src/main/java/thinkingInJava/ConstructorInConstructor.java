package thinkingInJava;

/**
 * Created by pol on 2016-09-26.
 */
public class ConstructorInConstructor {

    public ConstructorInConstructor() {
        this(1);
        System.out.println("OK01");
    }

    public ConstructorInConstructor(int a) {
        System.out.println("OK02");
    }

    public ConstructorInConstructor(String b) {

        System.out.println("OK03");
    }


}
