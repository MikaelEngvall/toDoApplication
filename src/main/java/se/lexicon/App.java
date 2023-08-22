package se.lexicon;

import se.lexicon.model.Person;
import se.lexicon.model.TodoItem;
import se.lexicon.model.TodoItemTask;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Anders", "Loren", "l.v@gmail.com");
        Person person2 = new Person(1, "Mikael", "Engvall", "m.e@gmail.com");
        System.out.println(person1.getSummary());
        TodoItem task1 = new TodoItem(1, "Change tires", "Replace winter tires with summer tires", LocalDate.of(2023, 8, 25), false, person1);
        System.out.println(task1.getSummary());
        System.out.println(task1.isOverdue());
        TodoItemTask itemTask1 = new TodoItemTask(1, true, task1, person2);
        System.out.println(itemTask1.getSummary());













//        List<Person> personList = List.of(person, person1, person2);
//
//        String test = personList.stream()
//                .map(per -> person.getFirstName())
//                .filter(per -> !per.isEmpty())
//                .findFirst()
//                .orElseThrow(() -> new RuntimeException("nope"));
//        System.out.println(test);
    }
}
