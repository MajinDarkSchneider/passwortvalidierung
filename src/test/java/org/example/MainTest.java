package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void strLength(){
        int length = Main.stringLength("Tardis");
        assertEquals(6, length);
    }
    @Test
    void pwdLaenge(){
        //WHEN
        //THEN
        boolean checkLength = Main.passwordLength("Tardis");
        //RESULT
        assertTrue(checkLength);
    }

}