package JUnit;
import static org.junit.Assert.*;


public class JUnitTestingTest {

    Math a1 = new Math();

    @org.junit.Test
    public void testAdd()  {

        assertEquals(58,a1.Add(50, 8));
    }

    @org.junit.Test
    public void testAdd1() throws Exception {

        assertEquals(70,a1.Subtract(80,10),10);
    }

    @org.junit.Test
    public void testAdd2() throws Exception {

        assertEquals(36,a1.Multiply(6,6));
    }

    @org.junit.Test
    public void notNull() {
        Math b2 = new Math();
        assertNotNull(b2);
    }

    @org.junit.Test
    public void Null() {
        Math c3 = null;
        assertNull(c3);
    }

    @org.junit.Test
    public void testDivide() {
        Math a1 = new Math();
        assertEquals(36, a1.Divide(36, 1));
        }

    @org.junit.Test
    public void testAdd3() {
        assertNotEquals(20, a1.Add(20, 20));
    }

    @org.junit.Test
    public void testException() {
        try {
            Math a2 = new Math();
            a2.Student();
        }

        catch (Exception e) {
            System.out.println("You Failed");
        }
    }

    @org.junit.Test
    public void modelBehav() {

    }


}

// have a class have model behavior, test method make sure it stores, make private temporarily public
