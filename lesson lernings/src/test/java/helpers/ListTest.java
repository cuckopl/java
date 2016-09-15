package helpers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;


/**
 * Created by pol on 2016-09-14.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class ListTest {

    private List list;


    private Node node1 = new Node();
    private Node node2 = new Node();
    private Node node3 = new Node();
    private Node node4 = new Node();
    private Node node5 = new Node();

    private List setUpMyList() {
        list = new List();


        node1.data = "node1";
        node2.data = "node2";
        node3.data = "node3";
        node4.data = "node4";
        node5.data = "node5";
        return list;
    }

    @Before
    public void setUp() throws Exception {
        setUpMyList();

    }

    @Test
    public void checkAddElementData() throws Exception {
        list.add(node1);
        Assert.assertEquals(node1.data, list.get(1).data);

    }

    @Test
    public void checkElementCount() throws Exception {
        list.add(node1);
        Assert.assertEquals(1, list.getItemCount());
        list.add(node2);
        Assert.assertEquals(2, list.getItemCount());

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkGetForZeroElements() throws Exception {
        List list = new List();
        list.get(0);
    }


    @Test
    public void checkGetFirstElementData() throws Exception {
        list.add(node1);
        Assert.assertEquals(node1.data, list.get(1).data);
    }

    @Test
    public void checkGetLastElementData() throws Exception {
        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.add(node4);
        Assert.assertEquals(node4.data, list.get(4).data);
    }


    @Test
    public void removeFirstElementTest() throws Exception {
        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.add(node4);

        list.remove(1);
        Assert.assertEquals(node2.data, list.get(1).data);
    }

    @Test
    public void removeLastElementTest() throws Exception {
        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.add(node4);
        list.remove(4);
        Assert.assertEquals(node3.data, list.get(3).data);
    }
}