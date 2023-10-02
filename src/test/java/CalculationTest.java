import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CalculationTest {
    @Test
    public void testGCD1() throws Exception {
            int output = Calculation.gcd(0, 2);
            assertEquals(2, output);
    }

    @Test
    public void testGCD2() throws Exception {
            int output = Calculation.gcd(5, 0);
            assertEquals(5, output);
    }

    @Test
    public void testGCD3() throws Exception {
            int output = Calculation.gcd(-1, -3);
            assertEquals(1, output);
    }

    @Test
    public void testGCD4() throws Exception {
            int output = Calculation.gcd(6, 4);
            assertEquals(2, output);
    }
}