package org.example;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class CalculateTest {


     private static Calculate calculate;

     @BeforeAll
     static void setUpAll() {
     calculate = new Calculate();
     }

     @AfterAll
     static void tearDownAll() {
     calculate = null;
     }

     @Test
     void givenNumbersThenReturnSum() {
     int res = calculate.addSum(10, 15);
     assertEquals(25, res);
     }

     @Test
     void givenEvenNumberThenReturnTrue() {
     boolean res = calculate.isEven(22);
     assertTrue(res);
     }

     @Test
     void givenOddNumberThenReturnFalse() {
     boolean res = calculate.isEven(7);
     assertFalse(res);
     }

    }



