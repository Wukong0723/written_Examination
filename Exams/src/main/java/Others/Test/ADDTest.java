package Others.Test;

import org.junit.Test;

import static org.junit.Assert.*;

public class ADDTest {

    @Test
    public void add() {
        assertEquals(2,new ADD().add(1,1));
    }
}