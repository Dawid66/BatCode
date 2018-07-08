package stringExercises;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class helloTest {
    @Test
    public void helloNameTest() {
        String expected1 = "Hello Bob!";

        String expected3 = "Hello X!";
        assertEquals(hello.helloName("Bob"), expected1);

    }

}