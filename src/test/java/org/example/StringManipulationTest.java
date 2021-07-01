package org.example;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulationTest {
    private static StringManipulation stringManipulation;

    @BeforeAll
    static void setUpAll() {
        stringManipulation= new StringManipulation();
    }

    @AfterAll
    static void tearDownAll() {
        stringManipulation = null;
    }
    @Test
    void givenVowelStringReturnVowelCount() {
        int result = stringManipulation.vowelCount("Jay Prakash Mahto");
        assertEquals(5, result);
    }

    @Test
    void givenStringReturnCharacterCount() {
        int result = stringManipulation.characterCount("Jay Prakash Mahto");
        assertEquals(17, result);
    }

}