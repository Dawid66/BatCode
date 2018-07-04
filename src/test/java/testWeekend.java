import Warmup1.weekend;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testWeekend {
    @Test
    public void  weekendTest(){

        boolean result = weekend.sleepIn(false,false);
        boolean result2 =weekend.sleepIn(true,false);
        boolean result3 =weekend.sleepIn(false,true);
        boolean expect =true;
        boolean expect2 =false;
        Assert.assertTrue(result==expect);
        Assert.assertTrue(result2==expect2);
        Assert.assertTrue(result3==expect);


    }
}
