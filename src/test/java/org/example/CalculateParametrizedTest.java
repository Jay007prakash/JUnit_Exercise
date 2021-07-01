package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


public class CalculateParametrizedTest {
    private static Calculate calculateParametrizedTest;
    @BeforeAll
    static void setUpAll() {
        calculateParametrizedTest= new Calculate();
    }

    @AfterAll
    static void tearDownAll() {
        calculateParametrizedTest = null;
    }
    @ParameterizedTest
    @CsvSource({"2,2,4","34,-32,2","-3,-5,-8"})
    void givenNumbersThenReturnSum(int n1,int n2,int expected) {
        int res = calculateParametrizedTest.addSum(n1, n2);
        assertEquals(expected, res);
    }
    @ParameterizedTest
    @CsvSource({"2","4","6","30","68"})
    void givenEvenNumberThenReturnTrue(int num1) {
        boolean res = calculateParametrizedTest.isEven(num1);
        assertTrue(res);

    }
    @ParameterizedTest
    @CsvSource({"3","11","15","21","61"})
    void givenOddNumberThenReturnFalse(int num1) {
        boolean res = calculateParametrizedTest.isEven(num1);
        assertFalse(res);

    }


}
