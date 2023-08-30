package se.lexicon.TodoIT_assignment;

import org.junit.Test;
import se.lexicon.TodoIT_assignment.model.TodoItem;
import se.lexicon.TodoIT_assignment.model.TodoItemTask;
import se.lexicon.TodoIT_assignment.model.Person;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class TodoItemTaskTest {
    @Test
    public void testGetSummary() {
        Person assignee = new Person(2, "Alice", "Johnson", "alice@example.com");
        TodoItem todoItem = new TodoItem(1, "Change tires", "Replace winter tires with summer tires",
                LocalDate.of(2023, 8, 25), false, new Person(1, "John", "Doe", "john@example.com"));
        TodoItemTask todoItemTask = new TodoItemTask(1, true, todoItem, assignee);

        String expectedSummary = "id: 1, task: Change tires, description: Replace winter tires with summer tires, " +
                "Assigned to : Alice, Johnson, alice@example.com";
        assertEquals(expectedSummary, todoItemTask.getSummary());
    }
}
