package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    void addIntegers(){
        int integerResult = calculator.add(5,6);
        assertEquals(11, integerResult, 0.0001);
    }

    @Test
    void addLongs(){
        long longResult = calculator.add(3000000000L,5000000000L);
        assertEquals(8000000000L, longResult, 0.0001);
    }

    @Test
    void addShorts(){
        short shortResult = calculator.add((short)10000, (short)20000);
        assertEquals(30000, shortResult, 0.0001);
    }

    @Test
    void addFloats(){
        float floatResult = calculator.add(2.00f, 4.00f);
        assertEquals(6.00f, floatResult, 0.0001);
    }

    @Test
    void addDoubles(){
        double doubleResult = calculator.add(2.0, 4.0);
        assertEquals(6.00, doubleResult, 0.0001);
    }

    @Test
    void subtractIntegers(){
        int integerResult = calculator.subtract(5,6);
        assertEquals(-1, integerResult, 0.0001);
    }

    @Test
    void subtractLongs(){
        long longResult = calculator.subtract(3000000000L,5000000000L);
        assertEquals(-2000000000L, longResult, 0.0001);
    }

    @Test
    void subtractShorts(){
        short shortResult = calculator.subtract((short)10000, (short)20000);
        assertEquals(-10000, shortResult, 0.0001);
    }

    @Test
    void subtractFloats(){
        float floatResult = calculator.subtract(2.00f, 4.00f);
        assertEquals(-2.00f, floatResult, 0.0001);
    }

    @Test
    void subtractDoubles(){
        double doubleResult = calculator.subtract(2.0, 4.0);
        assertEquals(-2.00, doubleResult, 0.0001);
    }

    @Test
    void multiplyIntegers(){
        int integerResult = calculator.multiply(5,6);
        assertEquals(30, integerResult, 0.0001);
    }

    @Test
    void multiplyLongs(){
        long longResult = calculator.multiply(30L,50L);
        assertEquals(1500L, longResult, 0.0001);
    }

    @Test
    void multiplyShorts(){
        short shortResult = calculator.multiply((short)10, (short)20);
        assertEquals(200, shortResult, 0.0001);
    }

    @Test
    void multiplyFloats(){
        float floatResult = calculator.multiply(2.00f, 4.00f);
        assertEquals(8.00f, floatResult, 0.0001);
    }

    @Test
    void multiplyDoubles(){
        double doubleResult = calculator.multiply(2.0, 4.0);
        assertEquals(8.00, doubleResult, 0.0001);
    }

    @Test
    void divideIntegers(){
        int integerResult = calculator.divide(2, 1);
        assertEquals(2, integerResult, 0.0001);
    }

    @Test
    void divideLongs(){
        long longResult = calculator.divide(2L, 1L);
        assertEquals(2L, longResult, 0.0001);
    }

    @Test
    void divideShorts(){
        short shortResult = calculator.divide((short)2, (short)1);
        assertEquals(2, shortResult, 0.0001);
    }

    @Test
    void divideFloats(){
        float floatResult = calculator.divide(2.0f, 1.0f);
        assertEquals(2f, floatResult, 0.0001);
    }

    @Test
    void divideDoubles(){
        double doubleResult = calculator.divide(10.0, 2.0);
        assertEquals(5.0, doubleResult, 0.0001);
    }
 
    @Test
    void shouldReturnErrorWhenDividingByZero(){
        ArithmeticException thrown = assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10, 0)
        );

        assertEquals("Cannot divide by zero.", thrown.getMessage());
    }

}