package helpers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


/**
 * Created by pol on 2016-09-14.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class ListTest {


    @Before
    public void setUp() throws Exception {


    }



    @Test(expected = IllegalArgumentException.class)
    public void checkGet() throws Exception {
        List testList = new List();

        List list = new List();
        list.get(0);
    }
}