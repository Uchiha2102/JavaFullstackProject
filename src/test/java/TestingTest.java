import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingTest {


    @Test
    void add_expectThirty_whenAPlusBEqualsThirty() {
        int A = 10;
        int B = 20;
        int expected = 30;
        int actual = Testing.add(A, B);
        assertEquals(expected, actual);
    }

    @Test
    void testNumEven() {
        int num = 2;
        boolean actual = Testing.numEven(num);
        assertTrue(actual);
    }
        @Test
        void product_expectFifty_whenAIsTenAndBIsFive(){
            int a = 10;
            int b = 5;
            int expected = 50;
            int actual = Testing.product(a,b);
            assertEquals(expected,actual);

        }
    @Test
    void testhelloWorld(){
        String a = "Hello";
        String expected = "HELLO";
        String result = Testing.helloWorld(a);
        assertEquals(expected,result);
    }
    @Test
    void testPositiveNumber(){
    int number = 1;
    boolean result = Testing.positive(number);
    assertTrue(result);
}

@Test
    void testNegativeNumber(){
        int number = -1;
        boolean result = Testing.positive(number);
        assertFalse(result);
}
    }
