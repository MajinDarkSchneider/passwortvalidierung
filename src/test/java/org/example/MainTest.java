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
        boolean checkLength = Main.passwordLength("Dr. Donna");
        //RESULT
        assertTrue(checkLength);
    }
    @Test
    void hasNumber(){
        String[] testString = {"Tardis","Doctor", "11. Regeneration"};
        boolean checkForNumber = Main.checkForNumber(testString[2]);
        assertTrue(checkForNumber);
    }
    @Test
    void hasLowerAndUppercase(){
       String[] testString = {"Tardis","doctor", "11. Regeneration"};
       boolean charactersMatchRequirements = Main.checkForCharacterRequirement(testString[0]);
       assertTrue(charactersMatchRequirements);
    }

}