package helpers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.Test;

/**
 * @author Krzysztof Chmielewski
 */
public class SimpleListTest {

    @Test(expected = IllegalArgumentException.class)
    public void getFromEmptyList() throws Exception {
        SimpleList simpleList = new SimpleList();
        simpleList.get(0);
    }

    @Test
    public void getFromOneElementList() throws Exception {
        Object number = 5;
        SimpleList simpleList = new SimpleList(number);
        assertThat(simpleList.get(0), equalTo(number));
    }

    @Test
    public void getFromTwoElementList() throws Exception {
        Object firstNumber = 5;
        Object secondNumber = 3;
        SimpleList simpleList = new SimpleList(firstNumber);
        simpleList.add(secondNumber);
        assertThat(simpleList.get(1), equalTo(secondNumber));
    }

    @Test
    public void sizeForEmptyList() throws Exception {
        assertThat(new SimpleList().getSize(), equalTo(0));
    }

    @Test
    public void sizeForOneElementList() throws Exception {
        assertThat(new SimpleList(5).getSize(), equalTo(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeFromEmptyList() throws Exception {
        new SimpleList().remove(0);
    }

    @Test
    public void removeFromOneElementList() throws Exception {
        SimpleList simpleList = new SimpleList(2);
        simpleList.remove(0);
        assertThat(simpleList.getSize(), equalTo(0));
    }

    @Test
    public void removeFirst() throws Exception {
        Object first = 2;
        Object second = 3;
        SimpleList simpleList = new SimpleList(first);
        simpleList.add(second);
        simpleList.remove(0);
        assertThat(simpleList.getSize(), equalTo(1));
        assertThat(simpleList.get(0), equalTo(second));
    }

    @Test
    public void removeLast() throws Exception {
        Object first = 2;
        Object second = 3;
        Object third = 4;
        SimpleList simpleList = new SimpleList(first);
        simpleList.add(second);
        simpleList.add(third);
        simpleList.remove(2);
        assertThat(simpleList.getSize(), equalTo(2));
        assertThat(simpleList.get(0), equalTo(first));
        assertThat(simpleList.get(1), equalTo(second));
    }

    @Test
    public void removeMiddle() throws Exception {
        Object first = 2;
        Object second = 3;
        Object third = 4;
        SimpleList simpleList = new SimpleList(first);
        simpleList.add(second);
        simpleList.add(third);
        simpleList.remove(1);
        assertThat(simpleList.getSize(), equalTo(2));
        assertThat(simpleList.get(0), equalTo(first));
        assertThat(simpleList.get(1), equalTo(third));
    }
}