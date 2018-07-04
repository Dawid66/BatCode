import Warmup1.multiple;
import org.junit.Assert;
import org.junit.Test;

public class multipleTest {
    @Test
    public void or35Test() {
        boolean expectedresult1 = true;
        boolean expectedresult2 = false;
        Assert.assertEquals(multiple.or35(3),expectedresult1);
        Assert.assertEquals(multiple.or35(10),true);
        Assert.assertEquals(multiple.or35(8),false);
        Assert.assertEquals(multiple.or35(0),false);

    }
}