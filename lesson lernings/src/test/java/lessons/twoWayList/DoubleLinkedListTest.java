package lessons.twoWayList;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;

/**
 * Created by pol on 2016-10-04.
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class DoubleLinkedListTest {

    /**
     * C
     * @param nodeCount
     * @return
     */
    public LinkedListInterface getTestList(int nodeCount){
        LinkedListInterface testLinkedList = new LinkedList();
        for (int i=0; i<nodeCount;i++){
            testLinkedList.add(new LinkedNode("NODE NR "+i));
        }

        return testLinkedList;
    }


    @Test
    public void add() throws Exception {

        LinkedListInterface testList = getTestList(0);
        LinkedNodeInterface lastNode = new LinkedNode("LAST");
        testList.add(lastNode);

        Assert.assertTrue(testList.get(0).getData().equals("LAST"));

    }


    @Test(expected = IllegalArgumentException.class)
    public void fetchElementDoesntExists() throws Exception {
        LinkedListInterface testList = getTestList(4);
        LinkedNodeInterface lastNode = new LinkedNode("LAST");
        testList.add(lastNode);

        testList.get(4);

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