package lessons.twoWayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.*;

/**
 * Created by pol on 2016-10-04.
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class DoubleLinkedListTest {


    @Test(expected = IllegalArgumentException.class)
    public void add() throws Exception {

        DoubleLinkedListInterface testList = new DoubleLinkedList();

        DoubleLinkedNodeInterface testNode1 = new DoubleLinkedNode("Ploow list hard 1");
        DoubleLinkedNodeInterface testNode2 = new DoubleLinkedNode("Ploow list hard 2");
        DoubleLinkedNodeInterface testNode3 = new DoubleLinkedNode("Ploow list hard 3");

        testList.add(testNode1);
        assertThat(testList.get(1), DoubleLinkedNode);

        testList.add(testNode2);
        testList.add(testNode3);

        testList.remove(1);
        testList.remove(1);

    }


    @Test(expected = IllegalArgumentException.class)
    public void fetchElementDoesntExists() throws Exception {

        DoubleLinkedListInterface testList = new DoubleLinkedList();

        DoubleLinkedNodeInterface testNode1 = new DoubleLinkedNode("Ploow list hard 1");
        DoubleLinkedNodeInterface testNode2 = new DoubleLinkedNode("Ploow list hard 2");
        DoubleLinkedNodeInterface testNode3 = new DoubleLinkedNode("Ploow list hard 3");

        testList.add(testNode1);
        assertThat(testList.get(0), notNullValue());

        testList.add(testNode2);
        testList.add(testNode3);

        testList.remove(1);
        testList.remove(1);

    }

    @Test
    public void set() throws Exception {

    }

    @Test
    public void remove() throws Exception {

    }

    @Test
    public void size() throws Exception {

    }

    @Test
    public void get() throws Exception {

    }

}