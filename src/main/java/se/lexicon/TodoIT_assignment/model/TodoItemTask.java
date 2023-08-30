package se.lexicon.TodoIT_assignment.model;

public class TodoItemTask {
    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    // Methods
    public String getSummary() {
        return String.format("id: %s, task: %s, description: %s, Assigned to : %s, %s, %s",
                id, todoItem.getTitle(), todoItem.getTaskDescription(), assignee.getFirstName(), assignee.getLastName(), assignee.getEmail());
    }

    // Constructors
    public TodoItemTask(int id, boolean assigned, TodoItem todoItem, Person assignee) {
        this.id = id;
        this.assigned = assigned;
        this.todoItem = todoItem;
        this.assignee = assignee;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }
}
