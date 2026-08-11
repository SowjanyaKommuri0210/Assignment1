import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class subtractorTest {

    @Test
    public void testSubtract() {
        subtractor subtractor = new subtractor();

        assertEquals(2, subtractor.subtract(5, 3));
        assertEquals(-2, subtractor.subtract(3, 5));
        assertEquals(0, subtractor.subtract(5, 5));
    }
}
