import Warmup1.kitten;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class kittenTest {
    @Test
    public void testK()

    {
        String expectedresult1 = "ktten";
        String expectedresult2 = "itten";
        String expectedresult3 = "kittn";

        Assert.assertEquals(kitten.missingChar("kitten", 1),expectedresult1);
        Assert.assertEquals(kitten.missingChar("kitten", 0), expectedresult2);
        Assert.assertEquals(kitten.missingChar("kitten", 4), expectedresult3);
    }
}