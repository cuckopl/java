import helpers.SimpleList;

/**
 * @author Krzysztof Chmielewski
 */
public class SimpleListApp {
    public static void main(String[] args) {
        System.out.println("Adding five guys to a list: ");
        SimpleList simpleList = new SimpleList("Krzychu");
        simpleList.add("Pawel");
        simpleList.add("Zdzichu");
        simpleList.add("Zenon");
        simpleList.add("Ignacy");
        System.out.println(simpleList);
        System.out.println();

        System.out.println("Removing last one: ");
        simpleList.remove(simpleList.getSize() - 1);
        System.out.println(simpleList);
        System.out.println();

        System.out.println("Removing second one: ");
        simpleList.remove(1);
        System.out.println(simpleList);
        System.out.println();

        System.out.println("Removing first one: ");
        simpleList.remove(0);
        System.out.println(simpleList);
        System.out.println();

        System.out.println("Adding some weirdos: ");
        simpleList.add("Weirdo#1");
        simpleList.add("Weirdo#2");
        simpleList.add("Weirdo#3");
        System.out.println(simpleList);
    }
}
