import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculateTest {

    @Test
    void testCalculateFactorialZero() {
        assertEquals(1, FactorialCalculate.factorialCalculate(0));
    }

    @Test
    void testCalculateFactorialPositive() {
        assertEquals(120, FactorialCalculate.factorialCalculate(5));
    }

    @Test
    void testCalculateFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculate.factorialCalculate(-1));
    }
}