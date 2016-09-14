package helpers;

/**
 * Created by Paweł Cudziło on 2016-09-14.
 */
public class Node {

    private Node prev = null;
    private int index;


    public String data;


    public Node getprev() {
        return prev;
    }

    public void setPrev (Node node){
        if(getprev()==null){
            prev = node;
        }else{
            prev.setPrev(node);
        }
    }


}
