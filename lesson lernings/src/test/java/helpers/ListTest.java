package helpers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;


/**
 * Created by pol on 2016-09-14.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class ListTest {
    @Test(expected = IllegalArgumentException.class)
    public void checkGetForZeroElements() throws Exception {
        List list = new List();
        list.get(0);
    }


    @Test
    public void checkGetForZeroOneElement() throws Exception {
        List list = new List();
        list.add(new Node());
        assertThat(list.get(0), notNullValue());
    }
}