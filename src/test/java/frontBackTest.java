import Warmup1.frontBack;
import org.junit.Test;

import static org.junit.Assert.*;

public class frontBackTest {
    @Test
    public void testFrontBack(){
        String expect="eodc";
        String expect2="a";
        String expect3="ba";
        assertEquals(frontBack.frontBack123("code"),expect);
        assertEquals(frontBack.frontBack123("a"),expect2);
        assertEquals(frontBack.frontBack123("ab"),expect3);
    }

}