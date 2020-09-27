import org.junit.*;

import static org.junit.Assert.*;

public class CalcTest {
    @Test
    public void testAdd() {
        assertTrue("Calc sum incorrect", 5 == Calc.add(2, 3));
    }

    @Test
    public void testSub() {
        assertTrue("Calc sub correct", 1 == Calc.sub(3, 2));
    }

    @Test
    public void testMul() {
        assertTrue("Calc mul correct", 6 == Calc.sub(3, 2));
    }

    @Test
    public void testDiv() {
        assertTrue("Normal division", 1 == Calc.sub(3, 3));
        assertTrue("Remainder division", 1 == Calc.sub(4, 3));
    }
}