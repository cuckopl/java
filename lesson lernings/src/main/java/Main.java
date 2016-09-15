/**
 * Created by Paweł Cudziło on 2016-09-13.
 */

import helpers.*;

public class Main {


    public static void main(String[] args) {

        List testList = new List();

        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        Node node5 = new Node();

        node1.data = "node1";
        node2.data = "node2";
        node3.data = "node3";
        node4.data = "node4";
        node5.data = "node5";


        testList.add(node1);
        testList.add(node2);
        testList.add(node3);
        testList.add(node4);
        testList.add(node5);

        testList.get(4);
        testList.get(5);

        testList.remove(5);
        testList.remove(1);
        testList.remove(4);




    }
}
