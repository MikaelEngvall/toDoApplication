package se.lexicon.TodoIT_assignment;

import org.junit.Test;
import se.lexicon.TodoIT_assignment.util.ValidatorsUtil;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ValidatorsUtilTest {

    @Test
    public void testValidateStringNotEmptyWithNonEmptyString() {
        String nonEmptyString = "Hello, world!";
        assertDoesNotThrow(() -> ValidatorsUtil.validateStringNotEmpty(nonEmptyString));
    }


    @Test
    public void testValidateStringNotEmptyWithEmptyString() {
        String emptyString = "";
        RuntimeException exception = assertThrows(RuntimeException.class,
                () -> ValidatorsUtil.validateStringNotEmpty(emptyString));
        assertEquals("Empty not allowed", exception.getMessage());
    }

}