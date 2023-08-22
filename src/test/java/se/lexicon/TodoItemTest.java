package se.lexicon;

import org.junit.Test;
import se.lexicon.model.Person;
import se.lexicon.model.TodoItem;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class TodoItemTest {
    @Test
    public void testIsOverdueWithFutureDeadline() {
        LocalDate futureDeadline = LocalDate.of(2023, 8, 25);
        TodoItem todoItem = new TodoItem(1, "Change tires", "Replace winter tires with summer tires",
                futureDeadline, false, new Person(1, "John", "Doe", "john@example.com"));

        assertFalse(todoItem.isOverdue());
    }

    @Test
    public void testIsOverdueWithPastDeadline() {
        LocalDate pastDeadline = LocalDate.of(2021, 1, 1);
        TodoItem todoItem = new TodoItem(1, "Expired task", "This task is overdue",
                pastDeadline, false, new Person(1, "John", "Doe", "john@example.com"));

        assertTrue(todoItem.isOverdue());
    }

    @Test
    public void testGetSummary() {
        TodoItem todoItem = new TodoItem(1, "Change tires", "Replace winter tires with summer tires",
                LocalDate.of(2023, 8, 25), false, new Person(1, "John", "Doe", "john@example.com"));

        String expectedSummary = "Task id: 1, task: Change tires, description: Replace winter tires with summer tires, " +
                "Created by : John, Doe, john@example.com";
        assertEquals(expectedSummary, todoItem.getSummary());
    }
}

