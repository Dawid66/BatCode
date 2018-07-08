package stringExercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class String12Test {
    @Test
    public void make(){
        String expected2 = "[[word]]";
        assertEquals(String12.makeOutWord("[[]]","word"),expected2);
    }

}