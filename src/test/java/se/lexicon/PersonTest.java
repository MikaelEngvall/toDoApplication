package se.lexicon;

import org.junit.Test;
import se.lexicon.model.Person;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void testCreatePerson() {
        Person person = new Person(1, "John", "Doe", "john@example.com");
        assertEquals(1, person.getId());
        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
        assertEquals("john@example.com", person.getEmail());
    }

    @Test
    public void testSetFirstName() {
        Person person = new Person(1, "John", "Doe", "john@example.com");
        person.setFirstName("Alice");
        assertEquals("Alice", person.getFirstName());
    }
    @Test
    public void testGetSummary() {
        Person person = new Person(1, "John", "Doe", "john@example.com");
        String expectedSummary = "{id: 1, firstName: John, lastName: Doe, email: john@example.com}";
        assertEquals(expectedSummary, person.getSummary());
    }
}
