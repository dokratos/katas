import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CamelCaseTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    private final CamelCase formatter = new CamelCase();

    @Test
    void printTheRightFormat() {
        formatter.formatter("S;M;plasticCup()");
        assertEquals("plastic cup", outputStreamCaptor.toString().trim());
    }

    @Test
    void printTheRight() {
        formatter.formatter("C;M;white sheet of paper");
        assertEquals("whiteSheetOfPaper()", outputStreamCaptor.toString().trim());
    }

    @Test
    void printTheFormat() {
        formatter.formatter("C;C;coffee machine");
        assertEquals("CoffeeMachine", outputStreamCaptor.toString().trim());
    }
}
