import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculateTest {

    @Test
    public void testCalculateFactorialZero() {
        Assert.assertEquals(1, FactorialCalculate.factorialCalculate(0));
    }

    @Test
    public void testCalculateFactorialPositive() {
        Assert.assertEquals(120, FactorialCalculate.factorialCalculate(5));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateFactorialNegative() {
        FactorialCalculate.factorialCalculate(-1);
    }
}