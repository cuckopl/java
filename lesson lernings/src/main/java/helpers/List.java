package helpers;

/**
 * Created by Paweł Cudziło on 2016-09-14.
 */
public class List {


    private Node head = null;



    public boolean add (Node node) {
        if (head==null){
            head= node;
        }else{
            head.setPrev(node);
        }
        return true;
    }

    public boolean remove (Node node) {

        return true;
    }

    public boolean get (Node node) {

        return true;
    }


}
