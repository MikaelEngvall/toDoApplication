package se.lexicon.TodoIT_assignment;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import se.lexicon.TodoIT_assignment.model.Person;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonTest {
    @Test
    @DisplayName("Testing the overridden equals() method")
    public void testEquals() {
        Person person1 = new Person(1,"Mikael", "Engvall", "m.e@gmail.com");
        Person person2 = new Person(1,"Mikael", "Engvall", "m.e@gmail.com");
        assertTrue(person1.equals(person2));
    }
    @Test
    @DisplayName("Testing the overridden hashCode() method")
    public void testHashCode() {
        Person person1 = new Person(1,"Mikael", "Engvall", "m.e@gmail.com");
        Person person2 = new Person(1,"Mikael", "Engvall", "m.e@gmail.com");
        assertEquals(person1.hashCode(), person2.hashCode());
    }


    @Test
    public void testGetSummary() {
        Person person = new Person(1, "John", "Doe", "john@example.com");
        String expectedSummary = "{id: 1, firstName: John, lastName: Doe, email: john@example.com}";
        assertEquals(expectedSummary, person.getSummary());
    }
}
