package se.lexicon.TodoIT_assignment.model;

import java.time.LocalDate;

import static se.lexicon.TodoIT_assignment.util.ValidatorsUtil.validateStringNotEmpty;

public class TodoItem {
    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    //    Methods
    public String getSummary() {
        return String.format("Task id: %s, task: %s, description: %s, Created by : %s, %s, %s",
                id, title, taskDescription, creator.getFirstName(), creator.getLastName(), creator.getEmail());
    }

    public boolean isOverdue() {
        LocalDate currentDate = LocalDate.now();
        return !done && deadLine.isBefore(currentDate);
    }

    //    Constructors
    public TodoItem(int id, String title, String taskDescription, LocalDate deadLine, boolean done, Person creator) {
        validateStringNotEmpty(title);
        validateStringNotEmpty(taskDescription);
        this.id = id;
        this.title = title;
        this.taskDescription = taskDescription;
        this.deadLine = deadLine;
        this.done = done;
        this.creator = creator;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }
}
