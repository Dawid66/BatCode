import Warmup1.frontAgain;
import org.junit.Assert;
import org.junit.Test;

public class frontAgainTest {
@Test
   public void front22Test(){
    String expectedresult1 = "kikittenki";
    String expectedresult2 = "HaHaHa";
    String expectedresult3 = "ababcab";
    Assert.assertEquals(frontAgain.front22("kitten"),expectedresult1);
    Assert.assertEquals(frontAgain.front22("Ha"),expectedresult2);
    Assert.assertEquals(frontAgain.front22("abc"),expectedresult3);
}
}