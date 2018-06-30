import org.junit.Assert;
import org.junit.Test;

public class monkeyTest {
    @Test
   public void testMonkey(){
        boolean expect =true;
        boolean expect2 =false;
        Assert.assertTrue(monkey.monkeyTrouble(true,true)==expect);
        Assert.assertTrue(monkey.monkeyTrouble(false,false)==expect);
        Assert.assertTrue(monkey.monkeyTrouble(true,false)==expect2);
    }
}
