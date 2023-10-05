import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PangramTest {
    private final Pangram pangram = new Pangram();

    @Test
    void checkPangram() {
        assertEquals("pangram", pangram.pangrams("We promptly judged antique ivory buckles for the next prize"));
    }

    @Test
    void checkNotPangram() {
        assertEquals("not pangram", pangram.pangrams("We promptly judged antique ivory buckles for the prize"));
    }

    @Test
    void checkEmpty() {
        assertEquals("not pangram", pangram.pangrams(""));
    }
}