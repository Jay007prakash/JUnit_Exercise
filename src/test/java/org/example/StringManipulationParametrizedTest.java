package org.example;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class StringManipulationParametrizedTest {
    private static StringManipulation stringManipulation;
    @BeforeAll
    static void setUpAll() {
        stringManipulation= new StringManipulation();
    }

    @AfterAll
    static void tearDownAll() {
        stringManipulation = null;
    }
    @ParameterizedTest
    @CsvSource({"Jay,1","Prakash,2","Mahto,2"})
    void givenVowelStringReturnVowelCount(String s,int n1) {
        int result = stringManipulation.vowelCount(s);
        assertEquals(n1, result);
    }
    @ParameterizedTest
    @CsvSource({"jay,3","Prakash,7","Mahto,5"})
    void givenStringReturnCharacterCount(String s,int n1) {
        int result = stringManipulation.characterCount(s);
        assertEquals(n1, result);
    }
}
