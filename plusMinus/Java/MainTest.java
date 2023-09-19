import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

class MainTest {
    private final Main plusMinus = new Main();

    @Test
    void returnRatio() {
        assertEquals(0.400000, Main.plusMinus(List.of(1, 1, 0, -1, -1)));
    }
}