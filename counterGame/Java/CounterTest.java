import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
    private final Counter counter = new Counter();

    @Test
    void moves() {
        assertEquals("Richard", counter.counterGame(1560834904));
    }

    @Test
    void moves1() {
        assertEquals("Richard", counter.counterGame(1768820483));
    }

    @Test
    void moves2() {
        assertEquals("Louise", counter.counterGame(1533726144));
    }

    @Test
    void moves3() {
        assertEquals("Richard", counter.counterGame(1620434450));
    }

    @Test
    void moves4() {
        assertEquals("Louise", counter.counterGame(1463674015));
    }

    @Test
    void moves5() {
        assertEquals("Richard", counter.counterGame(1246326493));
    }
}
