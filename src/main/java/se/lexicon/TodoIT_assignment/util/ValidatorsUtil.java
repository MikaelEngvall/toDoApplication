package se.lexicon.TodoIT_assignment.util;


public class ValidatorsUtil {

    public static void validateStringNotEmpty(String value){
        if (value.isEmpty()) {
            throw new RuntimeException("Empty not allowed");
        }
    }

}
