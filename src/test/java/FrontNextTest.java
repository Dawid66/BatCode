import Warmup1.FrontNext;
import org.junit.Assert;
import org.junit.Test;

public class FrontNextTest {
    @Test
    public void front3Test(){
        String expected1="aaa";
        String expected2="ababab";
        String expected3="chochocho";
        Assert.assertEquals(FrontNext.front3("a"),expected1);
        Assert.assertEquals(FrontNext.front3("ab"),expected2);
        Assert.assertEquals(FrontNext.front3("cho"),expected3);
    }

}