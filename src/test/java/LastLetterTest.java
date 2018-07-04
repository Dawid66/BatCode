import Warmup1.LastLetter;
import org.junit.Assert;
import org.junit.Test;

public class LastLetterTest {
    @Test
    public void backAroundTest(){
        String expectedresult1 = "tcatt";
        String expectedresult2 = "oheloo";
        String expectedresult3 = "aaa";

        Assert.assertEquals(LastLetter.backAround("cat"),expectedresult1);
        Assert.assertEquals(LastLetter.backAround("helo"), expectedresult2);
        Assert.assertEquals(LastLetter.backAround("a"),expectedresult3);
    }

}