import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RechnerTest {

    @Test
    public void testAddition() {
        assertEquals(100, Rechner.addition(50, 50));
        assertEquals(220, Rechner.addition(190, 30));
        assertEquals(100, Rechner.addition(99, 1));
        assertEquals(100.5, Rechner.addition(50, 50.5));
    }

    @Test
    public void testSubtraktion() {
        assertEquals(10, Rechner.subtraktion(50, 40));
        assertEquals(100, Rechner.subtraktion(250, 150));
        assertEquals(6.4, Rechner.subtraktion(25, 18.6), 0.2);
        assertEquals(345.45, Rechner.subtraktion(500, 154.55));
    }

    @Test
    public void testMultiplikation() {
        assertEquals(25, Rechner.multiplikation(5, 5));
        assertEquals(100, Rechner.multiplikation(50, 2));
        assertEquals(400, Rechner.multiplikation(100, 4));
        assertEquals(30, Rechner.multiplikation(15, 2));

    }

    @Test
    public void testDivision() {
        assertEquals(3, Rechner.division(9, 3));
        assertEquals(12.5, Rechner.division(100, 8));
        assertEquals(62.5, Rechner.division(250, 4));
        assertEquals(252.875, Rechner.division(2023, 8));

    }

}